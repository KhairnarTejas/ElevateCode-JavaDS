import java.util.*;
public class functions13 {
    public static  void sumOfIntegers(int n)
    {
        int sum=0;
        int num=n;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of integers in number is "+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : " );
        int n=sc.nextInt();
        sumOfIntegers(n);
    }
}
