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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreeThird();
 }
    public static void OneFirst() {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate OR");
        if(p1.isSameTeam(p2))
            System.out.println(p1.getName() +" is a same team with "+p2.getName());
        else
            System.out.println(p1.getName() +" is not a same team with "+p2.getName());
    }
    public static void TwoFirst() {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate AND");
        if(p1.isSameTeam(p2))
            System.out.println(p1.getName() +" is a same team with "+p2.getName());
        else
            System.out.println(p1.getName() +" is not a same team with "+p2.getName());
 }
    public static void ThreeFirst() {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        System.out.println(p1.name);
    }
    public static void OneSecond(){
        FootballPlayer p1 = new FootballPlayer();
        p1.setName("Harry");
        p1.setTeam("Gryffindor");
        p1.setPlayerNumber(1);
        p1.setPosition("keeper");
        FootballPlayer p2 = new FootballPlayer();
        p2.setName("Jame");
        p2.setTeam("Gryffindor");
        p2.setPlayerNumber(1);
        p2.setPosition("keeper");
        System.out.println("We are same position : " + p1.isSamePosition(p2));
        System.out.println("We are same team : "+ p1.isSameTeam(p2));
 }
    public static void TwoSecond(){
        FootballPlayer p1 = new FootballPlayer();
        p1.setName("Harry");
        p1.setTeam("Gryffindor");
        p1.setPlayerNumber(1);
        p1.setPosition("keeper");
        FootballPlayer p2 = new FootballPlayer();
        p2.setName("Jame");
        p2.setTeam("Gryffindor");
        p2.setPlayerNumber(1);
        p2.setPosition("fullback");
        System.out.println("We are same position : " + p1.isSamePosition(p2));
        System.out.println("We are same team : "+ p1.isSameTeam(p2));
 }  
    public static void OneThird(){
        Plane p1 = new Plane();
        p1.setPlaneInfo(500, "High");
        p1.showPlaneInfo();
        Car c1 = new Car();
        c1.setCarInfo(500, "High", "Diesel");
        c1.showCarInfo();

    }
    public static void TwoThird(){
        Plane p1 = new Plane();
        p1.setPlaneInfo(300, "High");
        p1.showPlaneInfo();
        p1.fly();
        p1.showPlaneInfo();
        p1.fly();
        p1.showPlaneInfo();

    }
    public static void ThreeThird() {
        Car c1 = new Car();
        c1.setCarInfo(60, "High", "Diesel");
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
    }
}



    
