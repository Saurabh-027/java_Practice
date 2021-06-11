package coconut;

import java.util.Scanner;

public class Coconut {

    int[] arr = new int[100];
    int i = 0;

    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        Coconut coconut = new Coconut();

        int a;
        int b;
        int temp1;
        int temp2;

        System.out.println("Enter the no of test Cases");
        int testcase = sc.nextInt();

        System.out.println("Enter the data: ");
        for (int i = 0; i < testcase; i++) {

            a = sc.nextInt();
            b = sc.nextInt();
            temp1 = sc.nextInt();
            temp2 = sc.nextInt();

            coconut.calculate(a, b, temp1, temp2, testcase);

        }
    }

    public void calculate(int a, int b, int temp1, int temp2, int testCases) {

        int atemp = temp1 / a;
        int btemp2 = temp2 / b;

        int sum = atemp + btemp2;

        arr[i] = sum;
        i++;

        if (i == testCases) {
            lastOutput(arr, testCases);
        }
    }

    public void lastOutput(int[] arr, int testcase) {
        for (int i = 0; i < testcase; i++) {
            System.out.println(arr[i]);
        }
    }
}
