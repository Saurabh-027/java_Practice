import java.util.Scanner;

public class Handler2
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Handler2 hc = new Handler2();
        hc.check();
    }
    public void check()
    {
        System.out.println("enter the no.");
        int a = sc.nextInt();
            if (a < 100)
            {
                throw new ArithmeticException("not valid");
            }
    }
}
