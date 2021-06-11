import java.util.*;
public class Day_6 {

    public static void main(String[] args)
    {

        Scanner sc  = new Scanner(System.in);
        int e=0;
        int o=0;
        int n = sc.nextInt();
        String str[] = new String[10];
        char streven[]=new char[10000];
        char strodd[] =new char[10000];

        for(int i=0;i<n;i++)
        {
            str[i] = sc.next();
        }



        for(int j=0;j<n;j++) {
            streven[0] = str[j].charAt(0);
            for (int i = 1; i < str[j].length(); i++)
            {
                if (i % 2 == 0)
                {
                    streven[e] = str[i].charAt(i);
                    e++;
                }
                else
                {
                    strodd[o] = str[i].charAt(i);
                    o++;
                }
            }
            System.out.print(streven + " " + strodd);
        }
    }
}
