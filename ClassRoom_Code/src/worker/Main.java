package worker;

public class Main {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker();
        dailyWorker.compay(40);
        System.out.println("Data of Daily Worker:");
        dailyWorker.show();

        SalariedWorker salariedWorker = new SalariedWorker();
        salariedWorker.compay();
        System.out.println("Data of Salaries Worker:");
        salariedWorker.show();


    }
}
