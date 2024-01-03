import java.util.Scanner;

public class Arrays6 {
    public static void reverse(int numbers[])
    {
        int first=0;
        int last=numbers.length-1;
        while(first<last)
        {
            //swap
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.println("Original Array : ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        reverse(numbers);
        System.out.println("\nReversed Array : ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }

        
    }
}
