import java.util.*;
public class loops5
{
    public static void main(String args [])
    {
        //Program for factorial
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n;
        n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is : "+ fact);

        //Program for table

        int num;
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i );
        }


        //Print sum of even and odd integers

        int number;
        int choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.println("Enter the number : ");
            number=sc.nextInt();
            if(number%2==0)
            {
                evensum+=number;
            }
            else{
                oddsum+=number;
            }
            System.out.println("Do you want to continue ? 1 for yes and 0 for no.");
            choice=sc.nextInt();

        }while(choice==1);

        System.out.println("Sum of even numbers is : "+evensum);
        System.out.println("Sum of odd numbers is : "+oddsum);

    }
}