package stackUsingSinglePointer;

public class StackUsingSinglePointer {
    Node head;
    public void push(int data)
    {
        Node node = new Node();

        node.next = null;
        node.data = data;

        if (head != null) {
            node.next = head;

        }
        head = node;
    }
    public void show()
    {
        if(head == null)
        {
            System.out.println("Stack is Underflow");
        }
        else {
            System.out.println("Data of a stack: ");
            Node node = head;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }

    }
    public void pop()
    {
        System.out.println();
        System.out.println("Poped data: "+head.data);
        head = head.next;
    }

    public void show2()
    {
        System.out.println();
        System.out.println("After poping one data from the stack: ");
        Node n = head;
        while (n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
