public class W6Prac3 {
    static class Num {
        int num = 0;
        void sum(int n) {
            num += n;
        }
        void printNum() {
            System.out.printf("%d\n", num);
        }

        void numFlag(int n) {
            if (n <= 50) {
                return;
            }
            else if (n > 100) {
                sum(n);
            }
            printNum();
        }

    }
    public static void main(String[] args) {
        Num newNum = new Num();
        newNum.numFlag(101);
        newNum.numFlag(51);
        newNum.numFlag(50);
        newNum.printNum();

    }
}
