

interface animal{
    void eat();
}

interface men{
    void travel();
}

class a implements animal,men{
    public void eat(){
        System.out.println("Animal is eating.");
    }

    public void travel(){
        System.out.println("men is travling.");
    }
}

public class P11 {
    public static void main(String[] args) {
        a obj = new a();
        obj.eat();
        obj.travel();
    }
}
