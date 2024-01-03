import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[])
    {

        //Java Collection Framework
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        //Add Operation
        list.add(1);//O(1)
        list.add(2);
        list.add(3);


        list.add(1,9); //O(n)

        System.out.println(list);

        //Get Operation  O(1)
        int element =list.get(2);
        System.out.println(element);

        //remove operation  O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element At Index  O(n)
        list.set(1,10);
        System.out.println(list);

        //Contatins Element  
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size
        list.size();

        //Print reverse

        for(int i=list.size()-1; i>=0;i-- )
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
