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
        for(String s :a)
        {
            System.out.print(s+" ");
        }
    }
}