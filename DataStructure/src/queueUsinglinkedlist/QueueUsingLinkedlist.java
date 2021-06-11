package queueUsinglinkedlist;

public class QueueUsingLinkedlist {
    Node front;

    public void enqueue(int data) {
        Node node = new Node();

        node.next = null;
        node.data = data;

        if (front == null) {
            front = node;
        } else {
            Node n = front;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        System.out.println("data before dequeue: ");
        Node n = front;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void dequeue() {
        System.out.println();
        System.out.println("Dequeue data is : " + front.data);
        System.out.println();
        front = front.next;
    }

    public void show2() {
        System.out.println("data after dequeue: ");
        Node n = front;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
