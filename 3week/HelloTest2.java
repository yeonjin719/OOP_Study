class W3HelloTest2{
    public void sayHello(){
        System.out.println("Hello");
    }
}
public class HelloTest2 {
    public static void main(String[] args) {
        W3HelloTest2 h1 = new W3HelloTest2();
        h1.sayHello();
        W3HelloTest2 h2 = new W3HelloTest2();
        h2.sayHello();
    }
}
