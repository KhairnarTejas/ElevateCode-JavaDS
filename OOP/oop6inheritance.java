public class oop6inheritance {
    public static void main(String args[])
    {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();;
        shark.swim();
    }
}

//Base Class
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("breathes.");
    }
}


//Derived Class
class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("Swims in water.");
    }
}
//Multilevel Inheritance
class mammals extends Animal
{
    int legs;
}

class dogs extends mammals
{
    void bark()
    {

    }
}

//Hierarchical Inheritence
class cat extends mammals{
    
}
class tiger extends mammals{

}
class human extends mammals
{
    
}