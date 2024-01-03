import java.util.*;
public class loops3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        do{
        int n=sc.nextInt();
        if(n%10==0)
        {
            break;
        }
        System.out.println(n);
    }while(true);


    //continue statement 
    for (int i=0;i<=10;i++)
    {
        if(i==3)
        {
            continue;
        }
        System.out.println(i);
    }

    //Display all numbers entered by user except multiples of 10
    while(true)
    {
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num%10==0)
        {
            continue;
        }
        System.out.println(num);
    }

    }
}
