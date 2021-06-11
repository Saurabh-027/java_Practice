import java.util.Scanner;

public class Day7 {
    Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
        Day7 d7 = new Day7();
        d7.takeInput();
    }

    void takeInput()
    {
        System.out.println("Enter the size of message");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the coded message");
        for(int i=0;i<size;i++)
        {
             arr[i] = sc.nextInt();
        }
        solve(arr,size);
    }

    void solve(int []arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0 && arr[i]<27)
            {

            }

        }
    }
}
