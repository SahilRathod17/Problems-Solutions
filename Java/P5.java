

public class P5 {
    public static void main(String[] args) {

    addition a = new addition();
    addition b = new addition(3,4);

    }
}

class addition{
    addition(){
        System.out.println("Addition is performing.");
    }

    addition(int a , int b){
        int c = a+b;
        System.out.println("Sum is : " + c );
    }
}
