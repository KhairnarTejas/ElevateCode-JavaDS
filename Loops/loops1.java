//While Loop
import java.util.*;
public class loops1 {
    public static void main(String args[]) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello World.....");
            counter++;
        }

        // Print 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        //Print 1 to n
        int n;
        i=1;
        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }


        //Sum of first n natural numbers
        int sum=0;
        i=1;
        System.out.println("Enter the number : ");
        n=sc.nextInt();
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+ sum);

        //For loop

        for(int j=1;j<=10;j++)
        {
            System.out.print(j+" ");
        }
        
    }
}
