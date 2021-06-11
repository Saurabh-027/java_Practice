public class Try3 {
    public static void main(String[] args)
    {
        String [] sa = {"Tom", "jerry"};
        for(int i=0;i<3;i++)
        {
            for(String s : sa )
            {
                System.out.println(i+ " " +s);
                if(i == 1)
                {
                    break;
                }
            }
        }
    }
}
