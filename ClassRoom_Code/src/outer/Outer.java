//Create an outer class with a function display, again create another class inside the
// outer class named inner with a function called display and call the two functions in
// the main class.
package outer;

public class Outer {
    public void display()
    {
        System.out.println("Display function of outer class ");
    }
     class Inner {
        public void display()
        {
            System.out.println("Display function of inner class ");
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
