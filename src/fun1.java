import java.util.*;
public class fun1 {
    void fo(String str){
        String ar[]=str.split("\\.");
        for(int i=ar.length-1;i>0;i--)
        {
            System.out.println(ar[i]+".");
        }
        System.out.print(ar[0]);
    }
    public static void main(String args[])
    {
        fun1 f=new fun1();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        f.fo(str);
    }
}
