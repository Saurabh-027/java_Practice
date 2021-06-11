import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        TestClass test = new TestClass();
        //Scanner
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int []arr = new int[size];
        int sum = 0;


        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        test.sum(size,sum,arr);
        // Write your code here

    }
    public void sum(int size, int sum, int[]arr){
        int sum2 = 0;
        int []arr2 = new int[size];
        for(int i = 0; i < size; i++){
            int a = arr[i];
            for(int j = 0 ; j < size; j++){
                sum2 = sum2 + a;
            }
            arr2[i] = sum2;
            sum2 = 0;
        }
        for(int i=size-1;i>=0;i--){
            if(arr2[i] < sum){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
