package accessexample.accessmodifiers;

public class PublicExample {

    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.run();
    }

    public void run() {
        PublicClass publicClass = new PublicClass();
        publicClass.getName();
    }
}
