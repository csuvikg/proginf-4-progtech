package gyak3.src.gyak3.numboth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class NumBoth {

    public static <T> int numBoth(Collection<T> c1, Collection<T> c2) {
        HashSet<T> s1 = new HashSet<>(c1);
        HashSet<T> s2 = new HashSet<>(c2);
        s1.retainAll(s2);
        return s1.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
        ArrayList<Integer> c2 = new ArrayList<>(Arrays.asList(2, 3, 7, 8));
        System.out.println("The collections " + c1 + " and " + c2 + " have "
            + numBoth(c1, c2) + " elements in common not counting duplicates.");

    }

}
