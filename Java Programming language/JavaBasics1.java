import java.util.*;
public class JavaBasics1 {
    public static void main(String args[]) {

        int a=10;
        int b=5;
            //Comment This will be not executed 
        int sum=a+b;
        System.out.println(sum);


        //Input in java

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String input= sc.next();
        System.out.println("Your name is : " + input);
        
        sc.nextLine();
        System.out.println("Enter your full name : ");
        String name= sc.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your number  : ");
        int var=sc.nextInt();
        System.out.println("You have entered : "+ var); 
    }
    
}
