package employee;

public class caller {
    public static void main(String [] args)
    {
        Employee emp = new Employee();
        emp.displays();
        Employee em = new Employee("saurabh");
        em.displays();
    }
}
