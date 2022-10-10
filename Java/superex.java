class a {
  public void   greet(){
        System.out.println("Helloooo!");
    }
}

class b extends a{
    public void  greet(){
        System.out.println("Ohhhh yeah!");
    }

    void run(){
        greet();
        super.greet();
    }
}

public class superex {
    public static void main(String[] args) {
        b obj = new b();
        obj.run();

        
    }
}
