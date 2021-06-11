package abstractMethod;

import java.util.Scanner;

class Triangle extends Shape {
    Scanner sc = new Scanner(System.in);

    void printarea() {
        System.out.println("Enter the base of Triangle: ");
        num = sc.nextInt();
        System.out.println("Enter the Height of Triangle");
        num2 = sc.nextInt();
        area = (num * num2) / 2;
        System.out.println("Area of Triangle: " + area);
    }

}
