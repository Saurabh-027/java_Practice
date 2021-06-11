import java.util.*;
public class Sum_of_Series {
    Scanner sc = new Scanner(System.in);
    public static void main(String [] args)
    {
        Sum_of_Series sos =new Sum_of_Series();
        sos.sum();
    }
    public void sum()
    {
        System.out.println("enter the no. :");
        int num=sc.nextInt();
        int count=1;
        int sum=1;
        for(int i=3;i<num; )
        {
            if(count%2==0)
            {
                int temp=(1/(i));
                sum=sum+temp;
            }
            else
            {
                int temp2=(1/(i));
                sum=sum-temp2;
            }
            count++;
            i=i+2;
        }
        System.out.println("Sum_of_Series: " +sum);
    }
}
