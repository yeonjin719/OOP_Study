import java.util.Scanner;

public class W4Coffee {
    static class Coffee {
        String origin;
        String grade;
        int degreeOfRoast;

        void roast(int n) {
            System.out.printf("roasting... %s %s\n", origin, grade);
            degreeOfRoast = n;
            grind();
        }

        void grind() {
            System.out.printf("grinding... degree of roast is %d\n", degreeOfRoast);
            brew();
        }

        void brew() {
            System.out.print("brewing..."+"\n");
        }

        Coffee(String origin, String grade) {
            this.origin = origin;
            this.grade = grade;
        }
    }


    public static void main(String[] args) {
        Coffee coffee = new Coffee("Kenya", "AA");
        coffee.roast(10);
    }
}
