package studentExamination;
import java.util.Scanner;
class Office {
    Scanner sc = new Scanner(System.in);
    int empno = 0;
    String empname = null;
    int salary = 0;
    void getvalue() {
        System.out.println("Enter the empno: ");
        empno = sc.nextInt();

        System.out.println("Enter the empname: ");
        empname = sc.next();

        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
    }
}
public class Teaching extends Office {

    Scanner sc = new Scanner(System.in);
    String Designation;
    public void setvalue() {
        System.out.println("enter the Designation: ");
        Designation = sc.next();

        System.out.println("The Empno is: " + empno);
        System.out.println("The Empname is: " + empname);
        System.out.println("The Salary is: " + salary);
        System.out.println(" Designation is: " + Designation);
    }
    public static void main(String[] args) {

        Teaching teaching = new Teaching();
        teaching.getvalue();
        teaching.setvalue();
    }
}
