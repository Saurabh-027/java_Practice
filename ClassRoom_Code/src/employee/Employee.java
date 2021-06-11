package employee;

public class Employee {
    String name;
    Employee()
    {
        System.out.println("This is non-parametrised constructor. ");
        name = "Unknown";
    }
    Employee(String n)
    {
        System.out.println("This is parametrised constructor. ");
        name = n;
    }

    public void displays()
    {
        System.out.println("NAME: "+name);
        System.out.println();
    }
}
