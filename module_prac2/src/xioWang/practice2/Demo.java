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
    public void makeSound(){

    }
}

class Erhu extends Instrument{

}
class Piano extends Instrument{

}
class Violin extends Instrument{

}

class Musician{
    public void play(Instrument i){}
}
public class Demo {
}
