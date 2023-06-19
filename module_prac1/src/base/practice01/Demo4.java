package base.practice01;

public class Demo4 {
    public static void main(String[] args) {
        /*
        * 4、题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
        * 求它在第10次落地时，共经过多少米
        *
        * */
        System.out.println("共经过"+reds1()+"米");
        System.out.println("共经过"+reds()+"米");

    }

    private static double reds1() {
        double h = 100, s=h, base=h/2;
        for (int i=1; i<10;i++){
            s += 2*base;
            base /=2;
        }
        return s;
    }

    public static float reds(){
        float h = 100, s = h, b = h / 2;
        for (int i = 2; i <= 10; i++) {
            s += 2 * b;
            b /= 2;
        }
        return s;
    }

}
