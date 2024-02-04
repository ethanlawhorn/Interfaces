import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {
        ArrayList<Object> rects=new ArrayList<Object> ();

        rects.add(new Rectangle(1,1));
        rects.add(new Rectangle(2,1));
        rects.add(new Rectangle(3,8));
        rects.add(new Rectangle(4,1));
        rects.add(new Rectangle(1,2));
        rects.add(new Rectangle(1,3));
        rects.add(new Rectangle(1,4));
        rects.add(new Rectangle(2,2));
        rects.add(new Rectangle(3,4));
        rects.add(new Rectangle(6,5));
        System.out.println("Rectangles Before applying filter: ");
        for(Object o:rects)
        {
            Rectangle r=(Rectangle)o;
            System.out.println(r);
        }
        Filter f = null;
        BigRectangleFilter.collectAll(rects,f);

        System.out.println("Rectangles after applying filter: ");
        for(Object o:rects)
        {
            Rectangle r=(Rectangle)o;
            System.out.println(r);
        }

    }

}