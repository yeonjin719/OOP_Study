public class W10Prac1 {
    static class Parent {
       private String name;
       public Parent(String n) {
           System.out.println("Parent constructor");
           name = n;
       }
       public Parent() {
           System.out.println("Default Parent constructor");
           name = null;
       }
       public String getName() {return name;}
        public void setName(String n) {name = n;}
    }
    static class Child extends Parent {
        private int value;
        public Child(String n, int v) {
            super(n);
            System.out.println("Child constructor");
            value =v;
        }
        public int getValue() {return value;}
        public void setValue(int v) {value =v;}
    }

    public static void main(String[] args) {
        Parent p = new Parent("parent");
        Child c = new Child("child", 0);
        System.out.println(c.getName());
        System.out.println(c.getValue());
        Child derived = new Child("child", 0);
        Parent base = derived;
        System.out.println(base.getName());
//        System.out.println(base.getValue());  에러가 발생함
        Child derived3 = (Child) base;
        System.out.println(derived3.getValue());
        System.out.printf("derived instanceof Child: %s\n", derived instanceof Child);

    }
}
