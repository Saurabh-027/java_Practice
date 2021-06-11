import java.util.Scanner;
class Consecutive {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter the element of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
            Consecutive cs = new Consecutive();
            cs.find(arr,size);
    }
    public void find(int[]arr,int size)
    {
        int n =size-1;
        int []sum = new int[n];
        int j=0;

        for(int i=0;i<n;i++)
        {
                int s = arr[i] + arr[i + 1];
                sum[j]=s;
                j++;
        }
            finding(sum);
    }
    public void finding(int[]sum)
    {

        int size = sum.length;
        int n=sum[0];
        int count = 0;
        for(int i=0;i<size;i++)
        {
            if(n < sum[i])
            {
                n = sum[i];
                count = i;
            }
        }
        System.out.println("sum of "+ (count)  +" and " +(count+1)+ " is equal to "+n);
    }
}
