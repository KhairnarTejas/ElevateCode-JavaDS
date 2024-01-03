public class Recursion4smofnnaturalnumbers {
    public  static int sumOfnNaturalNumbers(int n)
    {  
        if(n==1)
        {
            return 1;
        }
        int sum=n+sumOfnNaturalNumbers(n-1);
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Sum of natural numbers is "+sumOfnNaturalNumbers(10));
    }
}
