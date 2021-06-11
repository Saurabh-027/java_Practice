
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @Autowired
    Calculate c;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ItemImpl1 itm = context.getBean(ItemImpl1.class);
        ItemImpl1 itm2 = context.getBean(ItemImpl1.class);
        ItemImpl1 itm3 = context.getBean(ItemImpl1.class);

        System.out.println("---------------------ITEMIMP1--------------------------");
        System.out.println(itm);
        System.out.println(itm2);
        System.out.println(itm3);
        System.out.println("----------------------ITEMIMP1--------------------------");

        itm.saurabh = 54;
        itm.vicky = 575;
        itm.s(itm.saurabh, itm.vicky);

                /*Store str1 = new Store();
                str1.ss();*/

        Store str = context.getBean(Store.class);
        Store str1 = context.getBean(Store.class);
        Store str2 = context.getBean(Store.class);
        Store str3 = context.getBean(Store.class);
        System.out.println("---------------Store----------------");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("---------------Store----------------");


        str.saurabh = 78;
        str.vicky = 89;
        str.ss();

        Main main = new Main();
        //main.calc();

    }

    public void calc()
    {
        c.add(12,78);
    }

}
