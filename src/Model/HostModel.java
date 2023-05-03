package Model;

import Model.gameClasses.Board;
import Model.gameClasses.Player;
import Model.gameClasses.Tile;

import java.util.List;
import java.util.Observable;

public class HostModel extends Observable implements BookScrabble_Model {
    @Override
    public void tryPlaceWord() {
    }

    @Override
    public void challenge() {

    }

    @Override
    public void passTheTurn() {

    }

    @Override
    public void setGameFinish() {

    }

    @Override
    public Board getBoardStatus() {
        return null;
    }

    @Override
    public Player getCurrentPlayer() {
        return null;
    }

    @Override
    public int getCurrentPlayerScore() {
        return 0;
    }

    @Override
    public int getCurrentPlayerIndex() {
        return 0;
    }

    @Override
    public List<Tile> getCurrentPlayerTiles() {
        return null;
    }

    @Override
    public boolean isHost() {
        return false;
    }

    @Override
    public boolean isGameStarted() {
        return false;
    }

    @Override
    public boolean isGameEnded() {
        return false;
    }

    @Override
    public int[] getBagStatus() {
        return new int[0];
    }

    @Override
    public Player getWinner() {
        return null;
    }
}
