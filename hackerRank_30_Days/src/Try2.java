public class Try2 {
    public static void main(String[] args)
    {
        Try2 tt = new Try2("guiter");
        Try2 tt2 = new Try2("Tv");

        System.out.println(tt2.equals(tt));
    }
    String n;
    Try2(String name)
    {
        n=name;
    }
    public boolean equals(Object o)
    {
        Try2 m = (Try2) o;
        if(m.n!=null)
        {
            return true;
        }
        return false;
    }
}
