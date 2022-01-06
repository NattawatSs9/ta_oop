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
public abstract class Bird implements Flyable {
    private double wingSize;
    private double weight;
    private double height;
    
    public Bird(){
        this(0.0,0.0,0.0);
    }
    public Bird(double wingSize, double weight, double height){
        this.wingSize = wingSize;
        this.weight = weight;
        this.height = height;
    }
    public void eat(double food){
        if (food <= 0){
            System.out.println("Input cannot be negative number.");
        }
        else{
            this.weight += food;
        }
    }
    public void setwingSize(double wing){
        wingSize = wing;
    }
    public double getwingSize(){
        return wingSize;
    }
    public void setweight(double w){
        weight = w;
    }
    public double getweight(){
        return weight;
    }
    public void setheight(double h){
        height = h;
    }
    public double getheight(){
        return height;
    }
}
