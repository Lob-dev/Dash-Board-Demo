package example;

import example.accessmodifiers.PackagePrivateClass;
import example.accessmodifiers.ProtectClass;
import example.accessmodifiers.ProtectExample;

public class PackagePrivateExample {

    public static void main(String[] args) {
        PackagePrivateExample example = new PackagePrivateExample();
        example.run();
    }

    public void run() {
        PackagePrivateClass packagePrivateClass = new PackagePrivateClass();
        // error: getName() is not public in PackagePrivateClass; cannot be accessed from outside package packagePrivateClass.getName();
        // packagePrivateClass.getName();
    }

}
