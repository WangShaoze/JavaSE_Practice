package base.practice01;

public class Demo5 {
    public static void main(String[] args) {
        /*
        * 5、一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个四位数是多少？
        * */
        for (int i=1000; i<10000;i++){
            int num = i/1000;
            if (i==3*(i-num*1000)){
                System.out.println(i);
            }
        }
    }
}
