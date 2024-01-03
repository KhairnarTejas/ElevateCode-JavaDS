import java.util.*;
public class Recursion7occurenceofelementinarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which ocurrence you want to find : ");
        int key=sc.nextInt();
        System.out.println("Key 1st time Found at index "+firstOccurence(arr, key, 0));

    }

    public static int firstOccurence(int arr[],int key,int i) {
        if(i==arr.length-1)
        {
            return -1;
        }
        if (arr[i] ==key)
        {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
}
