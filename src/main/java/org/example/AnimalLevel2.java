package org.example;

public class AnimalLevel2 extends AnimalLevel1{
    private String name2;

    private int age2;

    public AnimalLevel2(String name, int age, String name1, int age1, String name2, int age2) {
        super(name, age, name1, age1);
        this.name2 = name2;
        this.age2 = age2;
    }

    public AnimalLevel2(String name1, int age1, String name2, int age2) {
        super(name1, age1);
        this.name2 = name2;
        this.age2 = age2;
    }

    public AnimalLevel2(String name2, int age2) {
        this.name2 = name2;
        this.age2 = age2;
    }

    public AnimalLevel2() {

    }
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}
