import java.util.*;
public class functions11 {
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int n=sc.nextInt();
        boolean result=isEven(n);
        if(result)
        {
            System.out.println("Entered  number is Even");
        }
        else
        {
            System.out.println("Entered  number is Odd");
        }
    }
}
