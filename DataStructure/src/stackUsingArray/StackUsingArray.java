package stackUsingArray;

public class StackUsingArray {
    int size = 5;
    int top = 4;
    int []stack = new int[size];
    public void push(int data)
    {
        if(top < 0)
        {
            System.out.println("Stack is overflow");
        }
        else
            {
            if(top >= 0 && top <= size)
            {
                stack[top] = data;
            }
            top-- ;
        }
    }
    void show()
    {
        if (top == -1)
        {
            top = top + 1;
        }
        else if (top == 4)
        {
            System.out.println("stack is underflow.");
        }
        if (top != 1)
            {
                System.out.println("original data: ");
                System.out.println("---------------------");
            for (int i = top; i < 5; i++)
            {
                System.out.println(stack[i]);
            }

        }
    }
    public  void pop()
    {
        if(top == -1)
        {
            top = top + 1;
        }
        System.out.println("---------------------");
        System.out.println("popped data: " +stack[0]);
        top =++top;
        System.out.println("---------------------");
        System.out.println("Latest top data is: " +stack[top]);
    }

    void show2()
    {
        System.out.println("---------------------");
        System.out.println("data after popping one content: ");
        if (top == -1)
        {
            top = top + 1;
        }
        else if (top == 4)
        {
            System.out.println("stack is underflow.");
        }
        if (top >= 0)
        {

            for (int i = top; i < 5; i++)
            {
                System.out.println(stack[i]);
            }
        }
    }

}
