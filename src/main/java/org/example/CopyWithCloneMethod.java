package org.example;

class Farm3 {
    private String name;

    public Farm3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog2 implements Cloneable {

    private String name;    // object
    private int age;
    private Farm3 farm3;

    public Dog2(String name, int age, Farm3 farm3) {
        this.name = name;
        this.age = age;
        this.farm3 = farm3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Farm3 getFarm3() {
        return farm3;
    }

    public void setFarm3(Farm3 farm3) {
        this.farm3 = farm3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // default shallow copy
        return super.clone();
    }
}

class Dog3 implements Cloneable {
    private String name;

    private int age;

    private Farm3 farm3;

    public Dog3(String name, int age, Farm3 farm3) {
        this.name = name;
        this.age = age;
        this.farm3 = farm3;
    }

    public Dog3() {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Farm3 getFarm3() {
        return farm3;
    }

    public void setFarm3(Farm3 farm3) {
        this.farm3 = farm3;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // assign the shallow copy to new reference dog3
        Dog3 dog31 = (Dog3)super.clone();
        Dog3 dog3 = new Dog3();

        dog3.name = dog31.getName();
        dog3.age = dog31.getAge();
        dog3.setFarm3(new Farm3(dog31.getFarm3().getName()));

        return dog3;
    }
}
public class CopyWithCloneMethod {
    public static void copyWithCloneMethod1() throws CloneNotSupportedException {
        System.out.println("-------------start--------------");
        System.out.println("1.2.2 --------------------------");
        Farm3 farm3 = new Farm3("Vietnam");
        Dog2 dog2 = new Dog2("maxim", 0, farm3);
        Dog2 dog3 = (Dog2) dog2.clone();
        System.out.println("before change value");
        System.out.println("name                 = " + dog2.getName() + ", age = " + dog2.getAge() +
                ", farm = " + dog2.getFarm3().getName());

        System.out.println("name                 = " + dog3.getName() + ", age = " + dog3.getAge() +
                ", farm = " + dog3.getFarm3().getName());
        System.out.println("assignment           = " + (dog2 == dog3));        // false
        System.out.println("equal method         = " + dog2.equals(dog3));     // false
        System.out.println("dog2 hashcode        = " + Integer.toHexString(dog2.hashCode()));
        System.out.println("dog3 hashcode        = " + Integer.toHexString(dog3.hashCode()));
        System.out.println("after change value");
        dog3.setName("maxim2");
        dog3.setAge(2);
        dog3.getFarm3().setName("China");
        System.out.println("name                 = " + dog2.getName() + ", age = " + dog2.getAge() +
                ", farm = " + dog2.getFarm3().getName());

        System.out.println("name                 = " + dog3.getName() + ", age = " + dog3.getAge() +
                ", farm = " + dog3.getFarm3().getName());
        System.out.println("-------------end--------------");
    }

    public static void copyWithCloneMethod2() throws CloneNotSupportedException {
        System.out.println("-------------start--------------");
        System.out.println("1.2.3 --------------------------");
        Farm3 farm3 = new Farm3("Vietnam");
        Dog3 dog3 = new Dog3("maxim", 0, farm3);
        Dog3 dog32 = (Dog3) dog3.clone();
        System.out.println("before change value");
        System.out.println("name                 = " + dog3.getName() + ", age = " + dog3.getAge() +
                ", farm = " + dog3.getFarm3().getName());

        System.out.println("name                 = " + dog32.getName() + ", age = " + dog32.getAge() +
                ", farm = " + dog32.getFarm3().getName());
        System.out.println("assignment           = " + (dog3 == dog32));        // false
        System.out.println("equal method         = " + dog3.equals(dog32));     // false
        System.out.println("dog3  hashcode       = " + Integer.toHexString(dog3.hashCode()));
        System.out.println("dog32 hashcode       = " + Integer.toHexString(dog32.hashCode()));
        System.out.println("after change value");
        dog32.setName("maxim2");
        dog32.setAge(2);
        dog32.getFarm3().setName("China");
        System.out.println("name                 = " + dog3.getName() + ", age = " + dog3.getAge() +
                ", farm = " + dog3.getFarm3().getName());

        System.out.println("name                 = " + dog32.getName() + ", age = " + dog32.getAge() +
                ", farm = " + dog32.getFarm3().getName());
        System.out.println("-------------end--------------");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * shallow
         * với object như String or Class nó sẽ bị tác động trên cả hai
         * với primitive thì nó không anh hưởng lẫn nhau
         * Shallow copies are cheap and simple to make. In the above example, we created a shallow copy of the object
         */
        copyWithCloneMethod1();
        // deep
        // có nghĩa là với deep copy, gần như là phải new một đối tượng mới xong gán lại
        // khi đó việc thay đổi giá trị của đối tượng này sẽ không ảnh hưởng đến đối tượng khác
        copyWithCloneMethod2();
    }
}
