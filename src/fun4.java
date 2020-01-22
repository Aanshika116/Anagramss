import java.lang.*;
import java.util.*;
public class fun4 {
    public void check(String str1,String str2){
        char s[]=str1.toCharArray();
        char s1[]=str2.toCharArray();
        int count=0;
        Arrays.sort(s);
        Arrays.sort(s1);
        System.out.println(s);
        System.out.println(s1);
        if(str1.length()!=str2.length()){
            System.out.println("Strings are not anagrams");
        }
        else {
            for (int i = 0; i < str1.length(); i++) {
                if (s[i] == s1[i]) {
                    count++;
                }
            }
            if(count==str1.length()){
                System.out.println("yes they are anagrams");
            }
            else
            {
                System.out.println("No they are not anagrams");
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1="geeksforgeeks";
        String str2="geeksgeeksfor";
        fun4 f=new fun4();
        f.check(str1,str2);
    }
}
