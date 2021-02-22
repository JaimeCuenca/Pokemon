package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller3 {

    //ELEMENTOS
    @FXML
    public PieChart pie;
    @FXML
    public BarChart bar;
    @FXML
    public CategoryAxis x;
    @FXML
    public NumberAxis y;
    @FXML
    public Button menu;

    //PARA EL CALLBACK
    private Controller controller;

    //ELEMENTOS POKEMONES
    public Pokemon miPokemon;

    public void initialize(){
    }

    //METODO PARA EL CALLBACK DESDE EL CONTROLLER PARA PASAR EL POKEMON QUE PELEARÁ
    public void pasarDatos(Pokemon pokemon, Controller controller){
        this.controller = controller;
        miPokemon=pokemon;

        XYChart.Series set1 = new XYChart.Series();
        set1.getData().add(new XYChart.Data<>(controller.pk1.getNombre(), controller.pk1.getElegido()));
        set1.getData().add(new XYChart.Data<>(controller.pk2.getNombre(), controller.pk2.getElegido()));
        set1.getData().add(new XYChart.Data<>(controller.pk3.getNombre(), controller.pk3.getElegido()));
        set1.getData().add(new XYChart.Data<>(controller.pk4.getNombre(), controller.pk4.getElegido()));
        set1.getData().add(new XYChart.Data<>(controller.pk5.getNombre(), controller.pk5.getElegido()));
        set1.getData().add(new XYChart.Data<>(controller.pk6.getNombre(), controller.pk6.getElegido()));
        bar.getData().addAll(set1);

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Daño hecho", miPokemon.getAtaqueHecho()),
                new PieChart.Data("Daño recibido", miPokemon.getDanioRecibido()));

        pie.setData(pieData);
    }
    //METODO PARA VOLVER AL MENU DE ELECCION DE POKEMON
    public void clickarVolver(){
        controller.devolverPokemon(miPokemon);
        Stage stg = (Stage) menu.getScene().getWindow();
        stg.hide();
    }
}
