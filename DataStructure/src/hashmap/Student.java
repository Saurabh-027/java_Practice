package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Student {
    String name;
    int roll;

    public static void main(String[] args) throws IOException
    {
        HashMap<Student, Laptop> hm = new HashMap<>();

        Student student = new Student();
        Laptop lp = new Laptop();


            lp.brand = "hp";
            lp.name= "vicky";

            Laptop lt = new Laptop();
            lt.name = "vikram";
            lt.brand = "acer";

            student.name = "vicky";
            student.roll = 43;

            Student st = new Student();

            st.name ="saurabh";
            st.roll = 43;

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        hm.put(student, lp);
        hm.put(st,lt);

        System.out.println();

    /*    System.out.println("Enter the details of five student: ");
        System.out.println("Value: ");
        System.out.println("Key: ");*/

       /* for (int i = 0; i < 2; i++) {
            student.name = sc.readLine();
            student.roll = Integer.parseInt(sc.readLine());

            hm.put(s, student.roll);

        }
      /*for (Student str : hm.keySet()) {
            System.out.println(str);
        }*/
      /* int s = (int) hm.get(student);
        System.out.println(s);*/
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        System.out.println("----------------------------------------");
        if (s.roll == this.roll) {
                return true;
        }
        else
        {
            return false;

        }
}

    @Override
    public int hashCode() {
        return 10;
    }
}
