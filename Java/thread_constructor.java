class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i<=50){
            System.out.println("I'm Thread");
            i++;
                }
    }
}


public class thread_constructor {
    public static void main(String[] args) {
        Mythr t = new Mythr(sahil);
        t.start();
        System.out.println("The id of the thread t is :" + getId());
    }
}
