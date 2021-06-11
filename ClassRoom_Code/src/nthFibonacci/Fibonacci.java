package nthFibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.input();
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int position = sc.nextInt();
        int n = 0;
        int n1 = 1;
        int sum;
        int count = 2;
        do {

            sum = n + n1;
            n = n1;
            n1 = sum;
            count++;
        } while (count != position);
        System.out.println(sum);
    }
}
