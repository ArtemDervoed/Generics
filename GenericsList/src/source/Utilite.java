package source;


import java.util.ArrayList;

public class Utilite {
    public static <T> ArrayList<T> filter(ArrayList<T> elements, PredicateInterfase<T> predicate) {
        if (elements == null || predicate == null) {
            throw new IllegalArgumentException();
        } else {
            ArrayList<T> result = new ArrayList<>();
            for (T item : elements) {
                if (predicate.status(item)) {
                    result.add(item);
                }
            }
            return result;
        }
    }
}
