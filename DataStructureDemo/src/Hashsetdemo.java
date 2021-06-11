import java.util.HashSet;

 class student2 {
        int id;
        String name;
        public student2(int i, String str)
        {
            id = i;
            name = str;
        }
    }

    public class Hashsetdemo
    {
        public static void main(String[] args)
        {
            HashSet<student2> set=new HashSet<>();

            student2 b1=new student2(1,"sa6");
            student2 b2=new student2(2,"sa5");
            student2 b3=new student2(3,"sa4");
            student2 b4=new student2(4,"sa3");
            student2 b5=new student2(5,"sa2");
            student2 b6=new student2(5,"sa1");

            set.add(b1);
            set.add(b2);
            set.add(b3);
            set.add(b4);
            set.add(b5);
            set.add(b6);

            for(student2 b:set){
                System.out.println(b.id+" "+b.name+" ");
            }
        }
 }
