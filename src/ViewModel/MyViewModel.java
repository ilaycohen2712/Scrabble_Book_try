package ViewModel;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Observable;
import java.util.Observer;
public class MyViewModel implements Observer {

    //just an idea
    StringProperty[][] board;
    StringProperty[] player1Tiles;
    StringProperty[] player2Tiles;
    StringProperty[] player3Tiles;
    StringProperty[] player4Tiles;

    public MyViewModel(){
        board = new SimpleStringProperty[15][15];
        player1Tiles = new SimpleStringProperty[7];
        player2Tiles = new SimpleStringProperty[7];
        player3Tiles = new SimpleStringProperty[7];
        player4Tiles = new SimpleStringProperty[7];
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
