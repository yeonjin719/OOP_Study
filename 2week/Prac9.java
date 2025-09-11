import java.util.Scanner;

public class Prac9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("첫 번쨰 문자열: "+s);
        int n = sc.nextInt();
        System.out.println("출력 정수: "+n);
        String s1 = sc.nextLine();
        System.out.println("나머지 문자열: "+s1);

        String numStr = sc.next();
        float num1 = Float.parseFloat(numStr);
        numStr = sc.next();
        float num2 = Float.parseFloat(numStr);
        System.out.printf("합계: %.1f\n", num1+num2);

        String numStr1 = sc.next();
        float num3 = sc.nextFloat();
        numStr = sc.next();
        float num4 = Float.parseFloat(numStr);
        System.out.printf("합계: %.1f\n", num3+num4);

    }
}
