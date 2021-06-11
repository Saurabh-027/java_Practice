package linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();

        node.next = null;
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }
    }

    public void update() {
        Node node = head;
        while (node != null) {
            if (node.data == 99) {
                node.data = 78;
            }
            node = node.next;
        }
    }

    public void modify(int place, int data) {
        Node no = head;
        int counter = 0;

        int count = 0;
        Node temp = new Node();

        temp.data = data;
        temp.next = null;

        while (no != null) {
            counter++;
            no = no.next;
        }
        int t = counter + 1;
        if (t < place) {
            System.out.println("Enter valid place to modify: ");
            System.out.println();
        } else if (place == 1) {
            temp.next = head;
            head = temp;
        } else {
            int change = place - 2;

            Node node = head;

            while (node != null) {
                if (count == change) {
                    temp.next = node.next;
                    node.next = temp;
                }
                node = node.next;
                count++;
            }

        }
    }

    public void delete(int place) {
        Node node = head;
        int count = 1;
        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }
        if (counter < place) {
            System.out.println("enter valid place to delete: ");
        } else {
            if (place == 1) {
                Node n = head;
                head = n.next;
            } else {
                Node node1 = head;
                while (node1 != null) {
                    if (count == (place - 1)) {
                        node1.next = node1.next.next;
                    }
                    count++;
                    node1 = node1.next;
                }
            }
        }
    }

    public void show() {
        System.out.println("data of linked list: ");
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void middle()
    {
        System.out.println("Middle element of the linked list: ");
        Node fast = head;
        Node slow = head;
        int count = 0;
        while (fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(fast.next == null)
            {
                break;
            }
        }
        if(count % 2 == 0)
        {
            slow = slow.next;
            System.out.println(slow.data);
        }
        else
        {
            System.out.println(slow.data);
        }
    }

    public void reverse()
    {

        Node temp = head;

        while (temp.next != null) {
            Node h2 = temp.next;
            temp.next = temp.next.next;
            h2.next = head;
            head = h2;
        }
    }

    public void reverseshow()
    {
        System.out.println("reverse order");
        Node n = head;
        while (n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

}
