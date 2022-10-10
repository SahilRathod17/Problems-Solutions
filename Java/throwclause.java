public class throwclause {
    static void okii(int age){
        if (age<18) {
            throw new ArithmeticException("Not valid");
        }
        else{
            System.out.println("Welcome to ganja gang.");
        }

    }
    
    public static void main(String[] args) {
        okii(19);
        //okii(15);
        System.out.println("Have a  hard day.");
    }
}


//throw is used for explicitly throwing exception 
//its used with unchecked exceptions 
//its followed by an instance 
//throw is used within the method
//cant throw multiple exception 