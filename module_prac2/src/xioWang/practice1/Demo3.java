package xioWang.practice1;

/*
*
* 4、编写Java程序模拟简单的计算器。
定义名为 Number 的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
分别对两个成员变量执行加、减、乘、除的运算。

在main方法中创建Number类的对象调用各个方法并显示计算结果
*
* */

class Number{
    private int n1;
    private int n2=1;
    public Number(){}

    public Number(int n1, int n2) {
        this.n1 = n1;
        if (n2==0){
            n2 = 1;
        }
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        if (n2==0){
            n2 = 1;
        }
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }



    public int addition(){
        return this.n1+this.n2;
    }


    public int subtration(){
        return this.n1-this.n2;
    }

    public int multiplication(){
        return this.n1*this.n2;
    }

    public int division(){
        return this.n1/this.n2;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Number number = new Number(45, 9);
        System.out.println(number.addition());
        System.out.println(number.subtration());
        System.out.println(number.multiplication());
        System.out.println(number.division());

    }
}
