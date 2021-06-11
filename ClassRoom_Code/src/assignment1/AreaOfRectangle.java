package assignment1;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle aor = new AreaOfRectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        int len = sc.nextInt();

        System.out.println("Enter the width of rectangle");
        int width = sc.nextInt();

        aor.area(len, width);

        sc.close();
    }

    public void area(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle : " + area);

    }
}
