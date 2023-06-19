package base.prac;

public class Demo2 {
    public static void main(String[] args) {
        Person p = new Person("张三",29, "男");
        Virus v = new Virus("SASS", 0.4, "急");
        v.attack(p);
    }
}

/*
*
* 3、定义一个人类
属性包括：姓名、年龄、性别
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个生病方法：ill()，在该方法中打印信息，例如：张三，男，29岁生病了
*
* */

class Person{
    private String name; // 姓名
    private int age; // 年龄
    private String gender; // 性别

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void ill(){
        System.out.println(name+"，"+gender+"，"+age+"岁生病了");
    }
}

/*
* 定义一个病毒类
属性包括：病毒名称 name 、病毒体积 size 、病毒类型 type
属性私有化，对外提供公开的set和get方法
提供无参数构造和有参数构造
提供一个攻击attack()方法，该方法的参数是“人”，例如：attack(Person p)
在attack()方法中调用人对象的生病方法。

编写测试程序，创建病毒对象，创建人对象，模拟病毒攻击人。
* */

class Virus{
    private String name;
    private double size;
    private String type;

    public Virus(){}

    public Virus(String name, double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack(Person p){
        System.out.println(name+"是一种大小为："+size+"um的"+type+"性病毒");
        p.ill();
    }
}