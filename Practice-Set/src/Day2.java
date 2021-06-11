import java.util.Scanner;

public class Day2 {

    public static void main(String[] args)
    {
        Day2 d = new Day2();
        int mul=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter the no:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            mul = mul*arr[i];

        }
        d.check(arr,mul,size);

    }
    public void check(int[]arr, int mul,int size)
    {
        int []arr2 = new int[size];
        for(int i=0;i<size;i++)
        {
            arr2[i] =mul/arr[i];
            System.out.print(" "+arr2[i]);
        }
    }
}
