import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            answer += num;
            System.out.println("현재까지 입력된 정수의 합은 " + answer+"입니다.");
        }
    }
}
