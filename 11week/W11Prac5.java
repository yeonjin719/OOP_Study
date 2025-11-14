public class W11Prac5 {
    public static void main(String[] args) {
        W11Hello[] hArray = new W11Hello[3];
        hArray[0] = new FranchHello("js1");
        hArray[1] = new SpanishHello("js2");
        hArray[2] = new KoreaHello("js3");
        for (W11Hello hello: hArray) {
            hello.sayHello();
        }

    }
}

abstract class W11Hello {
    private String toWhom;
    public W11Hello(String whom) {
        toWhom = whom;
    }
    public String getWhom() {
        return toWhom;
    }
    public abstract void sayHello();
}

class FranchHello extends W11Hello {
    public FranchHello(String toWhom) {
        super(toWhom);
    }
    @Override
    public void sayHello() {
        System.out.println("Bonjour " + getWhom());
    }
}

class SpanishHello extends W11Hello {
    public SpanishHello(String toWhom) {
        super(toWhom);
    }
    @Override
    public void sayHello() {
        System.out.println("Hola a todos "+ getWhom());
    }
}
class KoreaHello extends W11Hello {
    public KoreaHello(String toWhom) {
        super(toWhom);
    }
    @Override
    public void sayHello() {
        System.out.println("안녕하세요 "+ getWhom());
    }
}