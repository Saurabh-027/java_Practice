package queueusingArray;

public class Manager {
    public static void main(String[] args) {
        QueueUsingArray qa = new QueueUsingArray();
        qa.enqueue(76);
        qa.enqueue(73);
        qa.enqueue(25);
        qa.enqueue(78);

        qa.show();

        qa.dequeue();

        qa.show2();
    }
}
