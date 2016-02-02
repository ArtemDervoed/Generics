import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public final class CollectionsExt {

    private CollectionsExt() {}
    
    public static <T extends Comparable<? super T>> T avg(Collection<? extends T> data) {
	List<T> worker = (List<T>) data;
        Collections.sort(worker);
        if(worker.size()%2==1){
            return worker.get(((worker.size()-1)/2));
        }
	return worker.get(((worker.size())/2));
    }

    
}
