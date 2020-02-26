package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Diff<T> {
    public static <T> int getIntersection(Collection<T> c1, Collection<T> c2) {
        Set<T> s1 = new HashSet<>(c1);
        s1.retainAll(c2);
        return s1.size();
    }
}
