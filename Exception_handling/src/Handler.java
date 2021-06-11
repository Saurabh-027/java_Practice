import java.util.Scanner;

public class Handler
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Handler hc = new Handler();
        hc.exc();
    }
    public void exc()
    {
        System.out.println("enter the no for div: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
            System.out.println(a / b);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("arithmetic exception");
        }
    }
}
