package base.practice02;
/*
* 1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
* 思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
*
* */
public class Demo {
    public static void main(String[] args) {
        int num=5;
        double R = jieCheng(num);
        System.out.println(num+"的阶乘是:"+R);
    }

    private static int jieCheng(int num) {
        int r=1;
        for (int i = 1; i<= num; i++){
            r*=i;
        }
        return r;
    }
}
