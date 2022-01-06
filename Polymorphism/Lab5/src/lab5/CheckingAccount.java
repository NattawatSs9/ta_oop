/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author kpunv
 */
public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        if (a > 0){
            if (balance - a >= 0){
                balance = balance - a;
                System.out.println(a + " baht is withdrawn from" + name + " and your credit balance is " + credit + ".");
            }
            else if (balance - a < 0 && (credit + balance - a) >= 0){
                balance = 0;
                credit = credit - a;
                System.out.println(a + " baht is withdrawn from" + name + " and your credit balance is " + credit + ".");
            }
            else if (balance - a < 0 && (credit + balance - a) < 0){
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(int a){
        if (a > 0){
            if (balance - a >= 0){
                this.credit = credit - a;
            }
            else if (balance - a < 0 && (credit + balance - a) >= 0){
                balance = 0;
                credit = credit - a;
                System.out.println(a + " baht is withdrawn from" + name + " and your credit balance is " + credit + ".");
            }
            else if (balance - a < 0 && (credit + balance - a) < 0){
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    public String toString(){
        return ("The " + name  + " account has " + balance + " baht and " + credit +" credits.");
    }
}
