import java.util.*;

public class ConditionalStatements3 {
    public static void main(String ags[])
    {
        //Income Tax Calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income : ");
        double income=sc.nextInt();
        double tax;
        if(income<500000)
        {
            System.out.println("Your Tax is 0 rs. ");
        }
        else if(income>=500000 && income<=1000000)
        {
            tax=(0.20*(income));
            System.out.println("Your tax is : "+tax);
        }
        else{
            tax=(0.30*(income));
            System.out.println("Your tax is : "+tax);
        }
    }
}
