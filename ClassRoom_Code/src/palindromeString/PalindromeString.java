package palindromeString;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.next();
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.check(str);
    }
    void check(String str) {
        int length = str.length();
        int j = length - 1;
        boolean palin = false;
        for (int i = 0; i <= j; i++) {
            char ch, ch2;

            ch = str.charAt(i);
            ch2 = str.charAt(j);

            if (ch != ch2) {
                palin = true;
            }
            j--;
        }
        if (!palin) {
            System.out.print("String is palindrome.");
        } else {
            System.out.print("String in not palindrome");
        }
    }
}
