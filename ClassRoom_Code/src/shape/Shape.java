/*Write a program to create a class named shape.
In this class we have three sub classes circle, triangle and square each
class has two-member function named draw () and erase (). Create these using polymorphism concepts.*/

package shape;

public class Shape {

    public static void main(String[] args) {
        Shape shape = new circle();
        shape.draw();
        shape.erase();

        Shape shape1 = new square();
        shape1.draw();
        shape1.erase();

        Shape shape2 = new triangle();
        shape2.draw();
        shape2.erase();
    }

    protected void draw() {
        System.out.println("shape draw");
    }

    public void erase() {
        System.out.println("shape erase");
        System.out.println();
    }
}

class circle extends Shape {
    protected void draw() {
        System.out.println("draw Circle");
    }

    public void erase() {
        System.out.println("erase circle");
        System.out.println();
    }
}

class triangle extends Shape {
    public void draw() {
        System.out.println("draw triangle");
    }

    public void erase() {
        System.out.println("erase triangle");
        System.out.println();
    }

}

class square extends Shape {
    public void draw() {
        System.out.println("draw square");
    }

    public void erase() {
        System.out.println("erase square");
        System.out.println();
    }
}