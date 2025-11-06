public class W10Prac3 {
    static class Turtle {
        private int limbs = 4;
        protected String food;
        public void setFood(String f) {
            this.food = f;
        }
        public void eat() {
            System.out.println("Turtle eats "+ food);
        }
        public void printLimbs() {
            System.out.println("Turtle prints limbs: "+limbs);
        }
    }
    static class SeaTurtle extends Turtle {
        public void swim() {
            System.out.println("A sea turtle swims...");
        }
    }
    static class LandTurtle extends Turtle {
        public void walk() {
            System.out.println("A land turtle walks...");
        }
    }

    public static void main(String[] args) {
        SeaTurtle seaTurtle = new SeaTurtle();
        LandTurtle landTurtle = new LandTurtle();
        seaTurtle.printLimbs();
        landTurtle.printLimbs();
    }
}
