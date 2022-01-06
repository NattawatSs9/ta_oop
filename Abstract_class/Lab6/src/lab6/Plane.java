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
public class Plane extends Vehicle {
    private String airline;
    private String boeing;
    private final static int MAX_FLYER = 2;
    
    public void setairline(String a){
        this.airline = a;
    }
    public String getairline(){
        return airline;
    }
    public void setboeing(String b){
        this.boeing = b;
    }
    public String getboeing(){
        return boeing;
    }
    public Plane(){
        super.fuel = 0.0;
        this.airline = "";
        this.boeing = "";
    }
    public Plane(double fuel, String airline, String boeing){
        super.fuel = fuel;
        this.airline = airline;
        this.boeing = boeing;
    }
    public void startEngine(){
        if (fuel >= 20){
            fuel -= 20;
            System.out.println("Plane’s Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Plane’s Engine stops");
    }
    public void honk(){
        System.out.println("Weeeee");
    }
    public void fly(){
        if (fuel >= 20){
            fuel -= 20;
            System.out.println("Plane Fly");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void takeOff(){
        if (fuel >= 10){
            fuel -= 10;
            System.out.println("Plane Already to Take Off");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void landing(){
        if (fuel >= 10){
            fuel -= 10;
            System.out.println("Plane Already to Landing");
        }
        else{
            System.out.println("Fuel is nearly empty.");
        }
    }
    
}
