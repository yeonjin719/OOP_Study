public class W6Prac4 {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
    String add(String a, String b) {
        return a + ' ' + b;
    }
    public static void main(String[] args) {
        W6Prac4 test = new W6Prac4();
        int newInt = test.add(1, 2);
        double newDouble = test.add(1.1, 2.5);
        String newString = test.add("안녕","반가워");
        System.out.printf("newInt: %d\n", newInt);
        System.out.printf("newDouble: %f\n", newDouble);
        System.out.printf("newString: %s", newString);
    }

}
