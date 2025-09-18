public class InitializeTest2 {
    String s;

    void printString() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        InitializeTest2 s = new InitializeTest2();
        s.printString();
    }

//    public static void main(String[] args) {
//        String s;
//        System.out.println(s);
//    }
}
