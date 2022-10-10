final class a{
    void greet(){
        System.out.println("Hello!!!");
    }
}

class b extends a{
    void greet(){
        System.out.println("Hello,Everyone.");
    }
}

public class fclass {
    public static void main(String[] args) {
        b obj = new b();
        obj.greet();
    }
}
