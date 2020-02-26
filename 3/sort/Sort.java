package sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    List<Integer> getSortedByNRemainder(List<Integer> list, int n, boolean ascending) {
        List<Integer> sorted = list.stream()
                .sorted(Comparator.comparingInt(i -> i % n))
                .collect(Collectors.toList());

        if (!ascending) {
            sorted.sort(Comparator.reverseOrder());
        }

        return sorted;
    }

    List<Integer> getSortedByNRemainder(List<Integer> list, int n) {
        return getSortedByNRemainder(list, n, true);
    }
}
