package practice;


import java.util.Scanner;

public class AbsoluteSorting {
    public static void main(String[] args) {
        AbsoluteSorting as = new AbsoluteSorting();

        as.input();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size if array: ");
        //int size = sc.nextInt();

        //int[] arr = new int[size];

       /* for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
*/int arr[] = {-8,-5,-3,-1,3,6,9};
int size = 7;
        check(arr,size);
    }

    public void check(int[]arr , int size)
    {
        int []sorted = new int[size];

        int j = size-1;
        int i = 0;
        int m = j;
        while( i <= j)
        {
            int temp  =  Math.abs(arr[i]);
            if(arr[j] >= temp)
            {
                sorted[m] = arr[j];
                m--;
                j--;
            }
            else
            {
                sorted[m] = arr[i];
                m--;
                i++;
            }
        }
        show(sorted);
    }

    public void show(int[] sorted)
    {
        for(int j = (sorted.length-1) ; j >= 0; j--)
        {
            System.out.println(sorted[j]);
        }
    }
}
