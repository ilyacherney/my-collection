package sorting;

import java.util.Comparator;

public class BubbleSort {
    static boolean elementSwitched = false;
    public static <T> T[] sort(T[] array, SortingOrder sortingOrder, Comparator comparator) {
        elementSwitched = false;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) break;
            switch (sortingOrder) {
                case ASCENDING:
                    if (comparator.compare(array[i], array[i + 1]) == 1) switchElementRight(array, i);
                    break;
                case DESCENDING:
                    if (comparator.compare(array[i], array[i + 1]) == -1) switchElementRight(array, i);
                    break;
            }
        }
        if (elementSwitched == true) sort(array, sortingOrder, comparator);
        return array;
    }

    private static <T> void switchElementRight(T[] array, int i) {
        T buffer = array[i + 1];
        array[i + 1] = array[i];
        array[i] = buffer;
        elementSwitched = true;
    }
}