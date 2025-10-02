public class W4Hello {
    static class Hello {
        void setWhom(String toWhom) {
            this.toWhom = toWhom;
        }
        String getWhom() {return toWhom;}
        String toWhom = "world";

        void w4sayHello() {
            System.out.print("hello " + toWhom+"\n");
        }

        Hello() {
            System.out.println("기본 생성자가 호출됨");
        }

        Hello(String whom) {
            System.out.println("문자열 인자를 받는 생성자가 호출됨");
            toWhom = whom;
        }

        void print() { this.w4sayHello();}
    }
    public static void main(String[] args) {
//        Hello[] helloList = new Hello[3];
//        helloList[0] = new Hello();
//        helloList[1] = new Hello("홍길동");
//        helloList[2] = new Hello("허균");
//
//        helloList[0].w4sayHello();
//        helloList[1].w4sayHello();
//        helloList[2].w4sayHello();
//        System.out.print("++++++++++ 기본 생성자 ++++++++++");
//        Hello h = new Hello();
//        h.w4sayHello();
//        System.out.print("\n\n");
//        System.out.print("++++++++++ 생성자 오버로딩 ++++++++++");
//        Hello h2 = new Hello("Kim");
//        h2.toWhom = "jsl";
//        h2.w4sayHello();
//        h2.print();
        Hello arr[] = new Hello[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Hello();
        }
        String whom[] = {"ycho", "jsl","everyone"};
        int index = 0;
        for (Hello a : arr) {
            a.setWhom(whom[index]);
            index++;
        }
        for (Hello a : arr) {
            a.w4sayHello();
        }
    }
}

