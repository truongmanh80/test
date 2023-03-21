package org.example;
// https://www.javatpoint.com/java-8-method-reference
// https://viblo.asia/p/java-8-lambda-expressions-va-method-references-1VgZvp4M5Aw
interface Say {
    void saySomething();
}

interface Say2 {
    void saySomething();
}
public class MethodReference {
    public static void sayAdditional() {
        System.out.println("hi, i'm references static method!!!");
    }

    public void sayAdditional2() {
        System.out.println("hi, i'm references instance method!!!");
    }
    public static void main(String[] args) {
        // references static method
        // cung kieu tra ve, cung tham so
        Say say = MethodReference::sayAdditional;
        // calling interface method
        say.saySomething();

        // references to an instance method
        // create object
        MethodReference methodReference = new MethodReference();
        // referring non-static method using references
        Say2 say2 = methodReference::sayAdditional2;
        // calling interface method
        say2.saySomething();

        // for short
        // referring non-static method using anonymous object
        Say2 say22 = new MethodReference()::sayAdditional2;
        say22.saySomething();
    }
}

