public class Recursion14binarystrings {
    public static void main(String args[])
    {
        printBinStrings(3, 0,new String(""));
    }

    public static void printBinStrings(int n, int lastPlace,String str)
    {
        //base case
        if(n==0)
        {
            System.out.println(str);
            return;
        }

        //kaam
       /*  if(lastPlace == 0)
        {
            //sit 0 on chair
            printBinStrings(n-1, 0, str+"0");
            printBinStrings(n-1, 1, str+"1");
        }else{
            printBinStrings(n-1, 0, str+"1");
        }
        */

        //kaam

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace ==0)
        {
            printBinStrings(n-1, 1, str+"1");
        }
    }
}
