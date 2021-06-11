package series;
import java.util.*;
public class Series {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,n;
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		int d=1;
		int m=a+(d*b);
		for(int i=0;i<n;i++)
		{
			System.out.print(m+" ");
			d=d+d;
			m=m+d*3;
		}
		sc.close();
	}

}

/* Output
 * a=5
 * b=3
 * n=5
 * 8 14 26 50 98
 * */
