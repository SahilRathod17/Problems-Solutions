


public class P7 {
    public static void main(String[] args) {
        System.out.println(Adder.Add(11,11));
        System.out.println(Adder.Add(12.3,12.6));
    }
}

class Adder{
    static int Add(int a,int b)
    {
        return a+b;
    }
    static double Add(double a,double b)
    {
        return a+b;
    }
}