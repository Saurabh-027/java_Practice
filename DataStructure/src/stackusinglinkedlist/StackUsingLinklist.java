package stackusinglinkedlist;

public class StackUsingLinklist {
    Node head;
    Node top;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
     if(head == null)
     {
         head = node;
         top = head;
     }
     else {
         Node n = head;
         while (n.next != null)
         {
             n = n.next;
         }
         n.next = node;
         node.prev = n;
         top = node;
     }
    }

    public void show()
    {
        System.out.println("------------------------------");
        System.out.println("Original Content: ");
        Node n = top;
        while (n != null)
        {
            System.out.println(n.data);
            n = n.prev;
        }
    }

    public void popped()
    {
        Node n = top;

        System.out.println("----------------------------");
        System.out.println("Popped data is: " +n.data);
        System.out.println("-----------------------------");
        top = top.prev;
    }
    public void show2()
    {
        System.out.println("---------------------------");
        System.out.println("Content after getting one item popped");
        Node n = top;
        while (n != null)
        {
            System.out.println(n.data);
            n = n.prev;
        }
    }
}
