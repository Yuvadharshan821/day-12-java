import java.util.*;

class Main {
    public static void main(String Args[]) {
        // Define arrays of strings
        String arr1[] = {"hi", "hello", "amar", "ranjith", "vijay"};
        String arr2[] = {"hi", "hello", "amar", "ranjith", "vijay", "raj", "akbar"};
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        for (String s : arr1)
            a.add(s);
        for (String s1 : arr2)
            b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u = new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);
    }
}
