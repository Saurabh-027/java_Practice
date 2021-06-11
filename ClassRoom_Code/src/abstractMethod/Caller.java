package abstractMethod;
import java.util.Scanner;
public class Caller {
    public static void main(String[] args) {
        boolean count = true;
        Scanner sc = new Scanner(System.in);
        while (count) {
        System.out.println("Press 1 for Area of Triangle.");
        System.out.println("Press 2 for Area of Rectangle.");
        System.out.println("Press 3 for Area of Circle.");
        System.out.println("press 4 for exit. ");
            System.out.println();
        System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Triangle triangle = new Triangle();
                    triangle.printarea();
                    break;
                case 2:
                    Shape shape1 = new Rectangle();
                    shape1.printarea();
                    break;
                case 3:
                    Shape shape2 = new Circle();
                    shape2.printarea();
                    break;
                case  4:
                    count = false;
            }
        }
    }
}
