import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(2, 3));   // Perimeter = 10
        rectangles.add(new Rectangle(3, 4));   // Perimeter = 14
        rectangles.add(new Rectangle(1, 6));   // Perimeter = 14
        rectangles.add(new Rectangle(5, 1));   // Perimeter = 12
        rectangles.add(new Rectangle(2, 2));   // Perimeter = 8
        rectangles.add(new Rectangle(4, 4));   // Perimeter = 16
        rectangles.add(new Rectangle(3, 3));   // Perimeter = 12
        rectangles.add(new Rectangle(1, 1));   // Perimeter = 4
        rectangles.add(new Rectangle(7, 3));   // Perimeter = 20
        rectangles.add(new Rectangle(2, 5));   // Perimeter = 14

        Filter bigRectangleFilter = new BigRectangleFilter();

        List<Rectangle> bigRectangles = collectAll(rectangles, bigRectangleFilter);

        for (Rectangle rectangle : bigRectangles) {
            System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight() +
                    ", Perimeter: " + (2 * (rectangle.getWidth() + rectangle.getHeight())));
        }
    }

    public static List<Rectangle> collectAll(List<Rectangle> collection, Filter filter) {
        List<Rectangle> filteredList = new ArrayList<>();
        for (Rectangle rectangle : collection) {
            if (filter.accept(rectangle)) {
                filteredList.add(rectangle);
            }
        }
        return filteredList;
    }
}
