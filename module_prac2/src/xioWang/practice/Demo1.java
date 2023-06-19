package xioWang.practice;
/*
* 二、写一个名为 Account 的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户 id ，余额 balance ，年利率 annualInterestRate ；
包含的方法：各属性的set和get方法。取款方法 withdraw() ，存款方法 deposit()

写一个测试程序
（1）创建一个 Customer，名字叫Jane Smith，他有一个账号为 1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
* */
public class Demo1 {
    public static void main(String[] args) {
        Account account = new Account("1000", 2000, 1.23);
        Customer customer = new Customer("Jane Smith", account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println(customer.toString());
    }
}
class Account{
    private String id;   // 账户
    private int balance;   // 余额
    private double annualInterestRate;   // 年利率

    public Account(){}

    public Account(String id, int balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取款方法
    public void withdraw(int num){
        if (num>balance){
            System.out.println("余额不足，取钱失败");
        }else {
            balance -= num;
            System.out.println("成功取出："+num);
        }

    }

    // 存款方法
    public void deposit(int num){
        balance+= num;
        System.out.println("成功存入："+num);
    }
}

class Customer{
    private String name;
    private Account account;

    public Customer() {
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        String[] info_name = name.split(" ");
        return "Customer ["+info_name[1]+"，"+info_name[0]+"] has a account ：id is "+account.getId()+" annualInterestRate is "+account.getAnnualInterestRate()+"% balance is "+account.getBalance();
    }
}