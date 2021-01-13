package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    //ELEMENTOS DE LUGIA
    Pokemon pk1 = new Pokemon("Lugia", 79, 298, 0);
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
    Pokemon pk2 = new Pokemon("Sylveon", 57, 175, 150);
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
    Pokemon pk3 = new Pokemon("Ditto", 53, 180, 50);
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
    Pokemon pk4 = new Pokemon("Metapod", 100, 500, 500);
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
    Pokemon pk5 = new Pokemon("Mew", 42, 220, 80);
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
    Pokemon pk6 = new Pokemon("Magikarp", 50000, 50000, 50000);
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

    //LABEL SIGUIENTE
    @FXML
    public Label siguiente;


    public void initialize() {

        //OBTENCION DE DATOS DE LOS POKEMONES
        nombre1.setText(pk1.getNombre());
        nivel1.setText("Nv "+pk1.getNivel());
        bar1.setProgress((float) pk1.getVidaRestante()/ (float) pk1.getVidaTotal());
        salud1.setText(pk1.getVidaRestante() +"/"+ pk1.getVidaTotal());

        nombre2.setText(pk2.getNombre());
        nivel2.setText("Nv "+ pk2.getNivel());
        bar2.setProgress((float) pk2.getVidaRestante()/(float) pk2.getVidaTotal());
        salud2.setText(pk2.getVidaRestante() +"/"+ pk2.getVidaTotal());

        nombre3.setText(pk3.getNombre());
        nivel3.setText("Nv "+ pk3.getNivel());
        bar3.setProgress((float) pk3.getVidaRestante()/(float) pk3.getVidaTotal());
        salud3.setText(pk3.getVidaRestante() +"/"+ pk3.getVidaTotal());

        nombre4.setText(pk4.getNombre());
        nivel4.setText("Nv "+ pk4.getNivel());
        bar4.setProgress((float) pk4.getVidaRestante()/(float) pk4.getVidaTotal());
        salud4.setText(pk4.getVidaRestante() +"/"+ pk4.getVidaTotal());

        nombre5.setText(pk5.getNombre());
        nivel5.setText("Nv "+ pk5.getNivel());
        bar5.setProgress((float) pk5.getVidaRestante()/(float) pk5.getVidaTotal());
        salud5.setText(pk5.getVidaRestante() +"/"+ pk5.getVidaTotal());

        nombre6.setText(pk6.getNombre());
        nivel6.setText("Nv "+ pk6.getNivel());
        bar6.setProgress((float) pk6.getVidaRestante()/(float) pk6.getVidaTotal());
        salud6.setText(pk6.getVidaRestante() +"/"+ pk6.getVidaTotal());

    }

    //FUNCIONES DE CLICK EN LOS POKEMONES Y METODO DE DESELECCION

    @FXML
    public void selectPokemon1(){
        vaciarSeleccion();
        pk1.setSeleccionado(true);
        if(salud1.getText().charAt(0)=='0'){
            lugia.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            lugia.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }
    @FXML
    public void selectPokemon2(){
        vaciarSeleccion();
        pk2.setSeleccionado(true);
        if(salud2.getText().charAt(0)=='0'){
            sylveon.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            sylveon.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }
    @FXML
    public void selectPokemon3(){
        vaciarSeleccion();
        pk3.setSeleccionado(true);
        if(salud3.getText().charAt(0)=='0'){
            ditto.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            ditto.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }
    @FXML
    public void selectPokemon4(){
        vaciarSeleccion();
        pk4.setSeleccionado(true);
        if(salud4.getText().charAt(0)=='0'){
            metapod.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            metapod.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }
    @FXML
    public void selectPokemon5(){
        vaciarSeleccion();
        pk5.setSeleccionado(true);
        if(salud5.getText().charAt(0)=='0'){
            mew.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            mew.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }
    @FXML
    public void selectPokemon6(){
        vaciarSeleccion();
        pk6.setSeleccionado(true);
        if(salud6.getText().charAt(0)=='0'){
            magikarp.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            magikarp.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
        }
    }

    private void vaciarSeleccion() {
        lugia.setStyle("-fx-background-color:  #5260a1");
        pk1.setSeleccionado(false);
        pk2.setSeleccionado(false);
        pk3.setSeleccionado(false);
        pk4.setSeleccionado(false);
        pk5.setSeleccionado(false);
        pk6.setSeleccionado(false);
        sylveon.setStyle("-fx-background-color:  #5260a1");
        ditto.setStyle("-fx-background-color:  #5260a1");
        metapod.setStyle("-fx-background-color:  #5260a1");
        mew.setStyle("-fx-background-color:  #5260a1");
        magikarp.setStyle("-fx-background-color:  #5260a1");
    }

    public void clickarSiguiente(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("sample2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
