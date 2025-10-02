import java.util.Scanner;

//        int Cup1=10;
//        int Cup2=50;
//        do {
//            Cup1 = Cup1 +10;
//            System.out.printf("현재 Cup1의 물 양: %d\n", Cup1);
//        } while (Cup1 < Cup2);

//        Scanner scanner = new Scanner(System.in);
//        char ch;
//        do {
//            ch = scanner.next().charAt(0);
//            if (ch!= 'n'){
//              System.out.println(ch);
//            } else {
//                break;
//            }
//       } while (true);
public class W5Prac1 {
    public static void main(String[] args) {
        int i=3;
        while (i < 7) {
            System.out.printf("if 전: i = %d\n", i);
            if (i < 7) {
                i += 2;
                System.out.printf("continue 전: i = %d\n", i);
                continue;
            }
            System.out.println("이건 출력되면 안됨!");
        }
        System.out.printf("i=%d, 이건 출력됨\n", i);
    }
}
