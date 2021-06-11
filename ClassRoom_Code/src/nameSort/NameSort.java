package nameSort;
import java.util.Scanner;
public class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameSort ch = new NameSort();
        System.out.println("Enter the no. of name you want to enter: ");
        int count = sc.nextInt();
        String []name = new String[count];
        for(int i =0; i<count; i++)
        {
            name[i] = sc.next();
        }
        ch.check(name,count);
    }
    public void check(String []names,int count)
    {
        String temp;
        for (int i = 0; i <count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        show(names,count);
    }
    public void show(String []name ,int size){
        System.out.println("Sorted list of name: ");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}
