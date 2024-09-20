import java.util.*;
public class functions8 {
    //This is program for printing prime numbers in given range
public static boolean isprime(int n)
{
    //corner cases
    if(n==2)
    {
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            return false; 
        }
    }
    return true;
}


public static void primesinrange(int n)
{
    int count=0;
    for(int i=2;i<=n;i++)
    {
        if(isprime(i))
        {
            System.out.print(i+" ");
            count++;
        }
    }
    System.out.println("\n*****Total number of prime numbers are  : "+count+" *****");
} 
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter the number  : ");
    int n=sc.nextInt();
    primesinrange(n);
        
}

}
 
