package circularLinkedlist;

public class CircularLinkedlist {
    Node head;
     public void insert(int data)
     {
         Node node = new Node();

         node.data=data;
         node.next = null;

         if (head == null)
         {
             head = node;
             head.next = head;

         }
         else
         {
             Node n = head;
             while (n.next != head)
             {
                 n = n.next;
             }
             n.next = node;
             node.next = head;
         }
     }

     public void show()
     {
         Node n = head;
         while (n.next != head)
         {
             System.out.println(n.data);
             n=n.next;
         }
         System.out.println(n.data);
     }
}
