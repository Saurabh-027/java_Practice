package assignment1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the student id: ");
        int studentId = sc.nextInt();

        System.out.println("Enter the class: ");
        String cls = sc.next();

        System.out.println("Enter the course: ");
        String course = sc.next();

        st.show(studentId, cls, course);
        sc.close();

    }

    public void show(int studentId, String cls, String course) {
        System.out.println("Student id  is: " + studentId);
        System.out.println("Name of class: " + cls);
        System.out.println("Name of the course: " + course);
    }
}
