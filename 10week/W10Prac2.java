public class W10Prac2 {
    public static class CoffeeBean {
        String species = "Coffee";
        void print() {
            System.out.println(species);
        }
        void setSpecies(String s) {
            species = s;
        }
    }
    public static class Arabica extends CoffeeBean {
        @Override
        void print() {
            super.print();
            System.out.println("Arabica coffee...");
        }
        void print(String s) {
            System.out.printf("%s: %s\n", species, s);
        }
    }

    public static class Robusta extends CoffeeBean {
        String species = "Robusta";
    }

    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        Arabica a = new Arabica();
        Robusta r = new Robusta();
//        System.out.println("c의 클래스는: " + c.getClass());
//        System.out.println("a의 클래스는: " + a.getClass());
//        System.out.println("r의 클래스는: " + r.getClass());
        a.print();
        a.print("test");
    }
}
