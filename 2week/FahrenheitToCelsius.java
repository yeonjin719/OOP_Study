import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = ((float)5/9)*(fahrenheit-32);
        System.out.printf("Celsius: %.1f" , celsius);
    }
}