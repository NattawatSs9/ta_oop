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
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*OnepointTwo();*/
        /*TwopointOne();*/
        /*TwopointTwo();*/
        /*TwopointFour();*/
        /*ThreepointOne();*/
        /*ThreepointTwo();*/
    }
    /*public static void OnepointOne(){
        Account a1 = new Account();
        a1.showAccount();
    }*/
    public static void OnepointTwo(){
        Account a1 = new Account(50000,"61070033");
        a1.showAccount();
        a1.deposit(500);
        a1.showAccount();
        a1.withdraw(40000);
        a1.showAccount();
    }
    public static void TwopointOne(){
        CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(40000.0);
        System.out.println(a1.toString()); 
    }
    public static void TwopointTwo(){
        CheckingAccount a1 = new CheckingAccount();
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(40000.0);
        System.out.println(a1.toString());
    }
    /*public static void TwopointThree(){
        Account a1 = new CheckingAccount();
        a1.setCredit(1000);
        System.out.println(a1);
    }*/
    public static void TwopointFour(){
        Account a1 = new CheckingAccount();
        System.out.println(a1);
        ((CheckingAccount)a1).setCredit(1000);
        System.out.println(a1);
    }
    public static void ThreepointOne(){
        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    public static void ThreepointTwo(){
        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("Harry","Potter");
        Customer c3 = new Customer("Harry","Potter",a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
}
