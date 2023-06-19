package base.prac;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student("s0012", "xioWang", "16");
        student.display();
    }
}


/*
*
* 2、定义一个学生类
属性包括：学生编号、学生姓名、学生年龄
属性私有化，对外提供公开的set和get方法
提供无参构造和有参数构造方法
提供一个display()方法，通过该方法打印学生信息。
编写测试程序创建对象，调用display()方法。
*
* */

class Student{
    private String id;// 学生编号
    private String name;// 学生姓名
    private String age;// 学生年龄

    public Student() {
    }

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Student[id: "+id+", name: "+name+", age: "+age+"]");
    }
}