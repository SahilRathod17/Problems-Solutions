

abstract class one{
    int i,j;
    one(int a,int b){
        i = a;
        j = b;
    }
    abstract int area();
}

class two extends one{
    two(int a,int b){
        super(a,b);
       
    }
    int area(){
        System.out.println("Inside area for.");
        return i*j;
    }
}


public class abstractclass {
    public static void main(String[] args) {

        //one obj = new one(10,10); //illegal now
        two obj = new two(6,7);
        one o;
        o = obj;

        System.out.println("Area is " + o.area());
        }
    }
