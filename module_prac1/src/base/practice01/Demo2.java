package base.practice01;

/*
* 2、题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
* 还不瘾，又多吃了一个。第二天早上又将剩下的桃子吃掉一半，又多吃了
* 一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上
* 想再吃时，只剩下一个桃子了。求第一天共摘了多少
* */
public class Demo2 {
    public static void main(String[] args) {
        int x=1;
        for (int i=1; i<=10;i++){
            // 10 - (10/2+1) = 4    y-(y/2+1) = x    y/2 = x+1   y = 2*(x+1)
            x = 2*(x+1);
        }
        System.out.println("第一天共摘了"+x+"个桃子");

        method1();  // 另外一种实现方式

    }

    private static void method1() {
        int y = 1;
        while (true){
            int t = y;
            for (int i=1; i<=10;i++){
                t = left(t);
            }
            if (t==1){
                break;
            }
            System.out.println("y:"+y);
            y+=1;
        }
        System.out.println("第一天共摘了"+y+"个桃子");
    }

    public static int left(int x){
        int y = x/2-1;
        return y;
    }
}
