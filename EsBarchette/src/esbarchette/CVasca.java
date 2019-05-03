/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbarchette;

/**
 *
 * @author User
 */
public class CVasca {

    //CAcqua acqua=new CAcqua();
    //CBarchetta barca=new CBarchetta();   
    private float altezza;
    private float larghezza;
    private float lunghezza;
    private float inclinazione;
    //private acqua acqua;
    //private barca barchetta;
    
    public CVasca(float inclinazione, float altezza, float larghezza, float lunghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.inclinazione= inclinazione;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public float getInclinazione() {
        return inclinazione;
    }
    
    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setInclinazione(float inclinazione) {
        this.inclinazione = inclinazione;
    }

    public void aggiornaAcqua(){
        (acqua.velocità + acqua.distribuzione)*inclinazione;
    }
    
    public void aggiornaBarca(){
        barca.visualizzaBarca();
        acqua.visualizzaAcqua();
    }
    
    
}
