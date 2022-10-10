import java.util.*;

public class treesetex {
    public static void main(String[] args) {
        
        TreeSet <Integer> object = new TreeSet<>();

        object.add(2);
        object.add(4);
        object.add(6);
        object.add(8);
        object.add(10);

        Iterator <Integer> itr = new object.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
