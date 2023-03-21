package org.example;
// https://www.javatpoint.com/java-8-method-reference
// https://viblo.asia/p/java-8-lambda-expressions-va-method-references-1VgZvp4M5Aw
interface Say {
    void saySomething();
}

interface Say2 {
    void saySomething(String msg);
}

interface Messageble {
    Message getMessage(String msg);
}

class Message {

    public Message(String msg) {
        System.out.println(msg);
    }
}

public class MethodReference {
    public static void sayAdditional() {
        System.out.println("hi, i'm references static method!!!");
    }

    public void sayAdditional2(String type) {
        System.out.println("hi, i'm references instance method via " + type + " !!!");
    }
    public static void main(String[] args) {
        // 1 references static method
        // cung kieu tra ve, cung tham so
        Say say = MethodReference::sayAdditional;
        // calling interface method
        say.saySomething();

        // 2 references to an instance method
        // 2.1 via object
        // create object
        MethodReference methodReference = new MethodReference();
        // referring non-static method using references
        Say2 say2 = methodReference::sayAdditional2;
        // calling interface method
        say2.saySomething("object");

        // 2.1 anonymous object
        // for short
        // referring non-static method using anonymous object
        Say2 say22 = new MethodReference()::sayAdditional2;
        say22.saySomething("anonymous object");

        // 3 reference to a constructor
        Messageble m = Message::new;
        m.getMessage("hi, i'm references constructor!!!");
    }
}

