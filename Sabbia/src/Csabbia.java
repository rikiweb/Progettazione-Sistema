/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pizzo_davide
 */
public class Csabbia {
    private float posY;
    private float posX;
    private float volume,accellerazione; 
    DatiCondivisi dati;
    PImage img;
    
    public Csabbia(float x , float y,float volume float acc,DatiCondivisi dati){
   accellerazione=acc;
     this.volume=volume;
     posY=y;
     posX=x;
     img=loadImage("sabbia.jpg");
     img.resize(640,360);
     this.dati=dati;
    }
 
public void draw(){
image(img,posX,posY);
}
    public void aggInfo(){
    double n=Math.toRadians(dati.getInclinazioneX());
    accellerazione=(float) (9.8 * Math.sin(x));
    posX=posX+accellerazione;
    draw();
    }
}
