import java.util.HashMap;
import java.util.Map;

public class W12Prac2 {
    public static void main(String[] args) {
        TestCountChars tcc = new TestCountChars("sangmyung university");
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);

    }
}


class TestCountChars {
    String str;
    TestCountChars(String s) {str = s;}

    Map<Character, Integer> countChars() {
        char[] charsArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charsArray) {
            if (c >= 'a' && c <= 'z') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else  {
                    map.put(c, 1);
                }
            }

        }
        return map;
    }
}