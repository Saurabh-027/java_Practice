package question1;

import java.util.Scanner;

public class SpecialNumber
{
    public static void main(String[] args)
    {
        SpecialNumber sn = new SpecialNumber();
        Scanner sc = new Scanner(System.in);

        int lowerlimit = sc.nextInt();
        int upperLimit = sc.nextInt();

        sn.check(lowerlimit, upperLimit);
    }


    void check(int lowerlimit, int upperlimit)
    {
        for (int i = lowerlimit; i <= upperlimit; i++)
        {
            special(i);
        }
    }


    void special(int num)
    {
        int count = 0;
        int temp = num;

        if (num <= 2)
        {
            System.out.println(2);
        }
        else
            {
                while (num != 0)
                {
                    int digit = num % 10;
                    if (digit == 2 || digit == 5)
                    {
                        count++;
                    }
                    num = num / 10;
                }

                print(temp,count);
        }
    }

    void print(int temp,int legth)
    {
        int len = String.valueOf(temp).length();
        int con = temp;

        if(temp <= 2)
        {
            System.out.println("2");
        }

       else if(len == legth)
        {
            System.out.println(temp);
             con = temp;
        }
        else
        {
            System.out.println("temp");
        }
    }
}