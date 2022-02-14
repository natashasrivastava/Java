package StringsClass;

import java.util.SortedMap;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Natasha Srivastava";
        String nickName = "Natasha Srivastava";
        System.out.println(name == nickName);

        String newnickName = new String("Natasha Srivastava");
        System.out.println(name == newnickName);
        System.out.println(name.equals(newnickName));

        String twins = name;
        System.out.println(twins==name);

        System.out.println(name.charAt(9));

        String r;
        System.out.println();
    }

}
