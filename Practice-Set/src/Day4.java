import java.util.Scanner;

public class Day4 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Day4 d4 = new Day4();
        d4.input();
    }

    public void input() {
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        check(arr, size);
    }

    public void check(int[] arr, int size) {
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] >=0)
            {
                sum = sum + arr[i];
            }
                if(arr[0] < arr[i])
                {
                    max = arr[i];
                }
            }
        int sum2 = max*(max+1)/2;
        if(sum2 == sum)
        {
            System.out.println("the missing next positive no is "+(max+1));
        }
        else if(sum < sum2)
        {
            int size2 = sum2-sum;
            System.out.println("the missing positive no is " +size2);
        }

    }
}