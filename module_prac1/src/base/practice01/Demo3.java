package base.practice01;

public class Demo3 {
    public static void main(String[] args) {
        /*
        * 3、题目：计算 1! + 2! + 3! + 4! +... + 10!
        *    说明：4! 表示4的阶乘。4的阶乘是：1 * 2 * 3 * 4
        * */
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
        System.out.println(add1(1,2,3,4,5,6,7,8,9,10));
    }

    public static int add1(int... numbers){
        int sum=0;
        for (int n:
             numbers) {
            sum+=jieCheng(n);
        }return sum;
    }

    public static int add(int... numbers){
        int sum=0;
        for (int n:
                numbers) {
            sum+=factorial(n);
        }return sum;
    }

    public static int factorial(int num){
        int base=1;
        for (int i=1; i<num+1;i++){
            base *=i;
        }
        return base;
    }

    public static int jieCheng(int num){
        if (num==0) {
            return 1;
        }else {
            return num*jieCheng(num-1);
        }
    }

}
