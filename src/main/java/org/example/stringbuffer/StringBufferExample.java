package org.example.stringbuffer;

public class StringBufferExample {
    /**
     * https://www.geeksforgeeks.org/stringbuffer-class-in-java/
     * StringBuffer is a class in Java that represents a mutable sequence of characters
     * It provides an alternative to the immutable String class,
     * allowing you to modify the contents of a string without creating a new object every time
     *
     * some important features and methods of the StringBuffer class
     *      - StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object
     *      - The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method
     *      -  append()
     *      -  insert()
     *      -  delete()
     *      -  reverse()
     * @param args
     *
     * There are several advantages of using StringBuffer over regular String objects in Java:
     *      - Mutable: StringBuffer objects are mutable, which means that you can modify the contents of the object after it has been created.
     * In contrast, String objects are immutable, which means that you cannot change the contents of a String once it has been created
     *      - Efficient: Because StringBuffer objects are mutable, they are more efficient than creating new String objects each time you need to modify a string
     * This is especially true if you need to modify a string multiple times, as each modification to a String object creates a new object and discards the old one
     *      - Thread-safe: StringBuffer objects are thread-safe, which means that they can be accessed
     * by multiple threads at the same time without causing data corruption or other problems, In contrast, String objects are not thread-safe,
     * which means that you need to use synchronization if you want to access a String object from multiple threads
     *
     * StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
     *
     * Important Constructors of StringBuffer class
     *      - StringBuffer(): creates an empty string buffer with the initial capacity of 16
     *      - StringBuffer(String str): creates a string buffer with the specified string
     *      - StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

//        String message = sb.toString();
        String message = sb.reverse().toString();
        System.out.println(message);
        sb.append("hello world");
        // capacity: (oldcapacity*2)+2, default = 16
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

    }
}
