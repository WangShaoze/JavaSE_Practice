package xioWang.practice1;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int init_num = scanner.nextInt();
        A a = new A(init_num);
        B b = new B(a);
        while (true){
            System.out.println("请输入你猜测的数字:");
            int n = scanner.nextInt();
            if (b.guess(n).equalsIgnoreCase("猜测成功")){
                System.out.println(b.guess(n));
                break;
            }else {
                System.out.println(b.guess(n));
            }

        }
    }
}

class A{
    /*
    * 1、猜数字游戏
    一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
    另外再定义一个类B，对A类的实例变量v进行猜测。
        如果大了则提示大了
        小了则提示小了
        等于则提示猜测成功
    * */
    private int v;
    public A(){}

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
class B{
    private A a;

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String guess(int num){
        if (num>a.getV()){
            return "大了";
        } else if (num==a.getV()) {
            return "猜测成功";
        }else {
            return "小了";
        }
    }
}

