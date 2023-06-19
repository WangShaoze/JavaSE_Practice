package base.practice;


import java.util.Scanner;

/*
1、计算1000以内所有不能被7整除的整数之和

2、计算 1+2-3+4-5+6-7....+100的结果

3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1

4、从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）

5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。

6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
找出1000内所有的完数。

8、给一个不多于5位的正整数，
要求：
一、求它是几位数
二、逆序打印出各位数字
*/
public class Demo {
    public static void main(String[] args) {
        {
            // 1、计算1000以内所有不能被7整除的整数之和
            int sum=0;
            for (int i=1;i<1000;i++){
                if (i%7!=0){
                    sum+=i;
                }
            }
            System.out.println("结果是:"+sum);
        }
        {
            // 2、计算 1+2-3+4-5+6-7....+100的结果
            int sum=0;
            for (int i=1;i<=100;i++){
                if (i==1){
                    sum += i;
                    continue;
                }
                if ((i%2==0)){
                    sum+=i;
                }else {
                    sum+=-1*i;
                }
            }
            System.out.println(sum);
        }
        {
            // 3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个正整数:");
            int n = scanner.nextInt();
            int s=1;
            for (int i=1;i<=n; i++){
                s*=i;
            }
            System.out.println("正整数"+n+"的阶乘为:"+s);
        }
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个正整数:");
            int n = scanner.nextInt();
            System.out.println(n+"是质数:"+isZhiShu(n));
        }
        {
            /*
            * 5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
                *
               ***
              *****
             *******
            *********
            例如：输入5，则打印如上图5行。
            * */
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个正整数:");
                int n = scanner.nextInt();
                for (int i=1; i<=n;i++){
                    for (int j=1; j<=n; j++){
                        if (j<n-i+1){
                            System.out.print(" ");
                        }else {
                            System.out.print("*");
                        }
                    }
                    if (i!=1){
                        for (int t=1; t<=i-1; t++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个正整数:");
                int n = scanner.nextInt();
                for (int i=1; i<=n;i++){
                    for (int j=1; j<=n; j++){
                        if (j>=n-i+1){
                            break;
                        }
                        System.out.print(" ");
                    }
                    int k = 1;
                    while (k<=(2*i-1)){
                        System.out.print("*");
                        k++;
                    }
                    System.out.println();
                }
            }
        }
        {
            /*
            * 6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
            或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
            * */
            int day = 1;
            double her;
            while (true){
                her = money(day);
                if (her==100.0){
                    break;
                }
                day++;
            }
            System.out.println("第"+day+"她的钱："+her);
        }
        {
            /*
            * 7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
                找出1000内所有的完数。
            * */
            for (int i=1; i<=1000;i++){
                int sum=0;
                String s = "";
                for (int j=1; j<=i/2; j++){
                    if (i%j==0){
                        sum += j;
                        s += j+"\t";
                    }
                }
                if (sum==i){
                    System.out.println("是完数："+i+",\t"+s);
                }
            }
        }
        {
            /*
            * 8、给一个不多于5位的正整数，
                要求：
                一、求它是几位数
                二、逆序打印出各位数字
            * */
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个不多于5位的正整数:");
            String n = scanner.nextLine();
            System.out.println("它是"+n.length()+"位数");
            System.out.println("各位数字逆序：");
            for (int i=n.length()-1; i>=0; i--){
                System.out.print("\t");
                System.out.print(n.charAt(i)+"\t");
            }
        }
    }

    private static double money(int n) {
        double her=0.0;
        for (int i = 0; i< n; i++){
            if (i%5==0){
                her-=6.0;
            }else {
                her+=2.5;
            }
        }
        return her;
    }

    public static boolean isZhiShu(int n){
        boolean flag=true;
        for (int i=2; i<n; i++){
            if (n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
