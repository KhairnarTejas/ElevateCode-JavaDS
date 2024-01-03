package ConditionalStatements;
import java.util.*;
 
public class ConditionalStatements4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("Largest number is : "+a);
        }
        else if(b>=c && b>=a)
        {
            System.out.println("Largest number is : "+b);
        
        }
        else{
            System.out.println("Largest number is : "+c);
        }


        int number;
        System.out.println("Enter the number : ");
        number =sc.nextInt();
        //Ternary operator
        String type= ((number%2) == 0)?"even":"odd";
        System.out.println(type);
        System.out.println("Enter the marks : ");
        
        int marks=sc.nextInt();
        String result=(marks>=35)?"PASS":"FAIL";
        System.out.println(result);

    }
}
