package example.accessmodifiers;

public class ProtectClass {

    private final String name = "Lob!";

    protected void getName() {
        System.out.println("ProtectClass.getName = " + name);
    }
}
