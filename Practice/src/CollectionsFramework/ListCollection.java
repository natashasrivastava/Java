package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Object[] arr = list.toArray();
        for (Object x:arr)
            System.out.print(x+" ");
    }
}
