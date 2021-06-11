package consoleprogramming;

import java.io.Console;

public class ConsoleProg
{
    public static void main(String [] args)
    {
        Console cons = System.console();

        if(cons == null)
        {
            System.out.print("No console available");
            return;
        }

        System.out.print("Enter your name: ");
        String name = cons.readLine();
        System.out.println("Hello " + name);

    }
}
