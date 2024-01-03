import java.util.ArrayList;

public class PairSum12Pointer {

    public static boolean pairsum1(ArrayList<Integer> list, int target)
    {
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp)
        {
            if((list.get(lp) + list.get(rp) )== target)
            {
                return true;
            }
            else if((list.get(lp) + list.get(rp) )< target)
            {
                lp++;
            }
            else if((list.get(lp) + list.get(rp) )> target)
            {
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> height = new ArrayList<>();
        //1 2 3 4 5

        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);

        System.out.println(pairsum1(height, 7));
        System.out.println(pairsum1(height, 47));
    }
}
