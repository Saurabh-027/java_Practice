import java.util.Scanner;
public class Count2 {
    Scanner sc = new Scanner(System.in);
    int number,count=0;
    public static void main(String[] args)
    {
        Count2 ct = new Count2();
        ct.takeInput();
    }
    public void takeInput()
    {
        number = sc.nextInt();
        for(int i=10; i<=number;i++)
        {
            int no=i;
            while(no>0) {
                int n = no % 10;
                if (n == 2) {
                    count++;
                }
                no = no / 10;
            }
        }
        System.out.println(count+1);
    }
}
