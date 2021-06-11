package linklist;
import java.util.*;
public class Linklist {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Linklist list = new Linklist(); 
		 for(int i=0;i<2;i++)
		 {
			 int d=sc.nextInt();
			 list.head = new Node(d);
			 Node second = new Node(2);
			 list.printList();
		 }
	}
}