package xioWang.practice2;


/*
*
某公司的雇员分为以下若干类：
    Employee：这是所有员工总的父类，
        属性：
            员工的姓名,员工的生日月份。
        方法：getSalary(intmonth)
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
    private String birth;

    public Employee(){}
    public Employee(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public boolean isBirth(String date_month){
        boolean flag=false;
        if (this.birth.equalsIgnoreCase(date_month)){
            flag = true;
        }
        return flag;
    }
    public void getSalary(int month){

    }

}
public class Demo2 {
}
