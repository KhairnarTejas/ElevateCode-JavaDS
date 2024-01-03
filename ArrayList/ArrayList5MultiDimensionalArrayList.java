import java.util.ArrayList;
public class ArrayList5MultiDimensionalArrayList {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); list1.add(6);
        mainList.add(list1);

        System.out.println(mainList);
    }
}
