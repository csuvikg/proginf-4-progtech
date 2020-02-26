package gyak3.src.gyak3.sort2;

import java.util.Comparator;

public class ReverseComparator<T extends Comparable> implements Comparator<T> {

    @Override
    public int compare(T t, T t1) {
        return t1.compareTo(t);
    }

}
