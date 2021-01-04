package accessexample.accessmodifiers;

public class ProtectExample extends ProtectClass{

    public static void main(String[] args) {
        ProtectExample example = new ProtectExample();
        example.run();
    }

    public void run() {
        ProtectClass protectClass = new ProtectClass();
        protectClass.getName();
    }
}
