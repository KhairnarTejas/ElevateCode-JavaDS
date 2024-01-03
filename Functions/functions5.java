import java.util.*;
public class functions5 {

    //Function overloading using data types of parameters 
    static int sum(int a, int b)
    {
        return a+b;
    }
    static float sum(float a, float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println("Sum of int numbers is "+sum(a,b));
        System.out.println("Sum of float numbers is "+sum(c,d));
        
    }
}
