import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class W13Prac3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("13week/hello.txt");
        BufferedReader f = new BufferedReader(fr);
        int data;

        while ((data = f.read()) != -1) {
            char ch = Character.toLowerCase((char) data);
            System.out.print(ch);
        }
        f.close();
    }
}
