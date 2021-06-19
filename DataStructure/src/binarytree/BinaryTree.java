package binarytree;

public class BinaryTree {
    Node root;
    public void insert(int data){

        Node node = new Node();
        node.left = null;
        node.data = data;
        node.right = null;

        if(root == null){
            root = node;
        }
        else {
            Node n = root;
            while (n.left != null) {
                if (node.data < root.data)
                {

                  /*  n = n.left;
                }*/
                /*if(n.left.left == null){
                    n.left = node;
                }*/
                    if (node.data < n.data) {
                        if (n.left == null) {
                            n.left = node;
                        } else {
                            if (n.left.data < node.data) {
                                n = n.left;
                                n.left = node;
                            }
                        }
                        n.left = node;
                    } else {
                        if (n.right == null) {
                            n.right = node;
                        } else {
                            if (n.right.data < node.data) {
                                n = n.right;
                                n.right = node;
                            }
                        }

                    }
                } else {
                    /*while (n.right != null) {
                        n = n.right;
                    }
                    if (node.data < n.data) {
                        n.left = node;
                    } else {
                        n.right = node;
                    }*/
                }

                n.left = node;
                n = n.left;
            }
        }

    }

   /* public void show(){
        Node temp = root;

    }*/
}
