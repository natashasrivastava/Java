package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object[] arr = list.toArray();
        System.out.println(list.get(2));
        System.out.println("Items in main list");
        for (Object x:list)
            System.out.print(x+" ");
        List<Integer> list1 = new LinkedList<>();
        list1.add(12);
        list1.add(24);
        list.addAll(list1);
        System.out.println(list1.get(1));
        System.out.println("Modified Items");
        for (Object x:list)
            System.out.print(x+" ");



    }
}
