import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        MyArrayList myArrayList = new MyArrayList();
//
//        String s1 = "1111";
//        String s2 = "2222";
//        String s3 = "3333";
//        String s4 = "4444";
//        String s5 = "5555";
//        String s6 = "6666";
//        String s7 = "7777";
//
//        System.out.println(myArrayList);
//        myArrayList.add(s1);
//        System.out.println(myArrayList);
//        myArrayList.add(s2);
//        System.out.println(myArrayList);
//        myArrayList.add(s3);
//        System.out.println(myArrayList);
//        myArrayList.add(s4);
//        System.out.println(myArrayList);
//        myArrayList.add(s5);
//        System.out.println(myArrayList);
//
//        myArrayList.remove(1);
//        System.out.println(myArrayList);
//
//        myArrayList.add(s6);
//        System.out.println(myArrayList);

//        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
//        myHashMap.put("Java", 100);
//        myHashMap.put("Python", 80);
//        System.out.println(myHashMap);
//
//        System.out.println(myHashMap.get("Java"));
        List<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(1);
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

        Integer a = 1;
        Integer b = 2;
        int result = a.compareTo(b);
        System.out.println(result);

//
//        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
//        myArrayList1.add(3);
//        myArrayList1.add(1);
//        myArrayList1.add(5);
//        System.out.println(myArrayList1);
//
//        myArrayList1.sort();
//        System.out.println(myArrayList1);
    }
}