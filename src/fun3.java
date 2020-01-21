import java.util.*;
public class fun3 {
    void largest(int arr[],int n) {
        Arrays.sort(arr);
        System.out.println("largest:" + arr[n - 1]);
        System.out.println("largest:" + arr[n - 2]);
    }
    public static void main(String args[])
    {
        fun3 f=new fun3();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        f.largest(arr,n);
    }
}
