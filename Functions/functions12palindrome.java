import java.util.Scanner;

public class functions12palindrome {
    public static void palindrome(int num)
    {
        int number=num;
        int reverse=0;
        while(number>0)
        {
            int n=number%10;
            reverse=reverse*10+n;
            number/=10;
        }
        if(reverse==num)
        {
            System.out.println("Entered number is a Palindrome.");
        }
        else
        {
            System.out.println("Entered number is not a Palindrome.");
          
        }
    }

    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int n=sc.nextInt();
        palindrome(n);
    }
}
