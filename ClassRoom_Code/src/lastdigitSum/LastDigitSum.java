package lastdigitSum;

import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        LastDigitSum lastDigitSum = new LastDigitSum();
        lastDigitSum.takeinput();
    }

    public void takeinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int num = sc.nextInt();
        System.out.println("Enter the second no: ");
        int num2 = sc.nextInt();

        sumoflast(num, num2);
    }

    public void sumoflast(int num, int num2) {
        int last1 = num % 10;
        int last2 = num2 % 10;

        int sum = last1 + last2;

        System.out.println("Sum of last two digit: " + sum);
    }
}

