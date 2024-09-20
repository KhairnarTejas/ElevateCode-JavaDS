import java.util.Scanner;

public class Recursion8lastOccurenceofElementinArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which last ocurrence you want to find : ");
        int key=sc.nextInt();
        System.out.println("Key last time Found at index "+lastOccurence(arr, key, 0));

    }

    public static int lastOccurence(int arr[],int key,int i) {
        if(i==arr.length)
        {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key)
        {
            return i;
        }
        return isFound;
    }
}
