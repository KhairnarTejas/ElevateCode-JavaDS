import java.util.Scanner;
public class Recursion5Fibonacci {
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
       
        int fibn=fib(n-1)+fib(n-2);
        return fibn;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+"th fibonacci number is : "+fib(n));
    }
}
