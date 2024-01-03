import java.util.ArrayList;

public class ArrayList3 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            list.add(i+1);
        }
        System.out.println(list);
        int idx1=3;
        int idx2=6;

        swap(list, idx1, idx2);
        System.out.println(list);
    

    }
}
