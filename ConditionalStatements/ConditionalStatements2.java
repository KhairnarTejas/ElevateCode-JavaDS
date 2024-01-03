import java.util.*;

public class ConditionalStatements2 {
    public static void main(String args[])
    {
        //To find that number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}
