public class Main {
    public static void main(String[] args) {
        smartPhone phone = new smartPhone();
        phone.ManufactureFirmName = "Samsung";
        phone.Battery=95;
        phone.ModelName="galaxy";
        phone.charge(1);
        System.out.println(phone.Battery);
    }
}