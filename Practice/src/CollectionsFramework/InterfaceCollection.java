package CollectionsFramework;

import java.util.*;

public class InterfaceCollection {
    public static void main(String[] args) {
        Collection<String> Students = new ArrayList<>();
        Students.add("Natasha");
        Students.add("Tushar");
        Students.add("Tanuja");
        Students.add("Pankaj");
        removeEven(Students);
        for (String student : Students) {
            System.out.println(student);
        }
    }

    public static void removeEven(Collection<String> Students) {
        Iterator<String> it = Students.iterator();
        while (it.hasNext()) {
            String x = it.next();
            if (x.equals("Natasha")) {
                it.remove();
            }
        }
    }
}

