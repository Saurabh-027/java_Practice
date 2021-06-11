	import java.util.*;
	class try10
	{
	public static void main(String [] args)
	{
	  int num=0;
	  int rev=0;
	  int copy=0,n=0,count=0; 
	  int []arr =new int[10];
	  int []arr1 =new int[10];

	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter how many numbers you want to enter");
	  num= sc.nextInt();
	  System.out.println("Enter Elements");                    
	  for(int i = 0; i < num; i++)
	  { 
	    arr[i] = sc.nextInt();
	  }
	for(int j=0;j<num;j++)
	{    	
	    copy=arr[j];
	while(copy!=0)
	{
	    int digit =copy% 10;
	    rev=(rev*10)+digit;
	    copy= copy/10;
	}    
	 if(rev==arr[j])          
	    {
		arr1[n]=rev;
		count++;
		rev=0; 
	        n++;
	    }
	    else
	    {
	       rev=0;
	    }
	  }
	for(int v=0;v<arr1.length;v++)
	{
	Arrays.sort(arr1);
	System.out.println(arr1[v]);

	}
	}
	}
