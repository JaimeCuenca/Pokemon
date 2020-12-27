package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;



public class Controller {

    //ELEMENTOS DE LUGIA
    @FXML
    public GridPane lugia;
    @FXML
    public Label nombre1;
    @FXML
    public Label nivel1;
    @FXML
    public ProgressBar bar1;
    @FXML
    public Label salud1;

    //ELEMENTOS DE SYLVEON
    @FXML
    private GridPane sylveon;
    @FXML
    public Label nombre2;
    @FXML
    public Label nivel2;
    @FXML
    public ProgressBar bar2;
    @FXML
    public Label salud2;

    //ELEMENTOS DE DITTO
    @FXML
    private GridPane ditto;
    @FXML
    public Label nombre3;
    @FXML
    public Label nivel3;
    @FXML
    public ProgressBar bar3;
    @FXML
    public Label salud3;

    //ELEMENTOS DE METAPOD
    @FXML
    private GridPane metapod;
    @FXML
    public Label nombre4;
    @FXML
    public Label nivel4;
    @FXML
    public ProgressBar bar4;
    @FXML
    public Label salud4;

    //ELEMENTOS DE MEW
    @FXML
    private GridPane mew;
    @FXML
    public Label nombre5;
    @FXML
    public Label nivel5;
    @FXML
    public ProgressBar bar5;
    @FXML
    public Label salud5;

    //ELEMENTOS DE MAGIKARP
    @FXML
    private GridPane magikarp;
    @FXML
    public Label nombre6;
    @FXML
    public Label nivel6;
    @FXML
    public ProgressBar bar6;
    @FXML
    public Label salud6;

    //LABEL SALIR
    @FXML
    public Label salir;


    public void initialize() {

        //OBTENCION DE DATOS DE LOS POKEMONES
        Pokemon pk1 = new Pokemon("Lugia", 79, 298, 230);
        nombre1.setText(pk1.getNombre());
        nivel1.setText("Nv "+pk1.getNivel());
        bar1.setProgress((float) pk1.getVidaRestante()/ (float) pk1.getVidaTotal());
        salud1.setText(pk1.getVidaRestante() +"/"+ pk1.getVidaTotal());

        Pokemon pk2 = new Pokemon("Sylveon", 57, 175, 150);
        nombre2.setText(pk2.getNombre());
        nivel2.setText("Nv "+ pk2.getNivel());
        bar2.setProgress((float) pk2.getVidaRestante()/(float) pk2.getVidaTotal());
        salud2.setText(pk2.getVidaRestante() +"/"+ pk2.getVidaTotal());

        Pokemon pk3 = new Pokemon("Ditto", 53, 180, 50);
        nombre3.setText(pk3.getNombre());
        nivel3.setText("Nv "+ pk3.getNivel());
        bar3.setProgress((float) pk3.getVidaRestante()/(float) pk3.getVidaTotal());
        salud3.setText(pk3.getVidaRestante() +"/"+ pk3.getVidaTotal());

        Pokemon pk4 = new Pokemon("Metapod", 100, 500, 500);
        nombre4.setText(pk4.getNombre());
        nivel4.setText("Nv "+ pk4.getNivel());
        bar4.setProgress((float) pk4.getVidaRestante()/(float) pk4.getVidaTotal());
        salud4.setText(pk4.getVidaRestante() +"/"+ pk4.getVidaTotal());

        Pokemon pk5 = new Pokemon("Mew", 42, 220, 80);
        nombre5.setText(pk5.getNombre());
        nivel5.setText("Nv "+ pk5.getNivel());
        bar5.setProgress((float) pk5.getVidaRestante()/(float) pk5.getVidaTotal());
        salud5.setText(pk5.getVidaRestante() +"/"+ pk5.getVidaTotal());

        Pokemon pk6 = new Pokemon("Magikarp", 50000, 50000, 50000);
        nombre6.setText(pk6.getNombre());
        nivel6.setText("Nv "+ pk6.getNivel());
        bar6.setProgress((float) pk6.getVidaRestante()/(float) pk6.getVidaTotal());
        salud6.setText(pk6.getVidaRestante() +"/"+ pk6.getVidaTotal());

    }

    //FUNCIONES DECLICKEN LOSPOKEMONES Y METODO DE DESELECCION

    @FXML
    public void selectPokemon1(){
        vaciarSeleccion();
        lugia.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }
    @FXML
    public void selectPokemon2(){
        vaciarSeleccion();
        sylveon.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }
    @FXML
    public void selectPokemon3(){
        vaciarSeleccion();
        ditto.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }
    @FXML
    public void selectPokemon4(){
        vaciarSeleccion();
        metapod.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }
    @FXML
    public void selectPokemon5(){
        vaciarSeleccion();
        mew.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }
    @FXML
    public void selectPokemon6(){
        vaciarSeleccion();
        magikarp.setStyle("-fx-background-color:  #6D82E3");
        salir.setDisable(false);
    }

    private void vaciarSeleccion() {
        lugia.setStyle("-fx-background-color:  #5260a1");
        sylveon.setStyle("-fx-background-color:  #5260a1");
        ditto.setStyle("-fx-background-color:  #5260a1");
        metapod.setStyle("-fx-background-color:  #5260a1");
        mew.setStyle("-fx-background-color:  #5260a1");
        magikarp.setStyle("-fx-background-color:  #5260a1");
    }

    public void salir(){
        //AQUÍ SE IRÍA A OTRA PANTALLA DEL JUEGO
    }

}
