import java.util.*;
import java.io.*;
public class W13Prac6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("13week/numbers.txt"))) {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("파일이 존재하지 않거나 데이터가 정수값이 아니거나, 데이터가 없습니다.");
        }
    }
}
