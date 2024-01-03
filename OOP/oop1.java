

public class oop1 {
    public static void main(String args[])
    {
        Pen p1=new Pen();//created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);

        BankAccount myAccount=new BankAccount();
        myAccount.username = "Tejas Khairnar";
        //myAccount.password ="abcd"; cannot access private member
        myAccount.setpassword("abcd");
    }
    

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}

class Student
{
    String name;
    int age;
    float percentage;
    void calcPercent(int phy, int chem,int math)
    {
        percentage=(phy+chem+math)/3;
    }
}

class BankAccount
{
    public String username;
    private String password;
    public void setpassword(String psw)
    {
        password=psw;
    }

}