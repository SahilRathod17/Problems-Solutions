

public class P4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = fun(a,b);
        int d = print();

        System.out.println("Minimum value is " + c );
        System.out.println(d);
    }


public  static int fun(int num1,int num2) {
    int n;
    if (num1>num2) {
        n = num2;
    }
    else{
        n = num1;
    }
     return n;
}

public static int print() {
    int m = 15;
    return m;
}

}