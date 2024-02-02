package sorting;

public class InsertionSort {

    public static int[] sort(int[] array, SortingOrder sortingOrder) {
        if (sortingOrder == SortingOrder.ASCENDING) {
            int buffer;
            int targetIndex;
            for (int i = 1; i < array.length; i++) {
                targetIndex = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[targetIndex] < array[j]) {
                        buffer = array[j];
                        array[j] = array[targetIndex];
                        array[targetIndex] = buffer;
                        targetIndex = j;
                    } else break;
                }
            }
        }

        if (sortingOrder == SortingOrder.DESCENDING) {
            int buffer;
            int targetIndex;
            for (int i = 1; i < array.length; i++) {
                targetIndex = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[targetIndex] > array[j]) {
                        buffer = array[j];
                        array[j] = array[targetIndex];
                        array[targetIndex] = buffer;
                        targetIndex = j;
                    } else break;
                }
            }
        }
            return array;
    }
}
