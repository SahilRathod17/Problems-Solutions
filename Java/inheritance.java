class a{
  
    public void greet(){
        System.out.println("Hello");
    }
}

class b extends a {
   
    public void greet1(){
        System.out.println("Hey");
    }
}

class c extends b {
    public void greet2(){
        System.out.println("Hiiiii");
    }
}

public class inheritance {
    public static void main(String[] args) {
       c obj = new c();
        obj.greet();
        obj.greet1();
        obj.greet2();
        
    }
    
}
