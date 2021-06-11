import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    String str1,str ;
    public static void main(String[] args)
    {
        Game gm = new Game();
        gm.take_Input();
    }

    public void take_Input()
    {
        System.out.println("Enter the data");
        str = sc.next();
        for(int i=0;i<str.length();i++)
        {
         char ch = str.charAt(i);
            for(int j=0;j<i;j++)
            {
                if(ch == 'T')
                {
                    ch = 'H';
                }
                else
                {
                    ch = 'T';
                }
                System.out.print(ch);
            }
        }
    }
}

