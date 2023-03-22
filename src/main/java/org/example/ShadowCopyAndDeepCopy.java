package org.example;

//https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/

/**
 * 1    about copy: object copying is creating a copy of an existing object, the resulting object is called an object
 * copy or simply copy of the original object.There are several ways to copy an object, most commonly by a
 * copy constructor or cloning.
 * 1.1  copy constructor    : https://www.geeksforgeeks.org/copy-constructor-in-java/
 * 1.2  clone method        : https://www.geeksforgeeks.org/clone-method-in-java-2/
 *      shallow copy
 */



/**
 * Advantages of clone method:
 *
 * If we use the assignment operator to assign an object reference to another reference variable then
 * it will point to the same address location of the old object and no new copy of the object will be created.
 * Due to this any changes in the reference variable will be reflected in the original object.
 * If we use a copy constructor, then we have to copy all the data over explicitly i.e.
 * we have to reassign all the fields of the class in the constructor explicitly.
 * But in the clone method, this work of creating a new copy is done by the method itself.
 * So to avoid extra processing we use object cloning.
 */
public class ShadowCopyAndDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 1.1 copy with constructor: https://www.javainterviewpoint.com/copy-constructor/
         * With Copy Constructors we can achieve both Shallow Copy and Deep Copy
         *      primitive are by default deep copied
         *      String: thay đổi giá trị theo kiểu gán bằng cũng deep copied
         *      // gán object kiểu này (shallow copy), nhưng String is immutable object,
         *      // nghĩa là khi thay đổi giá trị, thì nó tạo đối tượng giá trị mới, chứ không phải chỉnh sửa giá trị cũ
         *      // còn với kiểu Object User Define thì nó đúng như logic vẫn nghĩ
         * 1.1.1 with shallow (object)
         *          : hiểu là khi thay đổi ở thằng này thì thằng kia cũng thay đổi
         * 1.1.2 with deep copy
         *          : use the new operator inside the Copy Constructor for it to be deep copied
         * => CopyConstructor.java
         */

        /**
         * Advantages of copy constructors over Object.clone():
         * - Unlike clone() method, Copy Constructors will not force us to implement the Cloneable or Serializable interface
         * - Copy Constructor in Java is much easier to use even when the object has complex attributes.
         * - It gives us the complete control over object copy, we can even mix both Deep Copy and Shallow Copy for different attributes of the class.
         * - clone() method throws CloneNotSupportedException whenever the class does not implement Cloneable interface, Copy Constructor will not be throwing these Exceptions.
         * - Typecasting is required as the clone() method returns Object type, whereas Copy Constructor does not need such typecasting
         * - Copy Constructor will let us change the value of a final attribute whereas clone() method will throw compilation error when you try to change a final field.
         */


        /**
         *
         * 1.2
         * 1.2.1    using assignment operator to create a copy of the reference variable
         *          if we use the assignment operator then it will create a copy of the reference variable
         *          and not the object
         *    hai biến có giá trị hashcode giống nhau, nghĩa là khi thay đổi ở đối tượng dữ liệu thì tất cả
         *    biến tham chiều đều thay đổi
         * => CopyWithAssignment.java
         */


        /**
         * Shallow copies are cheap and simple to make. In the above example, we created a shallow copy of the object.
         * 1.2.2
         *  using clone() method
         *      - shallow copy
         *          Therefore, any changes made in referenced objects in object X or Y will be reflected in other objects
         *      - deep copy
         *  => CopyWithCloneMethod
         */

        // example
        // assignment
        AnimalLevel2 a2 = new AnimalLevel2("name0", 0, "name1", 1, "name2", 2);

        AnimalLevel2 a21 = a2;

        System.out.println("a2  hashcode     = " + Integer.toHexString(a2.hashCode()));  // = nhau
        System.out.println("a21 hashcode     = " + Integer.toHexString(a21.hashCode())); // = nhau
        a2.setName2("name22");
        a2.setName1("name12");
        a2.setName("name02");
        System.out.println("after change");
        System.out.println(a2.getName() + " " + a2.getName1() + " " + a2.getName2());
        System.out.println(a21.getName() + " " + a21.getName1() + " " + a21.getName2());
        // tất cả đều thay đổi (2 biến đều tham chiếu đến một chỗ), như vậy đã đúng logic
    }
}
