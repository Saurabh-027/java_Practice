package worker;

public class DailyWorker extends Worker {
    int rate;
    int total;
    public DailyWorker(){

        rate = 100;
        Hour = 5;

    }
    void compay(int wages)
    {
         total = wages * rate;
        System.out.println("Daily Wages: "+total);
    }

    public void show()
    {
        System.out.println("Name: " +name);
        System.out.println("No of day: "+ Hour);
        System.out.println("Total wages: "+total);
    }
}
