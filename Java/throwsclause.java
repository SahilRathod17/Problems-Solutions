public class throwsclause {
    static void fun() throws IllegalAccessException,ArithmeticException{
        // // try{
        //     throw new IllegalAccessException(); // exception thrown 
        // }
        // catch(IllegalAccessException e){  //exception caught
        //     System.out.println("catch block");
        //     throw new IllegalAccessException();
        //     //exception thrown again
        // }   

        int a=10;
        int b=0;
        int c = a/b;

        System.out.println(c);
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch(IllegalAccessException e){
            System.out.println("kya magaj mari hain ye yrr.");
        }
        catch(Exception g){
            System.out.println("Achhaaaa");
            System.out.println(g);
        }
    }
}

//throws is used for declaring exceptions.
//checked exception can also be propagated
//throws followed by class
//used in method syntax not in method like throw
//can declare multiple exceptions like here in this example.
