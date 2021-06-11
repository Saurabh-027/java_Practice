import java.util.*;
public class Palindrome {

	public static void main(String [] args)
	{
		String str=null;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
			 str = sc.next();
			 int n = str.length();
			char ch;
			for(int i = 0; i<n; i++)
			{
				 ch = str.charAt(i);
				 for(int j = 1; j<n; j++)
				 {
					 char ch2 = str.charAt(j);
					 if(ch == ch2)
					 {
						 count++;
					 }
				 }
				 System.out.println(""+count);
				 if(count == n-1)
				 {
					 System.out.println("string is palindron");
					 break;
				 }
				 if(count == n-2)
				 {
					 System.out.println("string in not palindrome");
					 break;
				 }
				
			}
			sc.close();
		}
		
	}