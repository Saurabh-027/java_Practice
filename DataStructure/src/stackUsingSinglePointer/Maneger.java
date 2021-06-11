package stackUsingSinglePointer;

public class Maneger {
    public static void main(String[] args)
    {
        StackUsingSinglePointer ssp = new StackUsingSinglePointer();

        ssp.push(53);
        ssp.push(76);
        ssp.push(23);
        ssp.push(93);

        ssp.show();

        ssp.pop();

        ssp.show2();

    }
}
