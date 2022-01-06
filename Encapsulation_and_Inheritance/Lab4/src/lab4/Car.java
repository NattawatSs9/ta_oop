/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author kpunv
 */
public class Car extends Vehicle {
    private String typeEngine;
    public void setTypeEngine(String t){
       typeEngine = t; 
    }
    public String getTypeEngine(){
       return typeEngine;
    }
    public void showCarInfo(){
        System.out.println("Car engine is "+typeEngine);
        System.out.println("Fuel is "+this.getFuel()+" litre and Top Speed is"+this.getTopSpeed()+" m/s");
    }
    public void setCarInfo(int s, String t, String y){
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
        
    }
    public void move(){
        int x = getFuel();
        if(x >= 50){
            System.out.println("Move.");
            setFuel(x - 50);
        }
        else {
            System.out.println("Please add fuel.");
        }

    }
}
