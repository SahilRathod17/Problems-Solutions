
import java.util.*;

public class P2 {
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name : \n");
        String name = s.nextLine();
        System.out.println("Enter your Age : \n");
        int age = s.nextInt();
        System.out.println("Enter your class division : \n");
        char div = s.next().charAt(0);
        System.out.println("Enter your SPI : \n");
        float spi = s.nextFloat();

        System.out.println(
            "Name  : " + name + "\n" +
            "Age   : " + age + "\n" +
            "Class : " + div + "\n" +
            "SPI   : " + spi
        );
    }
}
