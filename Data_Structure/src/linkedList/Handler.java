package linkedList;

public class Handler
{
    public static void main(String[] args)
    {
      /*  System.out.println("enter what you want to do: ");
        System.out.println("1 for add the data: ");
        System.out.println("2 for deleter he data: ");
        System.out.println("3 for show the data: ");*/

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        //list.insertAtStart(25);

        //list.insertAt(0, 55);

        //list.deleteAt(2);

        list.show();
    }
}

