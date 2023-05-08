package Model;
import Model.gameClasses.*;

import java.util.List;

public interface BookScrabble_Model {
    //"Setters"
    void passTheTurn(int playerIndex);
    void setGameFinish();

    //"Getters"
    Board getBoardStatus();
    Player getCurrentPlayer();
    int getCurrentPlayerScore();
    int getCurrentPlayerIndex();
    List<Tile> getCurrentPlayerTiles();
    boolean isHost();
    boolean isGameStarted();
    //boolean isGameEnded();
    int[] getBagStatus();
    Player getWinner();
}
