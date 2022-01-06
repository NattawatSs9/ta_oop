/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author kpunv
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(){
        this(0.0,0.0,0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon += 1;
    }
    public void eat(String food){
        if (food.equals("worm")){
            setweight(getweight() + 0.5);
        }
        else if(food.equals("seed")){
            setweight(getweight() + 0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public String toString(){
        return ("Pigeon " + getweight() + " kg and " + getheight() + " cm. There are " + numberOfPigeon +" pigeons.");
    }
    public void fly(){
        double ww = getweight();
        if (ww >= 5){
            setweight(ww - 0.25);
            System.out.println("Fly Fly");
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    public void takeOff(){
        double ww = getweight();
        if (ww >= 5){
            setweight(ww - 0.5);
            System.out.println("Take off");
        }
        else{
            System.out.println("I'm hungry");
        }
    }
    public void landing(){
        double ww = getweight();
        if (ww >= 5){
            setweight(ww - 0.5);
            System.out.println("Landing");
        }
        else{
            System.out.println("I'm hungry");
        }
    }
}
