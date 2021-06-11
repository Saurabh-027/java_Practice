import java.util.Scanner;

public class Apple {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Apple ap = new Apple();
        ap.input();
    }
    public void input()
    {
        int total = sc.nextInt();
        int more = sc.nextInt();
        calculation(total,more);
    }

    public void calculation(int total,int more)
    {
        int rem = total % 2;
        int div = total / 2;

        int gia = div + rem;
        int maddie = div;

        System.out.println(gia);
        System.out.println(maddie);
    }
}
