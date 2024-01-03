import java.util.*;
public class oop7methodoverloading {
    public static void main(String args[])
    {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.4));
        System.out.println(calc.sum(5,7,12));


    }
}
//Function Overloading
class Calculator
{
    int  sum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    int sum(int a, int b,int c)
    {
        int sum=a+b+c;
       return(sum);
    }
    float sum(float a, float b)
    {
        float sum=a+b;
        return(sum);
    }
}