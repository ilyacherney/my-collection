package sorting;

public class BubbleSort {
    public static void sort(SortingOrder sortingOrder, int[] array) {
        System.out.println("test1");
        boolean elementReplaced = false;
        int buffer;
            switch (sortingOrder) {
                case ASCENDING:
                    for (int i = 0; i < array.length; i++) {
                        if (i == array.length - 1) break;
                        if (array[i] > array[i + 1]) {
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
                        if (array[i] < array[i + 1]) {
                            buffer = array[i + 1];
                            array[i + 1] = array[i];
                            array[i] = buffer;
                            elementReplaced = true;
                        }
                    }
                    break;
            }
            if (elementReplaced == true) sort(sortingOrder, array);
    }
    public static void sort(SortingOrder sortingOrder, Object[] array) {
        System.out.println("test");
    }
}
