
import java.util.*;

public class JavaBasics4 {
    public static void main(String args[]) {
        // Question 1:In a program, input 3 numbers : A, B and C.
        // You have to output the average of these 3 numbers.
        // (Hint : Average of N numbers is sum of those numbers divided by N )
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating average of three numbers: ");
        System.out.println("Enter the numbers  : ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the numbers is " + average);

        // Question 2: Program for Calculation of area of a square 

        System.out.println("Enter the side of the square  : ");
        int side = sc.nextInt();
        int area=side*side;
        System.out.println("Area of a square is : " + area);

        //calculate total price 
        

        System.out.println("Enter the cost of pen : ");
        int priceofpen=sc.nextInt();
        System.out.println("Enter the cost of pencil : ");
        int priceofpencil=sc.nextInt();
        System.out.println("Enter the cost of eraser : ");
        int priceoferaser=sc.nextInt();

        double totalcost=((priceofpen+priceofpencil+priceoferaser)+0.18*(priceofpen+priceofpencil+priceoferaser));

        System.out.println("Total Cost of items is : "+ totalcost);
        


        //What wiill be the data type of following result
        byte b=4;
        char c='a';
        short s=512;
        int i =1000;
        float f =3.14f;
        double d =99.9954;
        
        System.out.println("Result is : " +((f*b)+ (i%c)-(d*s)));  //It is of doubl etype beacuse of type promotion in java
    }
}
