public class loops2 {
    public static void main(String args[])
    {
        //print square pattern

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Print reverse of a number
        int n=10899;
        while(n>0)
        {
            int ldigit=n%10;
            System.out.print(ldigit);
            n=n/10;
        }
        System.out.println();

        //Reverse the given number
        int num=45678;
        int rev=0;
        while(num>0)
        {
            int ldigit=num%10;
            rev=(rev*10)+ ldigit;
            num/=10;
        }
        System.out.println(rev);



        //do-While loop
        int counter=1;
        do{
            System.out.println("Hello");
            counter++;
        }while(counter<=3);
    }
}
