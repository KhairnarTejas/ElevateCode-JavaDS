
//Linear Serarch 
//Time Complexity:  O(n)
import java.util.*;

public class Arrays3 {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
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
        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not Found..");
        } else {
            System.out.println("Key is present at index : " + index);
        }
        
    }
}
