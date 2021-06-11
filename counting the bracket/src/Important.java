import java.util.*;
public class Important 
{
	public static void main(String args[])
	{
		int count=0;
		boolean c=false;
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(')
			{
				c=true;
			}
			if(c==true && ch==')')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
