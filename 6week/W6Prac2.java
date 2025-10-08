import java.util.Scanner;

public class W6Prac2 {
    boolean isSmall(int n) {
        return n<100 ? true: false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        W6Prac2 isSmallThan100 = new W6Prac2();
        boolean check = isSmallThan100.isSmall(num);
        System.out.printf("%s", check);
    }
}
