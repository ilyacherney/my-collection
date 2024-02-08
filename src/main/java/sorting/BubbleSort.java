package sorting;

import java.util.Comparator;

public class BubbleSort {
    public static int[] sort(int[] array, SortingOrder sortingOrder, Comparator comparator) {
        boolean elementReplaced = false;
        int buffer;
        switch (sortingOrder) {
            case ASCENDING:
                for (int i = 0; i < array.length; i++) {
                    if (i == array.length - 1) break;
//                        if (array[i] > array[i + 1]) {
                    if (comparator.compare(array[i], array[i + 1]) == 1) {
                        buffer = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = buffer;
                        elementReplaced = true;
                    }
                }
                break;
            case DESCENDING:
                for (int i = 0; i < array.length; i++) {
                    if (i == array.length - 1) break;
                    if (array[i] < array[i + 1]) { //вынести в виде аргумента
                        buffer = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = buffer;
                        elementReplaced = true;
                    }
                }
                break;
        }
        if (elementReplaced == true) sort(array, sortingOrder, comparator);
        return array;
    }
}