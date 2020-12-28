package example;

import example.accessmodifiers.ProtectClass;
import example.accessmodifiers.ProtectExample;

public class ProtectExample3 {

    public static void main(String[] args) {
        ProtectExample example = new ProtectExample();
        example.run();
    }

    public void run() {
        ProtectClass protectClass = new ProtectClass();
        // error: getName() has protected access in ProtectClass protectClass.getName();
        //protectClass.getName();
    }
}
