import java.util.*;
class Main
{
    public static void main(String Args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("i am");
        a.add("Students");
        a.add("yuva");
        a.add("dharshan");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}