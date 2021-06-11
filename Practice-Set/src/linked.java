class linked {
    node head;
    int count =0;
    public void insert(int data)
    {
        node node = new node();
        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        }
        else
            {
                node n = head;
                while (n.next != null)
                {
                    n = n.next;
                }
                    n.next = node;
            }
    }
    public void show()
    {
        node node = head;

        while(node.next!=null)
        {
           count++;
            node = node.next;
        }
        System.out.println(count+1);
    }
}