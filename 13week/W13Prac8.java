public class W13Prac8 {
    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine(15);

        try {
            coffee.brew();
            coffee.brew(); // 예외 발생
        }
        catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
class NoCoffeeException extends Exception{
    public NoCoffeeException(String e) {
        super(e);
    }
    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
class CoffeeMachine {
    private int amountOfCoffeeBeans;

    public CoffeeMachine(int beans) { amountOfCoffeeBeans = beans; }
    public int getAmountOfCoffeeBeans() { return amountOfCoffeeBeans; }
    public void addCoffeeBeans(int beans) {
        amountOfCoffeeBeans += beans;
    }
    public void brew() throws NoCoffeeException {
        if (amountOfCoffeeBeans < 10) {
            throw new NoCoffeeException("No Coffee Exception...");
        }
        System.out.println("Brewing...");
        amountOfCoffeeBeans -= 10;
    }
}
