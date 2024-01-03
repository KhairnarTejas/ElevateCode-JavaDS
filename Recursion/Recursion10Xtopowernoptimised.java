public class Recursion10Xtopowernoptimised {
    public static void main(String args[])
    {
        System.out.println(optimisedpower(2, 10));

    }
    public  static int optimisedpower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpower = optimisedpower(x, n/2);
        int halfpowersq=halfpower * halfpower;
        //n is odd
        if(n%2 != 0)
        {
            halfpowersq= x* halfpowersq;
        }

        return halfpowersq;
    } 

}

//Time Complexity is O(logn).