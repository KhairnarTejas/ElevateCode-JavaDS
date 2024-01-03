
public class functions7 {
    //This is optimised program for checking prime
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
    public static void main(String args[])
    {
        
        System.out.println(""+isprime(6));
        System.out.println(""+isprime(5));
    }
}
 
