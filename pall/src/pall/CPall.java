/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pall;

/**
 *
 * @author pricop_alexandru
 */
public class CPall {
    
    //private int rad;
    private int velocitaX;
    private int velocitaY;
    private int direzioneX;
    private int direzioneY;

    public CPall(/*int rad, */int velocitaX, int velocitaY, int direzioneX, int direzioneY) {
        //this.rad = rad;
        this.velocitaX = velocitaX;
        this.velocitaY = velocitaY;
        this.direzioneX = direzioneX;
        this.direzioneY = direzioneY;
    }

    public CPall() {
    }

    /*public int getRad() {
        return rad;
    }*/

    /*public void setRad(int rad) {
        this.rad = rad;
    }*/

    public int getVelocitaX() {
        return velocitaX;
    }

    public void setVelocitaX(int velocitaX) {
        this.velocitaX = velocitaX;
    }

    public int getVelocitaY() {
        return velocitaY;
    }

    public void setVelocitaY(int velocitaY) {
        this.velocitaY = velocitaY;
    }

    public int getDirezioneX() {
        return direzioneX;
    }

    public void setDirezioneX(int direzioneX) {
        this.direzioneX = direzioneX;
    }

    public int getDirezioneY() {
        return direzioneY;
    }

    public void setDirezioneY(int direzioneY) {
        this.direzioneY = direzioneY;
    }
    
}
