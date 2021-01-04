package accessexample;

import accessexample.accessmodifiers.PackagePrivateClass;

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
