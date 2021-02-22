package sample;

import javafx.scene.image.Image;

public class Pokemon {

    private String nombre;
    private int nivel;
    private int vidaTotal;
    private int vidaRestante;
    private Image imagenMenu;
    private Image imagenPelea;
    private int ataqueHecho;
    private int danioRecibido;
    private int elegido = 0;

    public Pokemon(String n, int nv, int vt, int vr, Image imagenMenu, Image imagenPelea){
        this.nombre=n;
        this.nivel=nv;
        this.vidaTotal=vt;
        this.vidaRestante=vr;
        this.imagenMenu=imagenMenu;
        this.imagenPelea=imagenPelea;
        this.ataqueHecho = 0;
        this.danioRecibido = 0;
    }

    //HAGO LOS GET POR HACER LOS ATRIBUTOS PRIVADOS

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public int getVidaRestante() {
        return vidaRestante;
    }
    public Image getImagenMenu() {
        return imagenMenu;
    }

    public Image getImagenPelea(){
        return imagenPelea;
    }

    public void setVidaRestante(int vidaRestante) {
        this.vidaRestante = vidaRestante;
    }

    public int getAtaqueHecho() {
        return ataqueHecho;
    }
    public void setAtaqueHecho(int ataque){
        this.ataqueHecho+=ataque;
    }

    public int getDanioRecibido() {
        return danioRecibido;
    }
    public void setDanioRecibido(int danio){
        this.danioRecibido+=danio;
    }

    public int getElegido(){
        return elegido;
    }
    public void elegido(){
        this.elegido++;
    }
}
