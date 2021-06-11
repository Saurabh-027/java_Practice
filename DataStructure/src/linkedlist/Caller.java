package linkedlist;

public class Caller {

    public static void main(String [] args)
    {
        LinkedList lt = new LinkedList();

        lt.insert(1);
        lt.insert(2);
        lt.insert(3);
        lt.insert(4);
        lt.insert(6);
        lt.insert(7);
        lt.insert(8);
        lt.insert(9);
        lt.insert(10);
        lt.insert(11);
        lt.insert(12);
        lt.update();
        lt.modify(2,2);
        lt.delete(6);
        lt.show();
        lt.middle();
        lt.show();
        lt.reverse();
        lt.reverseshow();

    }
}
