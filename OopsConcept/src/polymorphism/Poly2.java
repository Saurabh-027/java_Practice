package polymorphism;

public class Poly2 {
    public static void main(String[] a)
    {
        Poly poly = new Poly();
        poly.check();
        poly.check(2);
        poly.check(1,2);
        poly.check(1,2,3);
    }
}
