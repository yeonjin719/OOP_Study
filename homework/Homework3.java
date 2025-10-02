import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = "\\s";
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = input.nextInt();
        input.nextLine();
        int[] numArray = new int[n];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = input.nextInt();
        }
        int min = numArray[0];
        int max = numArray[0];

        for (int i = 1; i < n; i++) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d", min);

    }
}
