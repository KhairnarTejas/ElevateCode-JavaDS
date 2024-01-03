import java.util.ArrayList;

public class pairsum2sortedandrotated {

    public static boolean pairsum2(ArrayList<Integer> list, int target)
    {
        int breakingpoint =-1;
        int n=list.size();
        for(int i=0; i<list.size();i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                breakingpoint= i;
                break;
            }
        }

        int lp = breakingpoint+1; //smallest
        int rp = breakingpoint; //largest

        while(lp != rp)
        {
            if((list.get(lp) + list.get(rp) )== target)
            {
                return true;
            }
            else if((list.get(lp) + list.get(rp) )< target)
            {
                lp = (lp+1)%n;
            }
            else if((list.get(lp) + list.get(rp) )> target)
            {
                rp= (n+ rp -1)%n;
            }
        }
        return false;
    }
    public static void main(String args[])
    {    ArrayList<Integer> height = new ArrayList<>();
        //11 15 6 8 9 10

        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);

        System.out.println(pairsum2(height, 16));
        System.out.println(pairsum2(height, 4));

    }
}
