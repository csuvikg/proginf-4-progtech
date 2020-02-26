package gyak3.src.gyak3.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static List<Integer> getSortedByNRemainder(List<Integer> list, final int n) {
        return getSortedByNRemainder(list, n, true);
    }

    public static List<Integer> getSortedByNRemainder(List<Integer> list, final int n, final boolean ascending) {
        ArrayList<Integer> listCopy = new ArrayList<>(list);
        Collections.sort(listCopy, new RemainderComparator(n, ascending));
        return listCopy;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 21, 12, 34, 5));
        System.out.println(getSortedByNRemainder(list, 3));
    }

}
