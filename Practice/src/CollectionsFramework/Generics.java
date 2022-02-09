package CollectionsFramework;

public class Generics {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair();
        p.x = 12;
        p.y = "Natasha";
        //String str = (String)p.x;
        Integer o = 10;
        String s = String.valueOf(o);
        System.out.println(s);
        //Generics Method
        Character[] arr = {'a', 'v', 't', 'y', 'v'};
        System.out.println("No of 'v' in Array are : " + count(arr, 'v'));

    }

    public static <T> int count(T[] arr, T x) {
        int res = 0;
        for (T e : arr) {
            if (e.equals(x))
                res++;
        }
        return res;
    }
}

class Pair<A, b> {
    A x;
    b y;

}
