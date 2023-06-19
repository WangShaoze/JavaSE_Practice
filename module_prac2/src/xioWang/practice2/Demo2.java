package xioWang.practice2;


/*
*
某公司的雇员分为以下若干类：
    Employee：这是所有员工总的父类，
        属性：
            员工的姓名,员工的生日月份。
        方法：getSalary(int month)
            根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。

    SalariedEmployee：
        Employee 的子类，拿固定工资的员工。
        属性：月薪

    HourlyEmployee：
        Employee 的子类， 按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
        属性：每小时的工资、每月工作的小时数

    SalesEmployee：
        Employee 的子类，销售人员，工资由月销售额和提成率决定。
        属性：月销售额、提成率

    BasePlusSalesEmployee：
        SalesEmployee 的子类，有固定底薪的销售人员，工资 由底薪加上销售提成部分。
        属性：底薪。

    根据要求创建 SalariedEmployee 、 HourlyEmployees 、SaleEmployee 和 BasePlusSalesEmployee四个类的对象各一个，
    并计算某个月这四个对象的工资。

    注意：要求把每个类都做成完全封装，不允许非私有化属性。
* */
class Employee{
    private String name;
    private int birth;

    public Employee() {
    }

    public Employee(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public boolean getSalary(int month){
        if (month==this.birth){
            return true;
        }else {
            return false;
        }
    }
}

class SalariedEmployee extends Employee{
    private double month_salary;

    public double getMonth_salary() {
        return month_salary;
    }

    public void setMonth_salary(double month_salary) {
        this.month_salary = month_salary;
    }
}

class HourlyEmployee extends Employee{
    private double hour_salary;
    private int hours;

    public double getHour_salary() {
        return hour_salary;
    }

    public void setHour_salary(double hour_salary) {
        this.hour_salary = hour_salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double monthSalary(){
        double month_salary = 0;
        int overtime = this.hours-160;
        if (overtime>0){
            month_salary = (overtime*1.5+160)*hour_salary;
        }else {
            month_salary = this.hours*hour_salary;
        }
        return month_salary;
    }
}

class SalesEmployee extends Employee{
    private double month_sale_number;
    private double per_rate;

    public double getMonth_sale_number() {
        return month_sale_number;
    }

    public void setMonth_sale_number(double month_sale_number) {
        this.month_sale_number = month_sale_number;
    }

    public double getPer_rate() {
        return per_rate;
    }

    public void setPer_rate(double per_rate) {
        this.per_rate = per_rate;
    }

    public double monthSalary(){
        return month_sale_number*per_rate;
    }
}

class BasePlusSalesEmployee extends SalesEmployee{
    private double base_salary;

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    @Override
    public double monthSalary() {
        return base_salary+super.monthSalary();
    }
}


public class Demo2 {
}
