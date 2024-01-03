import java.util.*;
public class sorting4inbuiltsort {

    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        int numbers[]={2,8,5,7,9,1,3,6};
        Arrays.sort(arr);
        printarray(arr);
        Arrays.sort(numbers,3,7);
        printarray(numbers);
    }
}
