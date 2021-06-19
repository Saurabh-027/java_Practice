package binarytree;

public class BinaryTree2 {
    Node root;

    public void insert(int data) {

        Node node = new Node();

        node.left = null;
        node.right = null;
        node.data = data;

        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (true){
                if(temp.data > node.data){
                    if(temp.left == null){
                        temp.left = node;
                        break;
                    }
                    else {
                        temp = temp.left;
                    }
                }
                else {
                    if(temp.right == null){
                        temp.right = node;
                        break;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
    }
}