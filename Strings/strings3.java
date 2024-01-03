public class strings3 {
    public static int getshorestPath(String path)
    {
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir = path.charAt(i);

            //north
            if(dir=='N')
            {
                y++;
            }

            //south
            if(dir =='S')
            {
                y--;
            }

            //east
            if(dir=='E')
            {
                x++;
            }

            //west
            if(dir == 'W')
            {
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;

        return ((int)Math.sqrt(x2+y2));
    }
    public static void main(String args[])
    {
        String path = "WNEENESENNN";
        System.out.println(getshorestPath(path));
    }
    
}
