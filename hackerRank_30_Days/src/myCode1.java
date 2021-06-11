import java.util.*;
    class myCode1
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
            int rev=0;
            int rev2=0;
            int tmp = num;
            while(num != 0)
            {
                int rem = num % 10;
                rev = rev*10 +rem;
                num = num / 10;
            }

            if(tmp == rev)
            {
                System.out.println(rev);
            }
            else
            {
                int sum = rev + tmp;
                int sum2 = sum;

                while(sum != 0)
                {
                    int rem = sum % 10;
                    rev2 = rev2*10 +rem;
                    sum = sum / 10;
                }
                if(sum2 == rev2)
                {
                    System.out.println(rev2);
                }
                else
                {
                    rev2 = sum2+rev2;
                    check(rev2);
                }
            }

        }
    }
