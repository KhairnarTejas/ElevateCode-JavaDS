import java.util.*;

public class pattern1 {
    public static void main(String args[]) {
        // Print star pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print inverted star pattern
        int n;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print half pyramid pattern

        int n1;
        System.out.println("Enter the number : ");

        n1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print character pattern
        char ch = 'A';
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
