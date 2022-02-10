package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        Set<String> t = new TreeSet<>();
        t.add("Arpit");
        t.add("Deepika");
        t.add("Bhawna");
        t.add("Ankush");
        for (Object e: t)
            System.out.println(e);

    }

}
