import java.util.ArrayList;
import java.util.Collections;
public class ArrayList4Sorting {
    public static void main(String args[])
    {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(5);
        list.add(25);
        list.add(33);
        list.add(46);
        list.add(13);
        list.add(16);
        list.add(2);

        System.out.println(list);
        Collections.sort(list);  //Ascending Sort
        System.out.println(list);
        
        //Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
