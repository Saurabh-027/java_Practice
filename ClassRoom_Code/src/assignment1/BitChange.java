package assignment1;

import java.util.Scanner;

public class BitChange {
    public static void main(String[] args) {

        BitChange bc = new BitChange();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of input: ");
        int n = sc.nextInt();

        int[] num1 = new int[n];
        int[] num2 = new int[n];
        System.out.println("enter the value for num1:");
        for (int i = 0; i < n; i++) {
            num1[i] = sc.nextInt();
        }
        System.out.println("Enter the value for num2: ");
        for (int i = 0; i < n; i++) {
            num2[i] = sc.nextInt();
        }

        bc.check(n, num1, num2);
    }

    public void check(int n, int[] num1, int[] num2) {
        int temp;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (num1[i] != num2[i]) {
                if (num1[i] == num2[i + 1]) {
                    temp = num1[i];
                    num1[i] = num2[i + 1];
                    num1[i + 1] = temp;
                    count++;
                } else {
                    num1[i] = num2[i];
                    count++;
                }

            }
            temp = 0;
        }

        if(num1[n-1] != num2[n-1])
        {
            num1[n-1] = num2[n-1];
            count++;
        }
        System.out.println(count);
    }

}