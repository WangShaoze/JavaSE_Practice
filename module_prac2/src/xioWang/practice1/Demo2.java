package xioWang.practice1;

/*
*
* 3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
那么我们可以自己实现一个时间类来满足程序中的需要。
定义名为 MyTime 的类其中应有三个整型成员时 hour 分 minute 秒 second
为了保证数据的安全性这三个成员变量应声明为私有。
为MyTime类定义构造方法以方便创建对象时初始化成员变量。
再定义 diaplay 方法用于将时间信息打印出来。
为MyTime类添加以下方法
    addSecond(int sec)
    addMinute(int min)
    addHour(int hou)
    subSecond(int sec)
    subMinute(int min)
    subHour(int hou)
分别对时、分、秒进行加减运算。
* */

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void diaplay(){
        System.out.println(this.hour+":"+this.minute+":"+this.second);
    }


    public void addSecond(int sec){
        this.second += sec;
        if (this.second>=60){
            int t = this.second/60;
            addMinute(t);
            this.second -= t*60;
        }
    }

    public void addMinute(int min){
        this.minute += min;
        if (this.minute>=60){
            int t = this.minute/60;
            addHour(t);
            this.minute -= 60*t;
        }
    }

    public void addHour(int hou){
        this.hour += hou;
    }

    public void subSecond(int sec){
        this.second -= sec;
        if (this.second<0){
            int t = (-1*this.second)/60;
            subMinute(t+1);
            this.second += 60*(t+1);
        }
    }

    public void subMinute(int min){
        this.minute -= min;
        if (this.minute<0){
            int t = (-1*this.minute)/60;
            subHour(t+1);
            this.minute += 60*(t+1);
        }
    }

    public void subHour(int hou){
        this.hour -= hou;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(12, 14,45);
        myTime.diaplay();
        myTime.addSecond(120);
        myTime.diaplay();
        myTime.subSecond(120);
        myTime.diaplay();

        myTime.addMinute(10);
        myTime.diaplay();
        myTime.subMinute(10);
        myTime.diaplay();

        myTime.addHour(10);
        myTime.diaplay();
        myTime.subHour(10);
        myTime.diaplay();
    }
}

