import java.util.*;

public class strings1 {

    public static void printletters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={'a','b','c','d'};
        String str="abcd";
        String str2= new String("xyz");

        //Strings are immutable


        //Inpuit & output the string
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
        System.out.println("Hi.......");
        sc.nextLine();
        String fullname=sc.nextLine();
        System.out.println(fullname);

        System.out.println("Length of string is : "+fullname.length());

        //String Concatenation
        String taluka="Kalwan";
        String district="Nashik";
        String Address=(taluka+ district);
        System.out.println(Address);

        String str3="Hi.";
        String str4="Hello";
        System.out.println((str3.concat(str4)));

        //charAt()
        System.out.println(district.charAt(2));

        printletters(str3);
        printletters(str4);
       

    }
}
