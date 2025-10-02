import java.util.Scanner;

public class W5Assignment7 {
    public static void main(String[] args) {
        int num;
        do {
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num == 0) {
                continue;
            }
            System.out.printf("입력하신 정수는 %d 입니다.\n", num);
        } while (num < 100);


    }
}
