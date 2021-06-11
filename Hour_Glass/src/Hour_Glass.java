import java.util.Scanner;

public class Hour_Glass {

    int[][] arr1 = new int[3][3];
    int[][] arr = new int[6][6];
    int j=0;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Hour_Glass hg = new Hour_Glass();
       hg.callling();
    }

    private void callling()
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        calculation(arr);
    }

    public void calculation(int [][]arr)
    {
        for(int i = 0;i<6; i++)
        {
            for(j=i;i<6;j++)
            {
                for (int m = i; m < 3; m++)
                {
                    for (int n = j; n<=j+2; n++)
                    {
                        int o=0;
                        arr1[m][o] = arr[m][n];

                        System.out.print(arr1[m][o] +" ");
                        if (n == 2)
                        {
                            System.out.println("\n");
                        }
                        o++;
                    }
                }
            }

            }
        }

    }
