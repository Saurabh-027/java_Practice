package queue;

public class Queue_fifo
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next =  node;
        }
    }
    public void insert_at()
    {

    }
}
