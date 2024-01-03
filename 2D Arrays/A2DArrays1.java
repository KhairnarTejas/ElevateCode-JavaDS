import java.util.*;

public class A2DArrays1{
    public static void search(int matrix[][],int key)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found at cell ( "+i+" , "+j+" ) ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int matrix[][]=new int[3][3];
        int m=3;
        int n=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
