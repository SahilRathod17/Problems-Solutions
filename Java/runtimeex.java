class Phone{
    void on(){
        System.out.println("Turning on Phone..");
    }
}

class SmartPhone extends Phone{
    void on(){
        System.out.println("Turning on SmartPhone..");
    }
}

public class runtimeex {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        //SmartPhone obj1 = new Phone(); not allowed
        //obj1.on();
        obj.on();
    }
}
