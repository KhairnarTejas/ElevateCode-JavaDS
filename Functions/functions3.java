import java.util.*;
public class functions3{
public static int multiply(int a, int b)
{
    int product=a*b;
    return product;
}

public static int factorial(int n)
{
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }
    return fact;
}

public static int bincoeff(int n,int r)
{
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int bincoeff=fact_n/(fact_r*fact_nmr);
    return bincoeff;

}

public static void main(String args[])
{
    int product=multiply(5,6);
    System.out.println("Product of numbers is : "+product);
    System.out.println("Enter the number : ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int fact=factorial(num);
    System.out.println("Factorial of a number is : "+ fact);
    int bincoeff=bincoeff(5, 2);
    System.out.println("Binomial coefficient of nuumber is : "+bincoeff);
    
}
}
