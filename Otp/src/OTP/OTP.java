package OTP;
import java.util.*;
public class OTP {
	public static void main(String[] args)throws java.lang.Exception
	{
		char[] ch=new char[100];
		char cn='A';
		int n=0;
		for(int i=0;i<26;i++)
		{
			ch[i]=(char)(cn+i);
		}
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the Message");
		String str=sc.next();
		System.out.println("enter the key:");
		String key=sc.next();
		for(int i=0;i<str.length();i++)
		{
			f:
			{
			char q=str.charAt(i);
			for(int o=0;o<25;o++)
			{
				if(q==ch[o])
				{
					 n=o;
					for(int j=0;j<=key.length();j++)
						{
							char w=key.charAt(i);
							for(int m=0;m<25;m++)
							{
								if(w==ch[m])
								{
									int b=(n+m)%26;
									System.out.print(ch[b]);
									b=0;
									break f;
								}
							}
						}	
				}
			}
		}	
	}
		sc.close();	
	}
}
