package worker;

public class SalariedWorker extends Worker{
    int salary_hour;
    int total;
    SalariedWorker()
    {
         salary_hour = 500;
         Hour = 40;

    }
    void compay()
    {
         total = salary_hour * Hour;
    }
    public void show()
    {
        System.out.println("Name: " +name);
        System.out.println("No of Hour: "+ Hour);
        System.out.println("Total wages: "+total);
    }
}
