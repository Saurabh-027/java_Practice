package rangePrime;

import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int num = sc.nextInt();
        System.out.println("Enter the last no: ");
        int last = sc.nextInt();

        int count = 0;

        int counter = 0;

        for(int i = num; i< last ; i++)
        {
            for(int j = 2; j< i; j++)
            {
                if(i % j == 0)
                {
                    count ++;
                }
            }
            if(count == 0)
            {
             counter++;
            }
            count = 0;
        }
        System.out.println(counter);
    }
}
