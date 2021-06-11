public class Try1 {
        int num = 100;
        public void calc(int num)
        {
            this.num = num*10;
        }
        public void printnum()
        {
            System.out.println(num);
        }
        public static void main(String[] args)
        {
            Try1 oj = new Try1();
            oj.calc(2);
            oj.printnum();
        }
    }

