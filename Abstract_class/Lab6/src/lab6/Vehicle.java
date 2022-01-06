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
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public Vehicle(){
        this(0.0);
    }
    public Vehicle(double fuel){
        this.fuel = fuel;
    }
    public void addFuel(double fuel){
        if (fuel > 0){
            this.fuel += fuel;
        }
        else{
            System.out.println("Fuel is empty.");
        }
    }
    public abstract void honk();
    
    public void setfuel(double f){
        fuel = f;
    }
    public double getfuel(){
        return fuel;
    }
}

