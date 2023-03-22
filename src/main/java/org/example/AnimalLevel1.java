package org.example;

public class AnimalLevel1 extends Animal{
    private String name1;

    private int age1;

    public AnimalLevel1(String name, int age, String name1, int age1) {
        super(name, age);
        this.name1 = name1;
        this.age1 = age1;
    }

    public AnimalLevel1(String name1, int age1) {
        this.name1 = name1;
        this.age1 = age1;
    }

    public AnimalLevel1() {

    }
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}
