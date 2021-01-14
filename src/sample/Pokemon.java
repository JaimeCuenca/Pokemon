package sample;

import javafx.scene.image.Image;

public class Pokemon {

    private String nombre;
    private int nivel;
    private int vidaTotal;
    private int vidaRestante;
    private Image imagenMenu;
    private Image imagenPelea;

    public Pokemon(String n, int nv, int vt, int vr, Image imagenMenu, Image imagenPelea){
        this.nombre=n;
        this.nivel=nv;
        this.vidaTotal=vt;
        this.vidaRestante=vr;
        this.imagenMenu=imagenMenu;
        this.imagenPelea=imagenPelea;
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
}
