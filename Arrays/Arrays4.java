import java.util.*;
//largest number in Array


public class Arrays4 {
    public static int largestnum(int numbers[])
    {
        int largest=Integer.MIN_VALUE;//lowest possible value of integer 
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest=numbers[i];
            }
            if(numbers[i]<smallest)
            {
                smallest=numbers[i];
            }
        }
        
        
        System.out.println("Lowest is : "+smallest);

        return largest;

    }
    public static void main(String args[])
    {
        int numbers[]={1,2,6,3,5};
        int largest=largestnum(numbers);
        System.out.println("Largest number in Array is : "+largest);
    }
}
