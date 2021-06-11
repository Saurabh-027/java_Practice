import java.util.Scanner;

public class Codechef {
    Scanner sc = new Scanner(System.in);
    int size;
    int n=0;
    public static void main(String[] args)
    {
        Codechef cd = new Codechef();
        cd.takeInput();
    }

    public void takeInput()
    {
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(size,arr);
    }
    public void reverse(int size,int[]arr)
    {
        int m=0,rev=0;
        for(int i=0;i<size;i++)
        {
            int num = arr[i];
            while(num>0)
            {

                m = num%10;
                rev = rev*10+m;
                num = num/10;


            }
            System.out.println(rev);
            rev=0;
            m=0;
        }
    }
}
