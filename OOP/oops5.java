public class oops5 {
    public static void main(String args[])
    {
        Student s1= new Student();
        s1.roll=1;
        s1.name="Jon";
        Student s2=new Student(s1);
    }
}

class Student
{
    int roll;
    String name;
    int marks[];
    Student()
    {

    }

    //Shallow Copy Constructor
    // Student(Student s)
    // {
    //     marks=new int[3];
    //     this.roll=s.roll;
    //     this.name=s.name;
    //     this.marks=s.marks;
    // }



    //Deep Copy Constructor
    Student(Student s)
    {
        marks=new int[3];
        this.name=s.name;
        this.roll=s.roll;
        for(int i=0;i<3;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }


    

}
