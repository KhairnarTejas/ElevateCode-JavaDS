import java.util.*;

public class Recursion6checksortedarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr, 0)) {
            System.out.println("Array is Sorted. ");
        } else {
            System.out.println("Array is not Sorted.");
        }
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
}
