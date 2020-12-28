package example.accessmodifiers;

public class PrivateExample {

    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        example.run();
    }

    public void run() {
        PrivateClass privateClass = new PrivateClass();
        // 'getName()' has private access in 'example.accessmodifiers.PrivateClass'
        //privateClass.getName();
    }
}
