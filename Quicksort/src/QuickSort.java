import java.util.Scanner;
class QuickSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of aaray");
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, size-1);

        System.out.println("sorted array");
        ob.printArray(arr);

    }

    void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            int pi;
            pi = breaking(arr, low, high);


            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    int breaking(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] < pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}




