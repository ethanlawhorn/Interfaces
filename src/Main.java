import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Object> objectsToFilter = new ArrayList<>();
        objectsToFilter.add(1);
        objectsToFilter.add(2);
        objectsToFilter.add(3);
        objectsToFilter.add(4);
        objectsToFilter.add(5);

        Filter myFilter = new MyFilter(3);

        List<Object> filteredObjects = FilterUtils.collectAll(objectsToFilter, myFilter);

        for (Object obj : filteredObjects) {
            System.out.println(obj);
        }
    }
}
