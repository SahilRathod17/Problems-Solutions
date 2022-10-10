class method {
    final void method1(){
        System.out.println("This is method 1.");
    }
}

class method2 extends method{
    void method1(){
        System.out.println("Method is overriden.");
    }
}


public class fmethod {
    public static void main(String[] args) {
        
        method2 obj = new method2();
        obj.method1();
    }
}
