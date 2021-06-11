//Write a Java program that displays area of different Figures
// (Rectangle,Square,Triangle) using the method overloading.

package methodOverloading;

import java.util.Scanner;

public class MethodOverloading {
    Scanner sc = new Scanner(System.in);
    public static void main(String [] a)
    {
        calculate(5,70);
        calculate(7);
        calculate(100,8.0);
    }

    static void calculate(int length,int bredth)
    {
        System.out.println("Area of rectangle: "+ (length * bredth));
    }
    static void calculate(int side)
    {
        System.out.println("Area off square: " +(side*side));
    }
    static void calculate(int base,double height)
    {
        System.out.println("Area of triangle: " +((base*height)/2));
    }
}
