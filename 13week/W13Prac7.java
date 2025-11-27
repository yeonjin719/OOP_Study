import java.util.ArrayList;

public class W13Prac7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        int index = 0;
        for (int i=0; i<8; i++)  {
            try {
                int n = list.get(index++);
                System.out.println(n);
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("인덱스 %d가 범위를 넘어섰습니다", index);
                break;
            }
        }
    }
}
