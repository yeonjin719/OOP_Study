public class W10Prac5 {
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
    static class Circle {
        private double radius;
        private Point center;
        public Circle(Point c, double radius) {
            this.center = c;
            this.radius = radius;
        }
        public Circle(int x, int y, double radius) {
            Point new_c = new Point(x, y);
            this.center = new_c;
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
        Point center = new Point(1, 2);
        Circle circle1 = new Circle(center, 3);
        Circle circle2 = new Circle(1, 2, 3);
        System.out.println("circle1:");
        System.out.printf("원 면적: %.2f\n", circle1.getArea());
        System.out.printf("원 둘레: %.2f\n", circle1.getCircumference());
        System.out.println();
        System.out.println("circle2:");
        System.out.printf("원 면적: %.2f\n", circle2.getArea());
        System.out.printf("원 둘레: %.2f\n", circle2.getCircumference());
    }
}

