import data_structures.MyArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sorting.IntegerComparator;
import sorting.SortingOrder;

public class MyArrayListTest {
    @Test
    void newArrayListShouldHaveZeroSize() {
        MyArrayList myArrayList = new MyArrayList();
        Assert.assertEquals(0, myArrayList.getSize());
    }

    @Test //доделать
    void ArrayListShouldAddOnlySameTypeObjects() {
        MyArrayList<String> myArrayList = new MyArrayList();

        String obj1= new String("Test");
        int obj2 = 1;
        String obj3 = new String("Test2");

        myArrayList.add(obj1);
//        myArrayList.add(obj2);
        myArrayList.add(obj3);
    }

    @Test
    void ArrayListShouldAscendingSortInts() {
        MyArrayList<Integer> expectedArray = new MyArrayList();
        expectedArray.add(1);
        expectedArray.add(3);
        expectedArray.add(6);
        expectedArray.add(8);

        MyArrayList<Integer> myArrayList = new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(8);
        myArrayList.add(6);
        myArrayList.add(1);

        myArrayList.sort(SortingOrder.ASCENDING ,new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), myArrayList.toString());
    }

    @Test
    void ArrayListShouldDescendingSortInts() {
        MyArrayList<Integer> expectedArray = new MyArrayList();
        expectedArray.add(8);
        expectedArray.add(6);
        expectedArray.add(3);
        expectedArray.add(1);

        MyArrayList<Integer> myArrayList = new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(8);
        myArrayList.add(6);
        myArrayList.add(1);

        myArrayList.sort(SortingOrder.DESCENDING ,new IntegerComparator());
        Assert.assertEquals(expectedArray.toString(), myArrayList.toString());
    }
}