import java.util.Arrays;

public class linked {

    Node head1;
    Node head2;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head1 ==null)
        {
            head1 = node;
        }
        else
        {
            Node n = head1;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next =  node;
        }
    }
    public void delete(int pos)
    {
        Node n = head1;
         Node node =null;
        for(int i=0;i<pos - 1;i++)
        {
            n = n.next;
        }
        node = n.next;
        n.next = node.next;
    }
    public void show()
    {
        Node node = head1;

        while (node != null) {
            int d = node.data;
            System.out.println(d);
            node = node.next;
        }
    }
    public void reverse()
    {
        Node temp;
        Node node= head1;
        Node headNode = new Node();
        headNode.data = head1.data;
        head2=headNode;
        head2.next = null;
        node=node.next;
       while(node!=null)
       {
           temp = head2;
           Node tempNode = new Node();
           head2 = tempNode;
           head2.data = node.data;
           head2.next=temp;
           node = node.next;
       }
    }
    public void reverse2()
    {
        Node temp=head1;
        Node temp2 = head1.next;
        while(temp.next!=null)
        {
            temp.next=temp2.next;
            temp2.next=null;
            temp2.next=head1;
            head1=temp2;

            temp2 = temp.next;
        }
        Node node =head1;
        while(node!=null)
        {
            int d = node.data;
            System.out.println(d);
            node=node.next;
        }

    }

    public void show2()
    {
        Node node = head2;

        while (node != null) {
            int d = node.data;
            System.out.println(d);
            node = node.next;
        }
    }
    public void sorting()
    {
        int i=0;
        int []arr =new int[3];
        Node node= head1;
        while(node!=null)
        {
            int d=node.data;
            arr[i]=d;
            node=node.next;
            i++;

        }
        int n=arr.length;
        Arrays.sort(arr);
        for(int j=0;j<n;j++) {
            System.out.println(arr[j]);
        }
    }

    }
