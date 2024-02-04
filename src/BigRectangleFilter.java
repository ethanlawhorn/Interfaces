import java.util.ArrayList;

public class BigRectangleFilter {
    double width;
    double height;

    public static void collectAll(ArrayList<Object> rects, Filter f) {
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public BigRectangleFilter(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public String toString()
    {
        return "Width: "+width+" Height: "+height;
    }

}
