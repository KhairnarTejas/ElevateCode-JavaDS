import java.util.ArrayList;
public class ArrayList2 {
public static void main(String args[]){
    ArrayList<Integer> list =new ArrayList<>();

    for(int i=0;i<10;i++)
    {
        list.add(i+1);
    }
    
    System.out.println(list);

    //To find maximum
    int max=Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++)
    {
        if(list.get(i) >max)
        {
            max=list.get(i);
        }
    }

    System.out.print("Maximum Element = "+max);
}

}
