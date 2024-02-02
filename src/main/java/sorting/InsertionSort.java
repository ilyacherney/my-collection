package sorting;

public class InsertionSort {

    public static int[] sort(int[] array, SortingOrder sortingOrder) {
        int buffer;
        int targetIndex;
        for (int i = 1; i < array.length; i++) {
            targetIndex = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if (array[targetIndex] < array[j]) {
                    switch (sortingOrder) {
                        case ASCENDING:
                            buffer = array[j];
                            array[j] = array[targetIndex];
                            array[targetIndex] = buffer;
                            targetIndex = j;
                    }
                } else break;
            }
        }
        return  array;
    }
}
