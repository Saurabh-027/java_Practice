import java.util.Scanner;

public class Handler3 {
    Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
        Handler3 hc = new Handler3();
        hc.check();
    }
    public void check()
    {
        int a = sc.nextInt();
        int b = sc.nextInt();

        try
        {
         int n = a/b;
        } catch (Exception e)
        {
            throw new ArithmeticException("please enter valid no.");
        }
    }
}