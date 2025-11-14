public class W11Prac3 {
    public static void main(String[] args) {
        ARectangle r = new ARectangle(20.0, 10.0);
        ACircle c = new ACircle(10);
        System.out.printf("사각형의 면적: %.2f\n", r.getArea());
        System.out.printf("사각형의 둘레: %.2f\n", r.getPerimeter());
        System.out.printf("원의 면적: %.2f\n", c.getArea());
        System.out.printf("원의 둘레: %.2f\n", c.getPerimeter());
    }
}
abstract class AbstractShape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class ARectangle extends AbstractShape {
    private double width, height;
    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2* (width + height);
    }
}

class ACircle extends AbstractShape {
    private double radius;
    public ACircle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}