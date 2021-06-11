package polymorphism;

public class Poly {
    public void check() {
        System.out.println("First call");
    }
    public void check(int a) {
        System.out.println("A: " +a);
    }
    public void check(int a, int b) {
        System.out.println("A: "+a+" B:"+b);
    }
    public void check(int a,int b,int c){
        System.out.println("A: " + a + " B: " + b + " C: " +c) ;
    }
}
