import java.util.*;
public class Linklist {
node head;
static class node
{
	int data;
	node next;
	node(int t)
	{
		data=t;
		System.out.println(data);
		next=null;
	}
}
public static void main(String [] args)
{
	Linklist n=new Linklist();
	n.head=new node(1);
	n.head=new node(2);
}
}
