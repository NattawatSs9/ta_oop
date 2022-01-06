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
public class Player {
    private String name;
    private String team;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void  setTeam(String t){
       team = t; 
    }
    public String getTeam(){
       return team;
    }
    public boolean isSameTeam(Player p){
        if (p.team.equals(team)){
            return true;
        }
        else{
            return false;
        }
    }
}
