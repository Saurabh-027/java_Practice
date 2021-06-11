class feling{
    public String type="f";
    public feling()
    {
        System.out.println("feling");
    }
}
public class Try4 extends feling{
    public Try4()
    {
        System.out.println("Try4");
    }
    void go()
    {
        type = "c";
        System.out.println(this.type + super.type);

    }
    public static void main(String[] args)
    {
        new Try4().go();
    }
}
