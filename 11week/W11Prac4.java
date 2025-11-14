public class W11Prac4 {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        System.out.println("Shape1 Tag: "+s1);
        ShapeTag s2 = new ShapeTag("shape2");
        System.out.println("Shape2 Tag: "+s2);
        RectangleTag r = new RectangleTag("shape", "rectangle");
        System.out.println("Rectangle Tags: "+r);
        CircleTag c = new CircleTag("shape", "circle");
        System.out.println("Circle Tags: "+c);
    }
}

class ShapeTag {
    public String tag;
    public ShapeTag(String tag) {
        this.tag = tag;
    }
    public String toString() {
        return "#"+tag;
    }
}

class RectangleTag extends ShapeTag {
    private String rectangleTag;
    public RectangleTag(String tag, String rectangleTag) {
        super(tag);
        this.rectangleTag = rectangleTag;
    }
    public String getRectangleTag() {
        return rectangleTag;
    }

    @Override
    public String toString() {
        return "#"+rectangleTag+" "+super.toString();
    }
}

class CircleTag extends ShapeTag {
    private String circleTag;
    public CircleTag(String tag, String circleTag) {
        super(tag);
        this.circleTag = circleTag;
    }
    public String getCircleTag() {
        return circleTag;
    }
    @Override
    public String toString() {
        return "#"+circleTag+" "+super.toString();
    }
}