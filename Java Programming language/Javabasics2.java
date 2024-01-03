import java.util.*;
public class Javabasics2 {
    public static void main(String args[])
    {
        //Sum of two numbers.....
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is : "+ sum);

        //Product of two numbers.....
       
        System.out.println("Enter 1st number : ");
        int c=sc.nextInt();
        System.out.println("Enetr 2nd number : ");
        int d= sc.nextInt();
        int product=c*d;
        System.out.println("Product of two numbers is : "+ product);


        //Area of circle

        System.out.println("Enter Radius of a circle : ");
        float radius=sc.nextFloat();
        float area =(3.142f * radius *radius);
        System.out.println("Area of a circle is : "+ area);
        }
}
