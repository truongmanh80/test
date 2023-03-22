package org.example;

class Farm {
    private String name;

    public Farm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Cat {
    private String name;    // object

    private int age;        // primitive

    private Farm farm;
    public Cat(String name, int age, Farm farm) {
        this.name = name;
        // gán object kiểu này (shallow copy), nhưng String is immutable object,
        // nghĩa là khi thay đổi giá trị, thì nó tạo đối tượng giá trị mới, chứ không phải chỉnh sửa giá trị cũ
        // còn với kiểu Object User Define thì nó đúng như logic vẫn nghĩ
        this.age = age;
        this.farm = farm; // shallow copy
    }
    // copy constructor
    public Cat(Cat another) {
        this(another.name, another.age, another.farm);
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

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}

class Cat2 {
    private String name;    // object

    private int age;        // primitive

    private Farm farm;

    public Cat2(String name, int age, Farm farm) {
        this.name = name;
        this.age = age;
        this.farm = farm;
    }
    // copy constructor
    public Cat2(Cat2 cat) {
        this(cat.getName(),
                cat.getAge(),
                new Farm(cat.getName())); // deep copy
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

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
public class CopyConstructor {
    public static void copyConstructorShallow() {
        System.out.println("---------start---------");
        System.out.println("1.1.1--------------------");
        Farm farm = new Farm("Vietnam");
        Cat meo = new Cat("kitty", 0, farm);
        Cat anotherMeo = new Cat(meo);

        System.out.println("before change value");
        System.out.println("name                 = " + meo.getName() + ", age = " + meo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty,   0, Vietnam
        System.out.println("name                 = " + anotherMeo.getName() + ", age = " + anotherMeo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty,   0, Vietnam
        System.out.println("assignment           = " + (meo == anotherMeo));        // false
        System.out.println("equal method         = " + meo.equals(anotherMeo));     // false
        System.out.println("meo hashcode         = " + Integer.toHexString(meo.hashCode()));
        System.out.println("another meo hashcode = " + Integer.toHexString(anotherMeo.hashCode()));
        System.out.println("after change value");
        anotherMeo.setName("kitty2");
        anotherMeo.setAge(2);
        anotherMeo.getFarm().setName("China");
        System.out.println("name                 = " + meo.getName() + ", age = " + meo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty, 0, China
        System.out.println("name                 = " + anotherMeo.getName() + ", age = " + anotherMeo.getAge()
                + " , farm = " + anotherMeo.getFarm().getName());                   // kitty2, 2, China
        System.out.println("---------end---------");
    }
    public static void copyConstructorDeep() {
        System.out.println("---------start---------");
        System.out.println("1.1.2--------------------");
        Farm farm = new Farm("Vietnam");
        Cat2 meo = new Cat2("kitty", 0, farm);
        Cat2 anotherMeo = new Cat2(meo);

        System.out.println("before change value");
        System.out.println("name                 = " + meo.getName() + ", age = " + meo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty,   0, Vietnam
        System.out.println("name                 = " + anotherMeo.getName() + ", age = " + anotherMeo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty,   0, Vietnam
        System.out.println("assignment           = " + (meo == anotherMeo));        // false
        System.out.println("equal method         = " + meo.equals(anotherMeo));     // false
        System.out.println("meo hashcode         = " + Integer.toHexString(meo.hashCode()));
        System.out.println("another meo hashcode = " + Integer.toHexString(anotherMeo.hashCode()));

        System.out.println("after change value");
        anotherMeo.setName("kitty2");
        anotherMeo.setAge(2);
        anotherMeo.getFarm().setName("China");
        System.out.println("name                 = " + meo.getName() + ", age = " + meo.getAge()
                + " , farm = " + meo.getFarm().getName());                          // kitty, 0, Vietname (khác biệt ở chỗ này)
        System.out.println("name                 = " + anotherMeo.getName() + ", age = " + anotherMeo.getAge()
                + " , farm = " + anotherMeo.getFarm().getName());                   // kitty2, 2, China
        System.out.println("---------end---------");
    }

    public static void stringIsImmutable() {
        String name = "abc";
        String name2 = name;
        System.out.println("before");
        System.out.println(name.toString());
        System.out.println(name2.toString());
        System.out.println("after");
        name = "def";
        System.out.println(name.toString());
        System.out.println(name2.toString());
    }
    public static void main(String[] args) {
//        copyConstructorShallow();
//        copyConstructorDeep();
//        stringIsImmutable();
    }
}
