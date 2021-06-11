package queueUsinglinkedlist;

public class Manager {
    public static void main(String[] args) {
        QueueUsingLinkedlist ql = new QueueUsingLinkedlist();

        ql.enqueue(79);
        ql.enqueue(78);
        ql.enqueue(77);
        ql.enqueue(76);

//show is use to show the data from the queue before the dequeue operation.
        ql.show();
//dequeue is use to remove the data from the front or we can say to remove the data in insertion order
        ql.dequeue();
//Show is use to see the data after the dequeue operation.
        ql.show2();
    }
}
