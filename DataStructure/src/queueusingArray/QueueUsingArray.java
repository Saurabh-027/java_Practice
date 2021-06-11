package queueusingArray;

public class QueueUsingArray {
    int[] que = new int[10];

    int rear = 0;
    int front = 0;

    public void enqueue(int data) {
        if (front == 0) {
            que[rear] = data;
        } else {
            que[rear] = data;
        }
        rear++;
    }

    public void show() {
        System.out.println("before dequeue operation: ");
        for (int j = 0; j < rear; j++) {
            System.out.println(que[j]);
        }
    }

    public void dequeue() {
        System.out.println();
        System.out.println("dequeue element: " +que[front]);
        System.out.println();
        front = front + 1;
    }

    public void show2() {
        System.out.println("after dequeue operation: ");
        for (int j = front; j < rear; j++) {
            System.out.println(que[j]);
        }
    }
}
