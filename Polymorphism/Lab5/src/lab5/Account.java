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
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            System.out.println(a + " baht is deposited to " + name + ".");
            balance = balance + a;
        }
        else{
            System.out.println("Input number must be a positive integer");
        }
    }
    public void withdraw(double a){
        if (a > 0){
            if (balance - a > 0){
                System.out.println(a + " baht is withdrawn from" + name + ".");
                balance = balance - a;
            }
            else{
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void setName(String name){
        name = name;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
    
}
