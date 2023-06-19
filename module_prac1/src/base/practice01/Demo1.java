package base.practice01;

import java.util.Scanner;

/*
* 1、题目：一个5位数，判断它是不是回文数。
* 即12321是回文数，个位与万位相同，十位与千位相同
* */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入需要判断的5位数:");
//        int num = scanner.nextInt();
        int num = 12321;
        scanner.close();
        System.out.println(num+"是否是回文数："+isSymmetry(num));

    }
    public static boolean isSymmetry(String num){
        if (num.length()!=5){
            System.out.println("不是5为数！");
        }
        if ((num.charAt(0)==num.charAt(4))&&(num.charAt(1)==num.charAt(3))){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isSymmetry(int num){
        if (num<10000||num>99999){
            System.out.println("输入错误，请输入一个5位数！");
        }
        int a = num/10000;
        int b = num/1000%10;
        int c = num/100%10;
        int d = num/10%10;
        int e = num%10;
//        System.out.println(num/10000);
//        System.out.println(num/1000);
//        System.out.println(num/1000%10);
        if (a==e&&b==d){
            return true;
        }else {
            return false;
        }

    }
}
