package data_structures;

import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.SortingOrder;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> {
    private T type;
    private T[] array;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 2;

    public MyArrayList() {
        array = (T[])new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(T obj) {
        if (array.length <= size ) increaseCapacity();
        array[size] = obj;
        size++;
    }

    public void remove(int index) {
        int lastElement = array.length - 1;
        for (int i = index; i < lastElement; i++) {
            array[i] = array[i + 1];
        }
        array[lastElement] = null;
        size--;
    }

    public void increaseCapacity() {
        int newLength = array.length * 2;
        T[] newArray = Arrays.copyOf(array, newLength);
        array = newArray;
    }

    public void sort(SortingOrder sortingOrder, Comparator<? super T> comparator) {
        array = BubbleSort.sort(array, sortingOrder, comparator);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
