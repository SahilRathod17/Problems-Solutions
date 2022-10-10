public class ex {
    public static void main(String[] args) {

        // int i,j;
        // for(i=1;i<=5;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");

        // }

        System.out.println("\n");
        int a,b;
        for(a=5;a>=1;a--){
            for(b=1;b<=a;b++){
                System.out.print(b);
            }
            System.out.print("\n");
        }


        int i,j,k;
        for(i=1;i<=5;i++){
            for(k=5-i;k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");

        }
    }
}
