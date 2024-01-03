import java.util.*;

public class functions1 {
    public static void  printhello()//Define function
    {
        System.out.println("Hello.....");
        System.out.println("Hi\nWhat is your Name?");
    }

    public static int calculatesum(int num1,int num2)//Parameters or formal parameters
    {
        int sum;
        sum=num1+num2;
        return sum;
        
    }
    public static void main(String args[])
    {
            //Call function
            printhello();
            Scanner sc =new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=calculatesum(a,b);//Arguments or actual parameters
            System.out.println("Sum of a and b is : "+sum);

        }    
}
