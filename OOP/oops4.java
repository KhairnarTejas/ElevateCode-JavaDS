public class oops4 {
    public static void main(String args[])
    {
        Student s1= new Student();
        Student s2= new Student(4);
    }
}
class Student{
    int roll;
    String name;
    Student() //Non parameterised Constructor
    {
        System.out.println("Constructor is called.");
    }
    Student(int roll)       //Parameterised constructor
    {
        this.roll=roll;
    }
    
}