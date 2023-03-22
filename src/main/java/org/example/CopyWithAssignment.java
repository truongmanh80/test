package org.example;
class Farm2 {
    private String name;

    public Farm2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog {
    private String name;    // object

    private Farm2 farm2;

    private int age;

    public Dog(String name, Farm2 farm2, int age) {
        this.name = name;
        this.farm2 = farm2;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farm2 getFarm2() {
        return farm2;
    }

    public void setFarm2(Farm2 farm2) {
        this.farm2 = farm2;
    }
}

public class CopyWithAssignment {
    public static void copyWithAssignment() {
        System.out.println("-------------start--------------");
        System.out.println("1.2.1-------------------");
        Farm2 farm2 = new Farm2("Vietnam");
        Dog puppy1 = new Dog("puppy", farm2, 0);
        Dog puppy2 = puppy1;
        System.out.println("before change value");
        System.out.println("name                 = " + puppy1.getName() + ", age = " + puppy1.getAge() +
                ", farm = " + puppy1.getFarm2().getName());

        System.out.println("name                 = " + puppy2.getName() + ", age = " + puppy2.getAge() +
                ", farm = " + puppy2.getFarm2().getName());
        System.out.println("assignment           = " + (puppy1 == puppy2));        // true
        System.out.println("equal method         = " + puppy1.equals(puppy2));     // true
        System.out.println("puppy1 hashcode      = " + Integer.toHexString(puppy1.hashCode()));
        System.out.println("puppy2 hashcode      = " + Integer.toHexString(puppy2.hashCode()));

        System.out.println("after change value");
        puppy1.setName("puppy2");
        puppy1.setAge(2);
        puppy1.getFarm2().setName("China");
        System.out.println("name                 = " + puppy1.getName() + ", age = " + puppy1.getAge() +
                ", farm = " + puppy1.getFarm2().getName());

        System.out.println("name                 = " + puppy2.getName() + ", age = " + puppy2.getAge() +
                ", farm = " + puppy2.getFarm2().getName());
        System.out.println("-------------end--------------");
    }
    public static void main(String[] args) {
        copyWithAssignment();
    }
}
