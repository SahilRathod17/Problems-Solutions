public class nestedtry {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args [0]);
            int b = Integer.parseInt(args [1]);
            int c = 0;

            try{
                c = a/b;
                System.out.println(c);
            }
            catch(ArithmeticException e){
                System.out.println("divide by zero");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Incorrect argument type.");
        }
    }
}
