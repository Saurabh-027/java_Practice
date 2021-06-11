import java.util.*;

 class Treeset3
 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet( new mycomprator());
        t.add(45);
        t.add(78);
        t.add(96);
        t.add(23);

        System.out.println(t);
    }
}
class mycomprator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Integer i = (Integer)o1;
        Integer i2 = (Integer)o2;

        if(i<i2)
        {
            return +1;
        }
        else if(i2<i)
        {
            return -i;
        }
        else
        {
            return 0;
        }
    }
}

