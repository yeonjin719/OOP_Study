import java.lang.*;

public class W5Prac2 {
    public static void main(String[] args) {
        String str = "하느님이 보우하사";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        String[] tokensVal = str.split(delimiters);
        System.out.println("Count of tokens = " + tokensVal.length);
        for (String token: tokensVal) {
            System.out.println(token);
        }
    }
}
