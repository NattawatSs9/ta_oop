package lab8;

public class Account {

    protected double balance;
    protected String name;

    public Account() {
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double a) {
        if (a > 0) {
            this.balance += a;
            System.out.println(a + " baht is deposited to " + this.name + ".");
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(double a) {
        if (a > 0) {
            double moneyleft = this.balance - a;
            if (moneyleft < 0) {
                System.out.println("Not enough money!");
            } else {
                this.balance -= a;
                System.out.println(a + " baht is withdraw from " + this.name);
            }
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void showAccount() {
        if (this.name != null) {
            System.out.println(this.name + " account has " + this.balance + " baht.");
        }
        else{
            System.out.println("account has " + this.balance + " baht.");
        }
    }
}
