package reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.println("Enter the String you want to reverse");
        String str = sc.next();

        int j = str.length();

        for(int i =j-1; i>=0; i-- ) {
            ch = str.charAt(i);
            System.out.print(ch);
        }


    }
}
