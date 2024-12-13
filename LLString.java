import java.util.*;
class Main
{
    public static void main(String Args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("i am");
        a.add("Students");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}