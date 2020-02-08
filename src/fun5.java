import java.lang.*;
import java.util.*;
public class proj1 {
    public void anagrams(String s1,String s2)
    {
        int a=0;
        int b=0;
        char []st1=s1.toCharArray();
        char []st2=s2.toCharArray();
        for(int i=0;i<st1.length;i++)
        {
            a=st1[i]+a;
        }
        for(int i=0;i<st1.length;i++)
        {
            b=st1[i]+b;
        }
        if(a==b)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        proj1 p=new proj1();
        p.anagrams(s1,s2);
    }
}
