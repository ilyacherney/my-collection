package sorting;

import java.util.Comparator;

public class InsertionSort {

    public static <T> T[] sort(T[] array, SortingOrder sortingOrder, Comparator comparator) {
        int targetIndex;
            for (int i = 1; i < array.length; i++) {
                targetIndex = i;
                for (int j = i - 1; j >= 0; j--) {
                    switch(sortingOrder) {
                        case ASCENDING:
                            if (comparator.compare(array[targetIndex], array[j]) < 0) switchLeft(array, targetIndex, j);
                            break;
                        case DESCENDING: {
                            if (comparator.compare(array[targetIndex], array[j]) > 0) switchLeft(array, targetIndex, j);
                            break;
                        }
                    }
                    targetIndex = j;
                }
            }
        return array;
    }

        public static <T> void switchLeft(T[] array, int targetIndex, int j) {
            T buffer;
            buffer = array[j];
            array[j] = array[targetIndex];
            array[targetIndex] = buffer;
        }
}
