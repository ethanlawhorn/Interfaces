import java.util.ArrayList;
import java.util.List;

public class FilterUtils {
    public static List<Object> collectAll(List<Object> collection, Filter filter) {
        List<Object> filteredList = new ArrayList<>();
        for (Object obj : collection) {
            if (filter.accept(obj)) {
                filteredList.add(obj);
            }
        }
        return filteredList;
    }
}
