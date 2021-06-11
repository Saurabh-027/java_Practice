import java.util.Scanner;

public class ELearningPort
{
    public static void main(String[] args)
    {
        System.out.println("enter how many prime no you want: ");
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int count=0;
        int i=3;
        int m=0;
        while(m<k)
        {
            for(int j = 2; j <= i;j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println(i);
                m++;
            }
            i++;
            count=0;
        }
    }
}
