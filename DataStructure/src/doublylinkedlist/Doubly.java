package doublylinkedlist;

public class Doubly {
    Node head;
    Node tail;
    public void insert(int data)
    {
        Node node = new Node();
        node.next = null;
        node.prev = null;

        node.data = data;


        if(head == null)
        {
            head = node;
            head.prev = null;
        }
        else
        {
            Node n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    public void show()
    {
        Node n = head;
        while (n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void reverse()
    {
        System.out.println("Reverse of the LinkedList");
        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }
        while (n != null)
        {
            System.out.println(n.data);
            n = n.prev;
        }

    }
}
