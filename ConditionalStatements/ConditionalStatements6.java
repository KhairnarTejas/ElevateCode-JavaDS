import java.util.*;

public class ConditionalStatements6 {
    public static void main(String args[])
    {
        //Check that nuber is positive or negative 
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative. ");
        }

        //Printing week name susing week numbers

        int day;
        System.out.println("Enter the number : ");
        day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        
            case 7:
                System.out.println("Sunday");
                break;

            default :
                System.out.println("Enter valid number......");
        }



        //Program for leap year

        int year;
        System.out.println("Enter the year  :");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Year is Leap year.");

                }
                else
                {
                    System.out.println("Year is not a Leap year.");
                }
            }
            else{
                System.out.println("Year is Leap year.");
            }
        }
        else{
            System.out.println("Year is not a Leap year.");
        }
    }
}
