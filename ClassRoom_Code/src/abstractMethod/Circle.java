package abstractMethod;

import java.util.Scanner;

public class Circle extends Shape {
    Scanner sc = new Scanner(System.in);
    public void printarea()
    {
        System.out.println("Enter the radius of the circle: ");
        num = sc.nextInt();
        area = (3.17 * num * num);
        System.out.println("Area of Circle is: "+area);
    }
}
