
import java.util.ArrayList;

public class genericsex {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //A.add("HIII");
        A.add(17);
        A.add(69);
        A.add(96);
        int a =(int) A.get(2);
        //this typecast was not needed!
        System.out.println(a);
    }
}
