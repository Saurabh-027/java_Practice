package mathematicalOperation;

public class MultiDiv extends AddSub {
    int multi3;
    double div4;

    public void multi() {
        multi3 = num1 * num2;
    }

    public void div() {
        div4 = num1 / num2;
    }

    public void show() {
        System.out.println("Sum of two no is: " + add1);
        System.out.println("Subtraction of two no is: " + sub2);
        System.out.println("Multiplication of two no is: " + multi3);
        System.out.println("Division of two no is: " + div4);
    }

    public static void main(String[] args) {
        MultiDiv asmd = new MultiDiv();


        asmd.add();
        asmd.sub();
        asmd.multi();
        asmd.div();
        asmd.show();
    }
}
