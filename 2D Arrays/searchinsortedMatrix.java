public class searchinsortedMatrix {

    public static boolean staircasesearch(int matrix[][],int key)
    {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(key==matrix[row][col])
            {
                System.out.println("Key Found.");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key Not Found...");
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][]={
            {10,20,30,40},{15,25,35,45},
            {27,29,37,48},{32,33,39,50}
        };
        int key=33;
        staircasesearch(matrix,key);
    }
}
