package org.example.stringbuilder;

public class StringBuilderExample {
    /**
     * https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
     * StringBuilder in Java represents a mutable sequence of characters
     * However, the StringBuilder class differs from the StringBuffer class on the basis of synchronization
     *      - The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does
     *      - Therefore this class is designed for use as a drop-in replacement for StringBuffer in places
     * where the StringBuffer was being used by a single thread (as is generally the case)
     *      - Where possible, it is recommended that this class be used in preference to StringBuffer
     * as it will be faster under most implementations
     *
     *  String Builder is not thread-safe and high in performance compared to String buffer.
     *
     * @param args
     */
    public static void main(String[] args) {
        // nếu đơn luồng dùng StringBuilder, nếu Đa luồng dùng StringBuffer, để đặt được cùng một mục đích
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        StringBuilder sb1 = new StringBuilder();
        sb.append("Vietnam");

        StringBuilder sb2 = new StringBuilder();
        sb.append("China");
    }
}
