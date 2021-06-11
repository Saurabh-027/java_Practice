import java.util.Iterator;
import java.util.TreeSet;

public class TryTreeSet
{
    public static void main(String[] args) {

        three th = new three();
        one o = new one();
        two t = new two();

        TreeSet<TryTreeSet> tr = new TreeSet<TryTreeSet>();
        tr.add(th);
        tr.add(t);
        tr.add(o);

        Iterator<TryTreeSet> itr = tr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }

    }
}
