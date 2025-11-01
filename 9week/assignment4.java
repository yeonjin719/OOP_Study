import java.time.LocalDateTime;

public class assignment4 {

    // 고객
    static class Customer {
        private final String name;
        private final String phNo;
        private int visit = 0;

        Customer(String name, String phNo) {
            this.name = name;
            this.phNo = phNo;
        }
        public String getName() { return name; }
        public String getPhNo() { return phNo; }
        public int getVisit() { return visit; }
        int increaseVisit() { return ++visit; }
        void resetVisit() { visit = 0; }
    }

    // 커피
    static class Coffee {
        private final String name;
        private final int price;
        Coffee(String name, int price) {
            this.name = name;
            this.price = price;
        }
        String getName() { return name; }
        int getPrice() { return price; }
    }

    // 주문
    static class Order {
        static final int MAX_VISIT = 10;
        Customer customer;
        LocalDateTime orderDateTime;
        Coffee coffee;
        int quantity;

        // 체이닝 가능하게 this 반환
        Order takeOrder(Customer customer, Coffee coffee, int quantity) {
            this.customer = customer;
            this.coffee = coffee;
            this.quantity = quantity;
            this.orderDateTime = LocalDateTime.now();
            return this;
        }

        // 10, 20, ...번째 방문이면 무료
        int charge() {
            int v = customer.increaseVisit();
            if (v % MAX_VISIT == 0) {
                customer.resetVisit(); // 다음 카운트 새로 시작
                return 0;
            }
            return quantity * coffee.getPrice();
        }
    }

    // 매장
    static class CoffeeHouse {
        static final int MAX_ORDER = 100;
        private final String name;
        private final String phoneNo;
        private final String address;
        private int nLike;
        private final Order[] orders = new Order[MAX_ORDER];
        private int nOrder = 0;

        CoffeeHouse(String name, String phone, String addr) {
            this.name = name;
            this.phoneNo = phone;
            this.address = addr;
        }

        public String getName() { return name; }
        public String getAddress() { return address; }
        public String getPhoneNo() { return phoneNo; }
        public int getLike() { return nLike; }
        public int increaseLike() { return ++nLike; }

        public void addOrder(Order order) {
            if (nOrder < MAX_ORDER) {
                orders[nOrder++] = order;
            } else {
                System.out.println("현재 주문이 많아 주문을 할 수 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        CoffeeHouse starbucks = new CoffeeHouse("스타벅스", "02-000-0000", "서울시 강남구");
        Customer c1 = new Customer("kim", "010-0000-0000");
        Coffee americano = new Coffee("아메리카노", 4500);

        // 10번 주문 시 10번째가 무료인지 확인용 데모
        for (int i = 1; i <= 10; i++) {
            Order order = new Order().takeOrder(c1, americano, 1);
            int price = order.charge();
        }
    }
}