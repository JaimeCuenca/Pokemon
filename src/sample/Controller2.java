package sample;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


public class Controller2 {

    //BOTONES
    @FXML
    public Button atacar, curar, ataque1, ataque2, ataque3, cancelar;

    //PARA EL CALLBACK
    private Controller controller;

    //RESULTADO DE LA BATALLA
    private boolean ganada;

    //ELEMENTOS POKEMONES
    public Pokemon miPokemon;
    Pokemon rivalPokemon = new Pokemon("Pikachu", 50, 240, 240,new Image("https://static.wikia.nocookie.net/espokemon/images/9/9b/Pikachu_XY_variocolor.gif/revision/latest/scale-to-width-down/60?cb=20150311201335"), new Image("https://static.wikia.nocookie.net/espokemon/images/9/9b/Pikachu_XY_variocolor.gif/revision/latest/scale-to-width-down/60?cb=20150311201335"));
    @FXML
    public GridPane rival, miPk;
    @FXML
    public Label nombreRival, nivelRival, psRival, nombreMiPk, nivelMiPk, psMiPk;
    @FXML
    public ProgressBar barRival, barMiPk;
    @FXML
    public ImageView imagenMiPk, imagenRival;

    public void initialize(){

        //OBTENCION DE LOS DATOS
        nombreRival.setText(rivalPokemon.getNombre());
        nivelRival.setText("Nv "+rivalPokemon.getNivel());
        barRival.setProgress((float) rivalPokemon.getVidaRestante()/ (float) rivalPokemon.getVidaTotal());
        imagenRival.setImage(rivalPokemon.getImagenPelea());

    }

    //METODO PARA EL CALLBACK DESDE EL CONTROLLER PARA PASAR EL POKEMON QUE PELEARÁ
    public void pasarPokemon(Pokemon pokemon, Controller controller){
        this.controller = controller;
        miPokemon=pokemon;
        nombreMiPk.setText(pokemon.getNombre());
        nivelMiPk.setText("Nv "+pokemon.getNivel());
        barMiPk.setProgress((float) pokemon.getVidaRestante() / (float) pokemon.getVidaTotal());
        imagenMiPk.setImage(pokemon.getImagenPelea());
        imagenMiPk.setImage(pokemon.getImagenPelea());
    }

    public void curar(){
            if (miPokemon.getVidaRestante() < miPokemon.getVidaTotal()) {
                int vida=miPokemon.getVidaRestante() + ThreadLocalRandom.current().nextInt(25, 76);
                if(vida > miPokemon.getVidaTotal()) miPokemon.setVidaRestante(miPokemon.getVidaTotal());
                else miPokemon.setVidaRestante(vida);
                barMiPk.setProgress((float) miPokemon.getVidaRestante() / (float) miPokemon.getVidaTotal());
            }
            if (rivalPokemon.getVidaRestante() < rivalPokemon.getVidaTotal()) {
                int vida = rivalPokemon.getVidaRestante() + ThreadLocalRandom.current().nextInt(25, 76);
                if (vida > rivalPokemon.getVidaTotal()) rivalPokemon.setVidaRestante(rivalPokemon.getVidaTotal());
                else rivalPokemon.setVidaRestante(vida);
                barRival.setProgress((float) rivalPokemon.getVidaRestante() / (float) rivalPokemon.getVidaTotal());
            }
    }

    public void atacar(){
        atacar.setVisible(false);
        curar.setVisible(false);
        ataque1.setVisible(true);
        ataque2.setVisible(true);
        ataque3.setVisible(true);
        cancelar.setVisible(true);
    }

    //MÉTODO DE REDUCCION DE LA VIDA DE LOS POKEMONES CUANDO SE UTILIZA ALGUN ATAQUE
    private void ataque(int num1, int num2){
        var ataque = ThreadLocalRandom.current().nextInt(num1, num2);
        miPokemon.setAtaqueHecho(ataque);
        rivalPokemon.setVidaRestante(rivalPokemon.getVidaRestante()-ataque);
        barRival.setProgress((float) rivalPokemon.getVidaRestante()/ (float) rivalPokemon.getVidaTotal());
        if (rivalPokemon.getVidaRestante()<1) {
            rivalPokemon.setVidaRestante(0);
            ganada=true;
            finBatalla();
        }else{
            var danio = ThreadLocalRandom.current().nextInt(num1, num2);
            miPokemon.setDanioRecibido(danio);
            miPokemon.setVidaRestante(miPokemon.getVidaRestante()-danio);
            barMiPk.setProgress((float) miPokemon.getVidaRestante() / (float) miPokemon.getVidaTotal());
            if(miPokemon.getVidaRestante()<1) {
                miPokemon.setVidaRestante(0);
                ganada=false;
                finBatalla();
            }
        }
    }

    //METODO PARA REALIZAR EL CALLBACK Y CERRAR VENTANA
    private void finBatalla() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("POKEMON");
        alert.setContentText("¿Qué deseas hacer?");
        alert.setGraphic(new ImageView(miPokemon.getImagenMenu()));
        if (ganada) {
            alert.setHeaderText("Victoria de "+miPokemon.getNombre());

            ButtonType pokemones = new ButtonType("Volver a mi equipo");
            ButtonType salir = new ButtonType("Salir");

            alert.getButtonTypes().setAll(pokemones, salir);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == pokemones) {
                controller.devolverPokemon(miPokemon);
                atacar.getScene().getWindow().hide();
            } else {
                atacar.getScene().getWindow().hide();
            }
        }else{
            alert.setHeaderText("Derrota de "+miPokemon.getNombre());

            ButtonType pokemones = new ButtonType("Probar con otro Pokemon");
            ButtonType salir = new ButtonType("Huir");

            alert.getButtonTypes().setAll(pokemones, salir);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == pokemones) {
                controller.devolverPokemon(miPokemon);
                atacar.getScene().getWindow().hide();
            } else {
                atacar.getScene().getWindow().hide();
            }
        }
    }

    public void ataque1(){
        ataque(20, 21);
    }

    public void ataque2(){
        ataque(10, 26);
    }

    public void ataque3(){
        ataque(0, 51);
    }

    public void cancelar(){
        atacar.setVisible(true);
        curar.setVisible(true);
        ataque1.setVisible(false);
        ataque2.setVisible(false);
        ataque3.setVisible(false);
        cancelar.setVisible(false);
    }

    //METODOS PARA PASAR EL PUNTERO POR ENCIMA DE "PS" Y QUE SALGA LA VIDA RESTANTE EXACTA
    public void mostrarVidaMiPk(){
        psMiPk.setText("PS: "+miPokemon.getVidaRestante());
    }
    public void mostrarVidaRival(){
        psRival.setText("PS: "+rivalPokemon.getVidaRestante());
    }
    public void mostrarPSmiPk(){
        psMiPk.setText("PS");
    }
    public void mostrarPSrival(){
        psRival.setText("PS");
    }
}
