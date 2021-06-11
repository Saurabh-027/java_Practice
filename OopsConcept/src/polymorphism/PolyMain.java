package polymorphism;

public class PolyMain {
    public static void main(String[] args)
    {
        Poly poly = new Poly3();
        poly.check();

        poly = new Poly4();
        poly.check();

        poly = new Poly5();
        poly.check();
    }
}
