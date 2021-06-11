public class ClgWork {
    public static void main(String[] args)
    {
        int[][] a = {
                    {1,0,5},
                    {4,2,1},
                    {2,4,1}
                    };
        int [][]b ={
                    {1,0,5},
                    {4,2,1},
                    {2,4,1}
                    };
        ClgWork cw = new ClgWork();
        cw.columnsort(a);
        cw.rowsort(b);
    }
   void  rowsort(int[][] row)
    {
        for (int i = 0; i < 3; i++)
        {
            // loop for column of matrix
            for (int j = 0; j < 3; j++)
            {
                // loop for comparison and swapping
                for (int k = 0; k < 3 - j - 1; k++)
                {
                    if (row[i][k] > row[i][k + 1])
                    {
                        int temp = row[i][k];
                        row[i][k] = row[i][k+1];
                        row[i][k+1] = temp;
                    }
                }
            }
        }
        System.out.println("\n Row Wise Sorted Array Is : \n");
        for ( int i = 0; i < 3; i++ )
        {
            for ( int j = 0; j < 3; j++ )
            {
                System.out.print(row[i][j] +" ");
            }
            System.out.println();
        }
    }
    void columnsort(int [][]col)
    {
        for (int r = 0; r < 3; r++)
        {
            // loop for column of matrix
            for (int s = 0; s < 3; s++)
            {
                // loop for comparison and swapping
                for (int c = s; c < 3 ; c++)
                {
                    if (col[s][r] > col[c][r])
                    {
                        int temp = col[s][r];
                        col[s][r] = col[c][r];
                        col[c][r] = temp;
                    }
                }
            }
        }
        System.out.println("\n Column Wise Sorted array Is : \n");
        for (int r = 0; r < 3;r++ )
        {
            for (int c = 0; c < 3; c++ )
            {
                System.out.print( col[r][c] + " ");
            }
            System.out.println();
        }
    }
}

