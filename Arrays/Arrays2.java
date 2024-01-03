import java.util.*;
//Passing array as argument
public class Arrays2 {
    public static void update(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;  //Input to array 
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Marks of student "+(i+1)+" is : " +arr[i]);  //Output from array;  //Input to array 
        }
    }   
    public static void main(String args[])
    {
        int marks[]={96,85,74};
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks of student "+(i+1)+" is : " +marks[i]);  //Output from array;  //Input to array 
        }
        update(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks of student "+(i+1)+" is : " +marks[i]);  //Output from array;  //Input to array 
        }

    }
}
