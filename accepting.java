import java.util.*;
class Main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
        a.remove("y");
        System.out.println(a);
    }
}