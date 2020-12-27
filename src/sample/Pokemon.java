package sample;

public class Pokemon {

    private String nombre;
    private int nivel;
    private int vidaTotal;
    private int vidaRestante;

    public Pokemon(String n, int nv, int vt, int vr){
        this.nombre=n;
        this.nivel=nv;
        this.vidaTotal=vt;
        this.vidaRestante=vr;
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
}
