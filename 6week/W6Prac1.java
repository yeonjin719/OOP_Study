import java.util.Scanner;

public class W6Prac1 {
    static class IntNumClass {
        int num;
        Scanner sc;
        IntNumClass(Scanner scanner) {this.sc = scanner;}

        boolean isBetween(int n, int m) {
            if (n < m) {
                return num >= n && num <= m ? true: false;
            } else {
                return num >= m && num <= n ? true: false;
            }
        }
        void setNum() {
            System.out.print("정수를 입력하세요: ");
            num = sc.nextInt();
        }
        void printNum() {
            System.out.printf("%d", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntNumClass intNumClass = new IntNumClass(scanner);
        intNumClass.setNum();

        if (intNumClass.isBetween(1, 100)) {
            intNumClass.printNum();
        } else {
            System.out.print("1~100 범위 밖 정수가 입력되었습니다.");
        }

    }
}
