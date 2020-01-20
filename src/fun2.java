import java.util.*;
public class fun2 {
    public static void reverseadj(String n)
    {
      /*  char []c= n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            if(c[i]==c[i+1])
            {
                System.out.println(c[i]);
            }
            else
            {
                System.out.println(c[i]);
            }
        }*/
      String str="";
      if(n.charAt(0)!=n.charAt(1))
      {
          str=str+n.charAt(0);
      }
      for(int i=1;i<n.length()-1;i++)
      {
          if(n.charAt(i)!=n.charAt(i-1)&&n.charAt(i)!=n.charAt(i+1)){
              str=str+n.charAt(i);
          }
      }
      if(n.charAt(n.length()-1)!=n.charAt(n.length()-2)){
           str=str+n.charAt(n.length()-1);
           System.out.println("new string:"+str);
      }

    }
    public static void main(String args[])
    {
        fun2 f=new fun2();
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        f.reverseadj(n);


    }
}
