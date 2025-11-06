public class W10Prac4 {
    static class Point {
        private int x;
        private int y;
        public Point() {

        }
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public String toString() {
            return "(" + x + "," + y + ")";
        }

    }
    static class Circle extends Point {
        private double radius;
        public Circle(int x, int y, double radius) {
            super(x, y);
            this.radius = radius;

        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        System.out.println(circle.toString());
        System.out.println("원 면적: "+circle.getArea());
        System.out.println("원 둘레: "+circle.getCircumference());
    }
}

