

public class P3 {
    public static void main(String args[]) {
      
        if(args.length>0){
            System.out.println("The command line arguments are :c");
            System.out.println("Hello!! \n How you doin ?");

            for(String val : args)
            System.out.println(val);
        }
         else 
         System.out.println("No command line arguments found.");

    }
    
}
