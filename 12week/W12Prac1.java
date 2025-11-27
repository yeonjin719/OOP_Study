import java.util.ArrayList;

public class W12Prac1 {
    public static void main(String[] args) {
        W12Number s = new W12Number(0, 100);
        s.setNumber();
        System.out.printf("\nSum: %d", s.sumList());

    }
}

class W12Number {
    private final ArrayList<Integer> numList = new ArrayList<Integer>();
    int max;
    int min;

    W12Number(int minNum, int maxNum) {
        this.max = maxNum;
        this.min = minNum;
    }

    public void setNumber() {
        for (int i = min; i <= max; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                numList.add(i);
            }
        }
    }

    public int sumList() {
        int sum = 0;
        for (int i:  numList) {
            System.out.print(i + " ");
            sum += i;
        }
        return sum;
    }

}