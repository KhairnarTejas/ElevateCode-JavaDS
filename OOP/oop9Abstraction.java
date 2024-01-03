public class oop9Abstraction {
    public static void main(String args[])
    {
        Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changecolor();
        System.out.println(h.color);


        Chicken c=new Chicken();
        c.eat();
        c.walk();

        //Mustang m= new Mustang();
        //Constructors called as Animal->Horse->Mustang
    }
}

//Abstraction..........

abstract class Animal{
    String color;
    Animal()
    {
        color="Skin";
        System.out.println("Animal Constructor called.");
    }
    void eat()
    {
        System.out.println("Eat.");
    }

    abstract void walk();
}


class Horse extends Animal{
    void changecolor()
    {
        color="Dark Brown";
        System.out.println("Horse Constructor called.");

    }
    void walk()
    {
        System.out.println("Walks on 4 legs.");
    }
}
class Mustang extends Horse{
    Mustang(){
    System.out.println("Mustang Constructor called.");
    }
}
class Chicken extends Animal{
    void changecolor()
    {
        color="Black";
    }
    void walk()
    {
        System.out.println("Walks on 2 legs");
    }

}