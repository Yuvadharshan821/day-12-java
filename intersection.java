import java.util.*;

class Main {
    public static void main(String Args[]) {
        int arr1[]={12,222,23,5,34,54};
        int arr2[]={1,2,3,4,5,6};
        Set <Integer> a=new HashSet<>();
        Set <Integer> b=new HashSet<>();
        for(int s: arr1)
        a.add(s);
        for(int s1 : arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set <Integer> u=new HashSet<>(a);
        u.retainAll(b);
        System.out.println(u);
    }
}


