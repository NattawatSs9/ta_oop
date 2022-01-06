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
public class Customer extends CheckingAccount {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer(){
        this("","",null);
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    public String toString(){
        if (acct == null){
            return (firstName +" "+ lastName + "doesn't have account");
        }
        else{
            return ("The " + firstName + " account has " + acct.getBalance() +" baht and " + acct.getCredit() + " credits.");
        }
    }
    public boolean equals(Customer c){
        if (firstName.equals(c.firstName) && lastName.equals(c.lastName)){
            return true;
        }
        else{
            return false;
        }
    }
}
