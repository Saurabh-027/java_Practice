import java.util.*;
class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner s = new Scanner(System.in);
        myCode1 mc = new myCode1();
        int num = s.nextInt();
        mc.check(num);
    }

    public void check(int num)
    {
        int rev=1;
        int tmp = num;
        while(num != 0)
        {
            int rem = num % 10;
            rev = rev*10 +rem;
            num = num / 10;
        }
        int sum = rev + tmp;
        if(tmp == sum)
        {
            System.out.println(sum);
        }
        else
        {
            check(sum);
        }

    }
}