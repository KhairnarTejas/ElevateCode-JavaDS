public class oop3 {
    public static void main(String args[])
    {
            Student s1= new Student("Tejas");
    }
}


class Student{
    String name;
    int roll;

    Student(String name)
    {
        //Constructor
        this.name=name;
        System.out.println("Constructor is called");
    }
}






