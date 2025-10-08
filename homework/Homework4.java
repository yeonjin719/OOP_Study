import java.util.Scanner;

public class Homework4 {
    static int gcd(int n, int m) {
        if (m == 0) return n;
        int new_n = n > m ? m : n;
        int new_m = n > m ? n%m : m%n;
        return gcd(new_n, new_m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = gcd(n, m);
        System.out.printf("두 수의 최대공약수는 %d입니다.", answer);
    }
}
