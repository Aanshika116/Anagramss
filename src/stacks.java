import java.util.Scanner;
import java.util.Stack;

public class practise
{
    public static void check(String s)
    {

        Stack<Character> stack = new Stack<Character>();
        int n = s.length();
        for (int x = 0; x < n; x++)
        {
            if (s.charAt(x) == '{' || s.charAt(x) == '[' || s.charAt(x) == '(') {
                stack.push(s.charAt(x));
            }
            if (!stack.isEmpty())
            {
                if (s.charAt(x) == ')' && stack.peek() == '(') {

                    stack.pop();
                } else if (s.charAt(x) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (s.charAt(x) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
            }

        }

        if (stack.isEmpty())
        {
            System.out.println("BALANCED");
        }
        else
        {
            System.out.println("NOT BALANCED");
        }
    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        check(str);

    }

}
