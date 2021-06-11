import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import writingReading.*;

public class Management {
    WritingReadingUpdate wru = new WritingReadingUpdate();


    public void insert() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of record: ");
            int record = Integer.parseInt(br.readLine());
            for (int i = 0; i < record; i++) {

                System.out.println("enter the Student Id: ");
                int sid = Integer.parseInt(br.readLine());
                System.out.println("enter the name of student: ");
                String name = br.readLine();
                System.out.println("enter the roll number: ");
                int roll = Integer.parseInt(br.readLine());
                System.out.println("enter the section: ");
                String temp = br.readLine();
                char sec = temp.charAt(0);
                System.out.println("enter the course: ");
                String course = br.readLine();

                //  sc.close();

                wru.inset(sid, name, roll, sec, course);

                //    Scanner s = new Scanner(System.in);
                //    System.out.println("Press Enter");
                String temp2 = br.readLine();
            }
            // sc.close();
        }


    public void modify()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id in which you want to change: ");
        String id = sc.next();

        System.out.println("enter the feild you want to change: ");
        String change = sc.next();

        System.out.println("enter the new data: ");
        String n = sc.next();

        wru.modify(id,change,n);

        sc.close();
    }


    public void delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to delete: ");
        String id = sc.next();
        wru.delete(id);

        sc.close();
        //System.out.println("delete");
    }
    public void show()
    {
        wru.show();
    }

    public void search()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id you want to search: ");
        String id = sc.next();
        wru.search(id);

        sc.close();
    }


}
