package assignment1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean count = false;
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count = true;
                break;
            }
        }
        if (!count) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime number.");
        }
    }
}
