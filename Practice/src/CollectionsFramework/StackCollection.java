package CollectionsFramework;

import java.util.List;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        List<Integer> s = new Stack<Integer>();
        s.add(20);
        s.add(43);
        s.add(98);
        s.add(90);
        s.add(33);
        s.removeIf((n)->(n%2==0));
        System.out.println(s);
        for(Integer x:s)
        {
            System.out.print(x+" ");
        }
    }
}
