
import java.util.*;
public class CountNode
{
    linked l = new linked();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CountNode sd = new CountNode();
        sd.takeInput();
        sd.show();
    }
    public void takeInput()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            l.insert(data);
        }
    }
    public void show()
    {
        l.show();
    }
}

