import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MyArrayListTest {
//    private static MyArrayList myArrayList;
//
//    @BeforeClass
//    public static void instantiateArrayList() {
//        myArrayList = new MyArrayList();
//    }

    @Test
    void newArrayListShouldHaveZeroSize() {
        MyArrayList myArrayList = new MyArrayList();
        Assert.assertEquals(0, myArrayList.getSize());
    }

    @Test
    void ArrayListShouldAddSameTypeObjects() {
        MyArrayList<String> myArrayList = new MyArrayList();

        String obj1= new String("Test");
        int obj2 = 1;
        String obj3 = new String("Test2");

        myArrayList.add(obj1);
//        myArrayList.add(obj2);
        myArrayList.add(obj3);
    }

    @Test
    void ArrayListShouldSortInts() {
        MyArrayList<Integer> expectedArray = new MyArrayList();
        expectedArray.add(1);
        expectedArray.add(3);
        expectedArray.add(6);

        MyArrayList<Integer> myArrayList = new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(6);
        myArrayList.add(1);

        myArrayList.sort();

        Assert.assertEquals(expectedArray, myArrayList);
    }
}