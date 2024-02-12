import data_structures.MyArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sorting.IntegerComparator;
import sorting.SortingOrder;
import sorting.SortingType;

public class MyArrayListTest {
    MyArrayList<Integer> instantiateExpectedAscArray() {
        MyArrayList<Integer> expectedArray = new MyArrayList();
        expectedArray.add(1);
        expectedArray.add(3);
        expectedArray.add(6);
        expectedArray.add(8);
        return expectedArray;
    }

    MyArrayList<Integer> instantiateExpectedDescArray() {
        MyArrayList<Integer> expectedArray = new MyArrayList();
        expectedArray.add(8);
        expectedArray.add(6);
        expectedArray.add(3);
        expectedArray.add(1);
        return expectedArray;
    }

    MyArrayList<Integer> instantiateTestArray() {
        MyArrayList<Integer> testArray = new MyArrayList();
        testArray.add(3);
        testArray.add(8);
        testArray.add(6);
        testArray.add(1);
        return testArray;
    }
    @Test
    void BubbleAscSort() {
        MyArrayList<Integer> expectedArray = instantiateExpectedAscArray();
        MyArrayList<Integer> testArray = instantiateTestArray();

        testArray.sort(SortingType.Bubble, SortingOrder.ASCENDING, new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), testArray.toString());
    }

    @Test
    void BubbleDescSort() {
        MyArrayList<Integer> expectedArray = instantiateExpectedDescArray();
        MyArrayList<Integer> testArray = instantiateTestArray();

        testArray.sort(SortingType.Bubble, SortingOrder.DESCENDING, new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), testArray.toString());
    }

    @Test
    void InsertionAscSort() {
        MyArrayList<Integer> expectedArray = instantiateExpectedAscArray();
        MyArrayList<Integer> testArray = instantiateTestArray();

        testArray.sort(SortingType.Insertion, SortingOrder.ASCENDING, new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), testArray.toString());
    }

    @Test
    void InsertionDescSort() {
        MyArrayList<Integer> expectedArray = instantiateExpectedDescArray();
        MyArrayList<Integer> testArray = instantiateTestArray();

        testArray.sort(SortingType.Insertion, SortingOrder.DESCENDING, new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), testArray.toString());
    }
}