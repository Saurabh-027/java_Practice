    class References
    {
        public int i;
        public int ref;

        public References(int i)
        {
            this.i = i;
        }

        public void rife(int ref)
        {
           this.ref=ref;
        }
    }

     class referred
    {
        public static void refer(References re ,int ren)
        {
            re.rife(ren);
        }

        public static void odd(int a)
        {
            References re = new References( 90);
            re.rife(a);
            System.out.println("---- value after calling the odd------");
            System.out.println("value of ref: " + re.ref);
        }
    }
    class ReferencesDemo
    {
        public static void main(String[] args) {
            References r = new References(2000);
            r.rife(800);
            System.out.println("----Before modifying the value------");
            System.out.println("value of ref: " + r.ref);

           referred.refer(r,80);

            System.out.println("----after modifying the value------");
            System.out.println("value of ref: " + r.ref);

            referred.odd(52);

            System.out.println("----value of i------");
            System.out.println("value of ref: " + r.i);

        }
    }
