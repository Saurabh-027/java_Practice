package abstractMethod;
import java.util.Scanner;

class Rectangle extends Shape {
    Scanner sc = new Scanner(System.in);
    void printarea()
    {
        System.out.println("Enter the length of Rectangle: ");
        num = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle: ");
        num2 = sc.nextInt();
        area =  (num * num2);
        System.out.println("Area of Rectangle: " +area);
    }
}