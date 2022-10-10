import java.util.*;

public class arraylistex {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(10);
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.addAll(l1);
        l1.clear();

        System.out.println(l2.contains(2));

        for(int i=0;i<=l1.size();i++){
            System.out.println(l1.get(i));
            System.out.println(l2.get(i));
        }
    }
}
