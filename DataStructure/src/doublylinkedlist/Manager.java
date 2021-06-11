package doublylinkedlist;

public class Manager {
    public static void main(String [] args)
    {
        Doubly dl = new Doubly();

        dl.insert(89);
        dl.insert(96);
        dl.insert(21);

        dl.show();
        dl.reverse();
    }

}
