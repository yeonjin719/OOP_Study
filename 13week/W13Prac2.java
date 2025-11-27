import java.io.File;
import java.util.Scanner;

public class W13Prac2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("13week/hello.txt"));
            while (sc.hasNext()) { // 파일에 데이터가 남았는지 확인
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
