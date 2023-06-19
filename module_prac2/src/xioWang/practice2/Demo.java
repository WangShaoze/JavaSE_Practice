package xioWang.practice2;
/*
* 1.编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
    实现思路及关键代码：
        1)定义乐器类 Instrument ，包括方法makeSound()
        2)定义乐器类的子类：二胡 Erhu 、钢琴 Piano 和小提琴 Violin
        3)定义乐手类 Musician ，可以弹奏各种乐器 play(Instrument i)
        4)定义测试类，给乐手不同的乐器让他弹奏

* */

class Instrument{
    String name;
    String function;

    public void makeSound(){
        System.out.println(name+"正在"+function);
    }
}

class Erhu extends Instrument{
    public Erhu(String name, String function) {
        this.name = name;
        this.function = function;
    }
}
class Piano extends Instrument{
    public Piano(String name, String function) {
        this.name = name;
        this.function = function;
    }
}
class Violin extends Instrument{
    public Violin(String name, String function) {
        this.name = name;
        this.function = function;
    }
}

class Musician{
    public String name;

    public Musician(String name) {
        this.name = name;
    }

    public void play(Instrument i){
        System.out.println(name+"，可以弹奏"+i.name+"乐器演奏。");
        i.makeSound();
    }
}
public class Demo {
    public static void main(String[] args) {
        Erhu erhu = new Erhu("二胡", "想起");
        Piano piano = new Piano("钢琴", "弹奏");

        Violin violin = new Violin("小提琴", "吹响");

        Musician musician_1 = new Musician("xioHua");
        Musician musician_2 = new Musician("xioLin");
        Musician musician_3 = new Musician("xioMei");

        musician_1.play(violin);
        musician_2.play(piano);
        musician_3.play(erhu);
    }
}
