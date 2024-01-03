public class Recursion11tiling {
    public static void main(String args[])
    {
            System.out.println(tiling(4));
    }

    public static int tiling(int n)
    {
        //n * 2 (floor size )
        
        //base case
        if( n==0 || n==1)
        {
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1= tiling(n-1);

        //horizontal choice
        int fnm2=tiling(n-2);

        int totalways= fnm1+fnm2;
        return totalways;
    }
}
