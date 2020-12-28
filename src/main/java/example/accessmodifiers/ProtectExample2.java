package example.accessmodifiers;

public class ProtectExample2 {

    public static void main(String[] args) {
        ProtectExample example = new ProtectExample();
        example.run();
    }

    public void run() {
        ProtectClass protectClass = new ProtectClass();
        protectClass.getName();
    }
}
