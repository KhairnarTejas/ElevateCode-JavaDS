public class functions2 {
    static void swap(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[])
    {
        int a=10;
        int b=5;
        swap(a,b);
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is "+b);
        //Values are not swapped as it is call by value it does not affect original values of variables
         

    }
}
