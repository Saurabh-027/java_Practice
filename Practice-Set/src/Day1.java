import java.util.Scanner;

import static java.lang.Math.abs;


public class Day1 {
     Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        Day1 d = new Day1();
        d.input();
    }
    public void input ()
    {

        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter the no. ");
        for(int i=0;i<size;i++)
        {
         arr[i] = sc.nextInt();
        }
        check(arr ,size);
    }

    public void check( int[]arr, int size)
    {
        //To find the minimum no. int he array.
        int size2;
        int min=arr[0];
        int max = arr[0];
        System.out.println("Enter the no to be search");
        int check = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if (arr[i] < min) {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        if(check>max)
        {
             size2 = check;
        }
        else
        {
            size2 = max;
        }

        //To check the sum of no. exist in the array or not.
        int []arr2 = new int[size2];
        for(int i=0;i<size;i++)
        {
            int k =(arr[i]-(check-1));
            int m = abs(k);
            int j = arr[i]-1;
            if(arr2[j]==0)
            {
                if (arr2[m] == 0)
                {
                    arr2[m] = arr[i];
                }
            }
            else
            {
                System.out.println("existing");

            }
        }

    }
    }