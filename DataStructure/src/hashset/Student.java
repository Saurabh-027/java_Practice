package hashset;

import java.util.HashSet;
import java.util.Objects;

public class Student {
    String name;
    int roll;

    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student st = new Student();

        Student sr = new Student();

        Student se = new Student();

        st.name = "saurabh";
        st.roll = 96;

        sr.name = "vicky";
        sr.roll = 89;

        se.name = " devil";
        se.roll = 85;

        hs.add(sr);
        hs.add(st);
        hs.add(se);

        //hs.add(tr);


        System.out.println("-----------------------------");

        for (Student sty:hs) {
            System.out.println(sty.name +" " +sty.roll);


        }
    }

    @Override
    public boolean equals(Object o) {
        Student se = (Student) o;
       if(se.roll == this.roll)
       {
           return true;
       }
       else
       {
           return  false;
       }
    }

    @Override
    public int hashCode() {
        return 50;
    }
}