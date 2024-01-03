import java.util.*;

public class conditionalstatements1 {
    public static void main(String args[])
    {
        //Find largest of two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();
        if (a>=b)
        {
            System.out.println("Largest number is : "+ a);
        }
        else
        {
            System.out.println("Largest number is : "+b);
        }
    
}
}
