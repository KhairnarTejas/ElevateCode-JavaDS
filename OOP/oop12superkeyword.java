public class oop12superkeyword {
    public static void main(String args[])
    {
        Horse h=new Horse();
    }
}

class Animal{
    String color;
    Animal()
    {
        System.out.println("Animal Constructor is called.");
    }

}

class Horse extends Animal{
    Horse(){
        super();
        super.color="Brown";
        
        System.out.println("Horse Constructor is called.");
    }
}