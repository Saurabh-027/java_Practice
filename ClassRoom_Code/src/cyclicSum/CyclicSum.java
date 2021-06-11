package cyclicSum;

import java.util.Scanner;

public class CyclicSum {
    public static void main(String[] args) {
        CyclicSum cyclicSum = new CyclicSum();
        cyclicSum.input();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        reverse(num);

    }

    public void reverse(int num) {
        int temp = num;
        int rev = 0;


        while (temp != 0) {
            int n = temp % 10;
            rev = rev * 10 + n;
            temp = temp / 10;
        }
        process(rev);

    }

    public void process(int rev) {
        int sum = 0;

        while (rev != 0) {
            int temp = rev;
            while (temp != 0) {
                int n = temp % 10;
                sum = sum + n;
                temp = temp / 10;
            }
            rev = rev / 10;
        }
        System.out.println("Cyclic sum of number: " + sum);
    }
}
