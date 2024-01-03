public class Sudoku {
    public static void sudokusolver(int sudoku[][],int row, int col)
    {
        //base case

        //recursion
        int nextrow= row, nextcol=col+1;
        if(col+1 ==9 )
        {
            nextrow =row+1;
            nextcol=0;
        }
        for(int digit=1; digit<=9; digit++)
        {
            if(isSafe(sudoku, row, col, digit))
            {
                sudoku[row][col] = digit;
                if(sudokusolver(sudoku, nextrow, nextcol))
                {
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
    }
}
