public class oop2 {
    public static void main(String args[])
    {
        Pen p1= new Pen();
        p1.setcolor("Red");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        
    }
}

class Pen{
    private String color;
    private int tip;

    String getcolor()
    {
        return this.color;
    }

    void setcolor(String newColor)
    {
        this.color=newColor;
    }

    void setTip(int tip)
    {
        this.tip=tip;
    }
}
