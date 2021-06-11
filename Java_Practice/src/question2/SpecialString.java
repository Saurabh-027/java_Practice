package question2;

import java.util.*;

public class SpecialString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();

            int lowerLimit = sc.nextInt();
            int upperLimit = sc.nextInt();

            check(str, lowerLimit, upperLimit);
    }

    static void  check(String str,int lowerlimit,int upperlimit)
    {
        int count = 0;
        int lower = lowerlimit - 1;
        int upper = upperlimit - 1;

        for(int i = lower; i<=upper; i++)
        {
            char ch = str.charAt(i);
            int a = i+1;
            for(int j=a; j<=upper; j++)
            {
                char ch1 = str.charAt(j);
                if(ch == ch1)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
