import java.util.*;

public class ConditionalStatements5 {
    public static void main(String args[]) {
        // Swich Statement
        // Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enetr the second number  : ");
        int b = sc.nextInt();
        System.out.println("Enter the operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enetr Valid Choice.....");
                break;
        }
    }
}