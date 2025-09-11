import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int N = inputReader.nextInt();
        int totalScore = 0;
        for (int i=0; i<N; i++){
            totalScore += inputReader.nextInt();
        }
        double avg = (double) totalScore/N;
        System.out.printf("%.2f\n", avg);
    }
}
