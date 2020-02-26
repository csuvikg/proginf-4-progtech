package gyak3.src.gyak3.sort2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static <T extends Comparable> List<T> sort(List<T> list, int i, int j) {
        Collections.sort(list.subList(0, i), new ReverseComparator<T>());
        Collections.sort(list.subList(i, j + 1));
        Collections.sort(list.subList(j + 1, list.size()), new ReverseComparator<T>());
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 15, 8, 3, 6, 18, 97));
        System.out.println(sort(list, 3, 5));
    }

}
