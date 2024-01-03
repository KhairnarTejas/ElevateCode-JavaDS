import java.util.Scanner;

public class functions10avgOf3numbers {
    public static int avg(int a, int b, int c)
    {
        int  average =(a+b+c)/3;
        return average;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 3 numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Average of given 3 numbers is : "+avg(a,b,c));

    }
}
