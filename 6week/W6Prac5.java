public class W6Prac5 {
    static long getSum(int a, int b) {
        if (b == 100) return a + b;
        return getSum(a+b, b+1);
    }
    public static void main(String[] args) {
        long answer = getSum(0, 1);
        System.out.print("1부터 100까지의 합을 구하는 재귀호출!\n");
        System.out.printf("합은 %d입니다!", answer);
    }
}
