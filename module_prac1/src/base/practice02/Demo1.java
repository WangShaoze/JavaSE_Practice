package base.practice02;

import java.util.Scanner;

//
//2、编写一个方法，输出大于某个正整数n的最小的质数。
//思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
//
//
//
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正整数n:");
        int n = scanner.nextInt();
        int t=n;
        while (true){
            if (isZhiShu(t)&&t>n){
                break;
            }else {
                t+=1;
            }
        }
        System.out.println("大于正整数"+n+"的最小的质数："+t);
    }

    public static boolean isZhiShu(int t){
        boolean flag=true;
        for (int i=2; i<t;i++){
            if (t%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
