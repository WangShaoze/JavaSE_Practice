package xioWang.practice2;
/*
*
* 2.1.多态练习题
编写程序模拟“主人”喂养“宠物”的场景：
提示1：
    主人类：Master
    宠物类：Pet
    宠物类子类：Dog、Cat、YingWu
提示2：
    主人应该有喂养的方法：feed()
    宠物应该有吃的方法：eat()
    只要主人喂宠物，宠物就吃。

要求：主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。

编写测试程序：
    创建主人对象
    创建各种宠物对象
    调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。

通过该案例，理解多态在开发中的作用。
重要提示：feed方法是否需要一个参数，参数选什么类型！！！
* */
class Pet{
    public String name;

    public void eat(String item){
        System.out.println(name+"正在吃"+item);
    }
}

class Dog extends Pet{
    public Dog(String name) {
        this.name = name;
    }
}
class Cat extends Pet{
    public Cat(String name) {
        this.name = name;
    }
}
class YingWu extends Pet{
    public YingWu(String name) {
        this.name = name;
    }
    @Override
    public void eat(String item) {
        System.out.println(name+"正在啄"+item);
    }
}


class Master{
    public String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Pet pet, String item){
        if (pet instanceof YingWu){
            pet.eat(item);
        } else if (pet instanceof Dog) {
            pet.eat(item);
        } else if (pet instanceof Cat) {
            pet.eat(item);
        }
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Master master = new Master("zioHao");
        Cat cat = new Cat("MIMI");
        Dog dog = new Dog("WANWAN");
        YingWu yingWu = new YingWu("Lih");

        master.feed(cat, "猫粮");
        master.feed(dog, "狗粮");
        master.feed(yingWu, "鸟食");
    }
}
