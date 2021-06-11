package question1;

import java.util.Scanner;

public class Special {
    public static void main(String[] args)
    {
        Special sc = new Special();
        sc.input();
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);

        int lowerlimit = sc.nextInt();
        int upperlimit = sc.nextInt();

        check(lowerlimit,upperlimit);
    }

    void check(int lowerlimit, int uppperlimit)
    {
        int specialNumber = 0;
        int i = lowerlimit;
        int sum =0;

        while(i <= uppperlimit)
        {

            if(specialNumber < i)
            {
                specialNumber =  spec(i);
            }
                sum = sum + specialNumber;
                i++;
        }
        System.out.println(sum);
    }

    int spec(int num)
    {
        int count = 0;


        while(true)
        {
            int digi = num;
            int len = String.valueOf(num).length();
            while (digi != 0)
            {
                int digit = digi % 10;
                if (digit == 2 || digit == 5)
                {
                    count++;
                }
                digi = digi / 10;
            }
            if(count == len)
            {
                return num;
            }
            else
            {
                num++;
            }
            count =0;
        }
    }
}
