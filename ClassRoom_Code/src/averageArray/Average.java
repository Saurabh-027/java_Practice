package averageArray;

public class Average {
    public static void main(String[] args)
    {
        int sum = 0;

        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        for(int i = 0; i< len; i++)
        {
            sum = sum + arr[i];
        }
        float avg = sum/len;
        System.out.println();
        System.out.println("Average of a array: " + avg);
    }
}
