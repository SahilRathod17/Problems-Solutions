public class inverted {
    public static void main(String[] args) {
        
        int a,b;

        for(a=1;a<=5;a++){
            for(b=5;b>=a;b--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for(a=1;a<=5;a++){
            for(b=5;b>=a;b--){
                System.out.print(b);
            }
            System.out.print("\n");
        }

        System.out.println("\n");


        for(a=5;a>=1;a--){
            for(b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.print("\n");
        }

    }
}
