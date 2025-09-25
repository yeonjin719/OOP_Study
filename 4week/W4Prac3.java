import java.util.Objects;
import java.util.Scanner;

public class W4Prac3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("종료를 원하시면 \"종료\"를 입력해주세요\n");
            String input = scanner.nextLine();
            if (Objects.equals(input, "종료")) {
                break;
            }
            if (Objects.equals(input, "prime")) {
                System.out.print("prime 좌석의 가격은 11000원 입니다.\n");
            } else if (Objects.equals(input, "standard")){
                System.out.print("standard 좌석의 가격은 10000원 입니다.\n");
            } else if (Objects.equals(input, "economy")){
                System.out.print("economy 좌석의 가격은 9000원 입니다.\n");
            } else {
                System.out.printf("%s라는 좌석은 존재하지 않습니다.\n", input);
            }
        }
    }
}
