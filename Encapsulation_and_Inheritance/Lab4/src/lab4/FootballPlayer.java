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
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public void setPosition(String p){
        position = p;
    }
    public String getPosition(){
        return position;
    }
    public boolean isSamePosition(FootballPlayer p){
    if((p.getPosition().equals(this.getPosition()))&
    (p.getTeam().equals(this.getTeam()))){
        return true;
    }
    else{
        return false;

    }
}
}

