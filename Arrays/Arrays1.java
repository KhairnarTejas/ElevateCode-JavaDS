
import java.util.*;
public class Arrays1 {
    public static void main(String args[])
    {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students : ");
        n=sc.nextInt();
        System.out.println("Enter the marks of students : ");

        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();  //Input to array 
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Marks of student "+i+1+" is : " +marks[i]);  //Output from array;  //Input to array 
        }


        marks[1]=0;
        System.out.println(marks[1]); //Updation in array
    }
}
