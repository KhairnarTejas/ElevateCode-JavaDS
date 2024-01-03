import java.util.*;
public class functions4 {

    //Function overloading using no. of parameters 
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sum(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Sum of two numbers is "+sum(a,b));
        System.out.println("Sum of three numbers is "+sum(a,b,c));
        
    }
}
