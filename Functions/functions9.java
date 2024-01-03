import java.util.*;

public class functions9 {
    public static void bintodec(long n) {
        int pow = 0;
        long decnum = 0;

        while (n > 0) {
            long lastdigit = n % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        System.out.println("Decimal of binary number is  : " + decnum);

    }

    public static void dectobin(long n) {
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = (int)n % 2;
            binnum = binnum + (rem * (int) Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary form of number is "+binnum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        long n = sc.nextLong();
        bintodec(n);
        System.out.println("Enter the decimal number : ");
        long n1 = sc.nextLong();
        dectobin(n1);
    }

}
