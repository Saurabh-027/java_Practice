package stackusinglinkedlist;

public class Manager {
     public static void main(String[] args) {
         StackUsingLinklist stl = new StackUsingLinklist();
         stl.insert(76);
         stl.insert(78);
         stl.insert(79);
         stl.insert(77);
         stl.show();
         stl.popped();
         stl.show2();
    }
}
