package sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static sorting.SortingOrder.ASCENDING;
import static sorting.SortingOrder.DESCENDING;

class InsertionSortTest {
    @Test
    void sortAscending() {
        int[] unsortedArray = new int[] {3, 5, 1, 4, 2};
        int[] sortedArray = InsertionSort.sort(unsortedArray, ASCENDING);
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("Initial :" + Arrays.toString(unsortedArray));
        Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
    }
    @Test
    void sortDescending() {
        int[] unsortedArray = new int[] {3, 5, 1, 4, 2};
        int[] sortedArray = InsertionSort.sort(unsortedArray, DESCENDING);
        int[] expectedArray = new int[] {5, 4, 3, 2, 1};
        System.out.println("Initial :" + Arrays.toString(unsortedArray));
        Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(sortedArray));
    }
}