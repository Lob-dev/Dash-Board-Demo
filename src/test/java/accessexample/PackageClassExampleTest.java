package accessexample;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

class PackageClassExampleTest {

    @Test
    void PackageTest() {
        Package aPackage = Package.getPackage("java.lang");
        Package[] aPackages = Package.getPackages();
        System.out.println(Arrays.toString(aPackages));

        System.out.println(aPackages.length);

        // package name
        System.out.println(aPackage.getName());

        // package spec Title
        System.out.println(aPackage.getSpecificationVersion());
        // package spec Vendor
        System.out.println(aPackage.getSpecificationTitle());
        // package spec Version
        System.out.println(aPackage.getSpecificationVendor());

        // package impl Title
        System.out.println(aPackage.getImplementationVersion());
        // package impl Vendor
        System.out.println(aPackage.getImplementationTitle());
        // package impl Version
        System.out.println(aPackage.getImplementationVendor());

        // package annotations
        Annotation[] annotations = aPackage.getAnnotations();
        System.out.println(Arrays.toString(annotations));

        // package declaredAnnotations
        Annotation[] declaredAnnotations = aPackage.getDeclaredAnnotations();
        System.out.println(Arrays.toString(declaredAnnotations));
    }
}