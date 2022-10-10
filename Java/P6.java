


    class dogg extends  animal{
        public static void main(String[] args)
        {
            add ad = new add();
            dogg obj = new dogg();
            obj.dog1();

            ad.a=0;
            ad.b=8;
            ad.add();

            ad.setter(4.0f,5.0f);
            float c = ad.getter();

            System.out.println("Sum is : " + c);
        }
    }
    class  animal
    {
        protected void dog1()
        {
            System.out.println("How you doin ?");
        }
    }
    class  add
    {
        public int a,b;
        private float c,d;

        public void add()
        {
            System.out.println("Sum is : " + (this.a+this.b));
        }
        public float getter()
        {
            return (c+d);
        }
        public void setter(float a,float b)
        {
            c=a;
            d=b;
        }
    }
