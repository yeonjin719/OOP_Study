public class W11Prac1 {
    public static void main(String[] args) {
        IShape r = new RectangleImpl(10., 20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}
class W11Rectangle {
    protected double width;
    protected double height;
    public W11Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}

interface IShape {
    public double getArea();
    double getPerimeter();
}
class RectangleImpl extends W11Rectangle implements IShape {
    public RectangleImpl(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}