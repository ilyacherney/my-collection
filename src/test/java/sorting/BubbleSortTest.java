package sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static sorting.SortingOrder.ASCENDING;
import static sorting.SortingOrder.DESCENDING;

public class BubbleSortTest {
    @Test
    void sortAscending() {
        int[] unsortedArray = new int[] {3, 5, 1, 4, 2};
        int[] sortedArray = BubbleSort.sort(unsortedArray, ASCENDING, new IntegerComparator());
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
    }
    @Test
    void sortDescending() {
        int[] unsortedArray = new int[] {3, 5, 1, 4, 2};
        int[] sortedArray = BubbleSort.sort(unsortedArray, DESCENDING, new IntegerComparator());
        int[] expectedArray = new int[] {5, 4, 3, 2, 1};
        Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
    }
}
