package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BetweenSort {
    public static List<Integer> getBetweenSorted(
            List<Integer> list,
            Comparator<Integer> comparator,
            int i,
            int j
    ) {
        List<Integer> first = list.subList(0, i);
        first.sort(comparator.reversed());

        List<Integer> second = list.subList(i, j);
        second.sort(comparator);

        List<Integer> third = list.subList(j, list.size());
        third.sort(comparator.reversed());

        List<Integer> result = new ArrayList<>();
        result.addAll(first);
        result.addAll(second);
        result.addAll(third);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Comparator<Integer> c = Comparator.naturalOrder();

        System.out.println(getBetweenSorted(ints, c, 4, 8));
    }
}
