import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
    String name;
    int id;
    public  Student(int i, String str)
    {
        id = i;
        name = str;
    }
    @Override
    public int compareTo(Student o)
    {
        if(id<o.id)
        {
            return 1;
        }
        else if(id>o.id){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class Treeset {
    public static void main(String[] args)
        {
             Set<Student> set = new TreeSet<>();
             Student st = new Student(12, "saurabh");
             Student st2 = new Student(13, "vic");
             Student st3 = new Student(14, "hello");
             Student st4 = new Student(15, "hey");
             Student st5 = new Student(16, "bye");
             Student st6 = new Student(17, "go");
             Student st7 = new Student(18, "come");
             set.add(st);
            set.add(st2);
            set.add(st3);
            set.add(st4);
            set.add(st5);
            set.add(st6);
            set.add(st7);

            for(Student b:set)
            {
                System.out.println(b.id +" "+b.name+"");
            }
        }
    }

