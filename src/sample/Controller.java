package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    //ELEMENTOS DE POKEMONES
    Pokemon pk1 = new Pokemon("Lugia", 79, 298, 298, new Image("https://uploads.twitchalerts.com/000/408/833/795/Lugia1.gif"), new Image("https://static.wikia.nocookie.net/espokemon/images/a/af/Lugia_espalda_G6.gif/revision/latest?cb=20150321175008"));
    Pokemon pk2 = new Pokemon("Sylveon", 57, 175, 175, new Image("https://static.wikia.nocookie.net/espokemon/images/4/4d/Sylveon_XY.gif/revision/latest/scale-to-width-down/59?cb=20150321173638"), new Image("https://static.wikia.nocookie.net/espokemon/images/5/50/Sylveon_espalda_G6.gif/revision/latest/scale-to-width-down/67?cb=20150321183307"));
    Pokemon pk3 = new Pokemon("Tauros", 53, 180, 180, new Image("https://static.wikia.nocookie.net/espokemon/images/3/35/Tauros_XY.gif/revision/latest/scale-to-width-down/97?cb=20140111210924"), new Image("https://static.wikia.nocookie.net/espokemon/images/a/a5/Tauros_espalda_G6.gif/revision/latest/scale-to-width-down/132?cb=20150321183421"));
    Pokemon pk4 = new Pokemon("Mewtwo", 100, 500, 500, new Image("https://static.wikia.nocookie.net/espokemon/images/d/d3/Mewtwo_XY.gif/revision/latest/scale-to-width-down/100?cb=20140215200912"), new Image("https://static.wikia.nocookie.net/espokemon/images/6/64/Mewtwo_espalda_G6.gif/revision/latest/scale-to-width-down/155?cb=20150315013816"));
    Pokemon pk5 = new Pokemon("Tentacool", 42, 220, 220, new Image("https://static.wikia.nocookie.net/espokemon/images/8/8f/Tentacool_XY.gif/revision/latest/scale-to-width-down/45?cb=20140111210924"), new Image("https://static.wikia.nocookie.net/espokemon/images/c/cc/Tentacool_espalda_G6.gif/revision/latest/scale-to-width-down/45?cb=20150321183446"));
    Pokemon pk6 = new Pokemon("Magikarp", 50000, 50000, 50000, new Image("https://static.wikia.nocookie.net/espokemon/images/4/44/Magikarp_XY_hembra.gif/revision/latest/scale-to-width-down/58?cb=20140809162815"), new Image("https://static.wikia.nocookie.net/espokemon/images/1/1f/Magikarp_espalda_G6_hembra.gif/revision/latest/scale-to-width-down/72?cb=20190818222904"));
    @FXML
    public GridPane lugia, sylveon, tauros, tentacool, magikarp, mewtwo;
    @FXML
    public Label nombre1, nombre2, nombre3, nombre4, nombre5, nombre6, nivel1, nivel2, nivel3, nivel4, nivel5, nivel6, salud1, salud2, salud3, salud4, salud5, salud6;
    @FXML
    public ProgressBar bar1, bar2, bar3, bar4, bar5, bar6;
    @FXML
    public ImageView imagen1, imagen2,imagen3, imagen4, imagen5, imagen6;

    //LABEL SIGUIENTE Y ESTADISTICAS
    @FXML
    public Button siguiente;
    @FXML
    public Button estadisticas;

    //OBJETO POKEMON AUXILIAR PARA PASAR AL CONTROLLER 2
    Pokemon pokemonAux;


    public void initialize() {

        //OBTENCION DE DATOS DE LOS POKEMONES
        imagen1.setImage(pk1.getImagenMenu());
        nombre1.setText(pk1.getNombre());
        nivel1.setText("Nv "+pk1.getNivel());
        bar1.setProgress((float) pk1.getVidaRestante()/ (float) pk1.getVidaTotal());
        salud1.setText(pk1.getVidaRestante() +"/"+ pk1.getVidaTotal());

        imagen2.setImage(pk2.getImagenMenu());
        nombre2.setText(pk2.getNombre());
        nivel2.setText("Nv "+ pk2.getNivel());
        bar2.setProgress((float) pk2.getVidaRestante()/(float) pk2.getVidaTotal());
        salud2.setText(pk2.getVidaRestante() +"/"+ pk2.getVidaTotal());

        imagen3.setImage(pk3.getImagenMenu());
        nombre3.setText(pk3.getNombre());
        nivel3.setText("Nv "+ pk3.getNivel());
        bar3.setProgress((float) pk3.getVidaRestante()/(float) pk3.getVidaTotal());
        salud3.setText(pk3.getVidaRestante() +"/"+ pk3.getVidaTotal());

        imagen4.setImage(pk4.getImagenMenu());
        nombre4.setText(pk4.getNombre());
        nivel4.setText("Nv "+ pk4.getNivel());
        bar4.setProgress((float) pk4.getVidaRestante()/(float) pk4.getVidaTotal());
        salud4.setText(pk4.getVidaRestante() +"/"+ pk4.getVidaTotal());

        imagen5.setImage(pk5.getImagenMenu());
        nombre5.setText(pk5.getNombre());
        nivel5.setText("Nv "+ pk5.getNivel());
        bar5.setProgress((float) pk5.getVidaRestante()/(float) pk5.getVidaTotal());
        salud5.setText(pk5.getVidaRestante() +"/"+ pk5.getVidaTotal());

        imagen6.setImage(pk6.getImagenMenu());
        nombre6.setText(pk6.getNombre());
        nivel6.setText("Nv "+ pk6.getNivel());
        bar6.setProgress((float) pk6.getVidaRestante()/(float) pk6.getVidaTotal());
        salud6.setText(pk6.getVidaRestante() +"/"+ pk6.getVidaTotal());

    }

    //FUNCIONES DE CLICK EN LOS POKEMONES Y METODO DE DESELECCION DE LOS DEMAS
    @FXML
    public void selectPokemon1(){
        vaciarSeleccion();
        if(salud1.getText().charAt(0)=='0'){
            lugia.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            lugia.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk1;
        }
        estadisticas.setDisable(false);
    }
    @FXML
    public void selectPokemon2(){
        vaciarSeleccion();
        if(salud2.getText().charAt(0)=='0'){
            sylveon.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            sylveon.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk2;
        }
        estadisticas.setDisable(false);
    }
    @FXML
    public void selectPokemon3(){
        vaciarSeleccion();
        if(salud3.getText().charAt(0)=='0'){
            tauros.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            tauros.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk3;
        }
        estadisticas.setDisable(false);
    }
    @FXML
    public void selectPokemon4(){
        vaciarSeleccion();
        if(salud4.getText().charAt(0)=='0'){
            mewtwo.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            mewtwo.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk4;
        }
        estadisticas.setDisable(false);
    }
    @FXML
    public void selectPokemon5(){
        vaciarSeleccion();
        if(salud5.getText().charAt(0)=='0'){
            tentacool.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            tentacool.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk5;
        }
        estadisticas.setDisable(false);
    }
    @FXML
    public void selectPokemon6(){
        vaciarSeleccion();
        if(salud6.getText().charAt(0)=='0'){
            magikarp.setStyle("-fx-background-color:  #E38F6D");
            siguiente.setDisable(true);
        }else {
            magikarp.setStyle("-fx-background-color:  #6D82E3");
            siguiente.setDisable(false);
            pokemonAux=pk6;
        }
        estadisticas.setDisable(false);
    }

    private void vaciarSeleccion() {
        lugia.setStyle("-fx-background-color:  #5260a1");
        sylveon.setStyle("-fx-background-color:  #5260a1");
        tauros.setStyle("-fx-background-color:  #5260a1");
        mewtwo.setStyle("-fx-background-color:  #5260a1");
        tentacool.setStyle("-fx-background-color:  #5260a1");
        magikarp.setStyle("-fx-background-color:  #5260a1");
    }

    //METODO PARA PASAR A LA VENTANA DEPELEA AL PULSAR SIGUIENTE CON UN POKEMON ELEGIDO
    public void clickarSiguiente(){
        try{
            pokemonAux.elegido();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("sample2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            Controller2 controller2 = fxmlLoader.getController();
            controller2.pasarPokemon(pokemonAux, this);
            Stage stg = (Stage) siguiente.getScene().getWindow();
            stg.hide();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //METODOPARA ABRIR LAS ESTADISTICAS
    public void clickarEstadisticas(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("sample3.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            Controller3 controller3 = fxmlLoader.getController();
            controller3.pasarDatos(pokemonAux, this);
            Stage stg =(Stage) siguiente.getScene().getWindow();
            stg.hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //METODO PARA EL CALLBACK DESDE EL CONTROLLER 2 PARA PASAR LA INFO DEL POKEMON TRAS LA BATALLA
    public void devolverPokemon(Pokemon pokemon){
        vaciarSeleccion();
        siguiente.setDisable(true);
        estadisticas.setDisable(true);
        Stage stg = (Stage) siguiente.getScene().getWindow();
        stg.show();

        switch (pokemon.getNombre()) {
            case "Lugia" -> {
                pk1.setVidaRestante(pokemon.getVidaRestante());
                bar1.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud1.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
            case "Sylveon" -> {
                pk2.setVidaRestante(pokemon.getVidaRestante());
                bar2.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud2.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
            case "Tauros" -> {
                pk3.setVidaRestante(pokemon.getVidaRestante());
                bar3.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud3.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
            case "Mewtwo" -> {
                pk4.setVidaRestante(pokemon.getVidaRestante());
                bar4.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud4.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
            case "Tentacool" -> {
                pk5.setVidaRestante(pokemon.getVidaRestante());
                bar5.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud5.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
            case "Magikarp" -> {
                pk6.setVidaRestante(pokemon.getVidaRestante());
                bar6.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
                salud6.setText(pokemon.getVidaRestante() + "/" + pokemon.getVidaTotal());
            }
        }
    }

}
