
//Binary Search 
//Time Complexity:  O(log n)
import java.util.*;

public class Arrays5 {
    public static int binarysearch(int numbers[], int key) {
        int start=0;
        int end =numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)  //Comparison
            {
                return mid;
            }
            if(key<numbers[mid])  //left
            {
                end=mid-1;
            }
            else{
                start=mid+1;    //right
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key;
        System.out.println("Enter the key you want to find : ");
        key=sc.nextInt();
        int index = binarysearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not Found..");
        } else {
            System.out.println("Key is present at index : " + index);
        }
        
    }
}
