package xioWang.practice1;

/*
* 2、请定义一个交通工具(Vehicle)的类
其中有属性：
    速度(speed)
    体积(size)等等
    方法移动(move())
    设置速度(setSpeed(int speed))
    加速 speedUp(),
    减速 speedDown()等等.

最后在测试类Vehicle中的main()中实例化一个交通工具对象
并通过方法给它初始化speed,size的值并且打印出来。
另外调用加速减速的方法对速度进行改变。

* */
public class Demo1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(54, 60);
        System.out.println(vehicle.toString());
        vehicle.speedUp();
        vehicle.speedUp();
        vehicle.speedUp();
        System.out.println(vehicle.toString());
        vehicle.speedDown();
        vehicle.speedDown();
        System.out.println(vehicle.toString());
    }
}

class Vehicle{
    @Override
    public String toString() {
        return this.speed+", "+this.size;
    }

    public int speed;  // 速度
    public double size;  // 体积

    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    // 方法移动
    public void move(boolean flag){
        if (flag){
            System.out.println("加速了");
        }else {
            System.out.println("减速了");
        }

    }

    // 设置速度
    public void setSpeed(int speed){
        this.speed += speed;
    }

    // 加速speedUp
    public void speedUp(){
        setSpeed(10);
        move(true);
    }

    // 减速speedDown
    public void speedDown(){
        setSpeed(-10);
        move(false);
    }

}
