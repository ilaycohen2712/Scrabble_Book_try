package Model;

import Model.gameClasses.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

public class HostModel extends Observable implements BookScrabble_Model {

    Board board;
    Tile.Bag bag;
    DictionaryManager dictionaryManager;
    ServerSocket hostServer;
    List<Player> players;
    public int currentPlayerIndex;
    boolean isGameEnded;

    private static HostModel model_instance = null;


    public static HostModel getInstance(){
        if(model_instance==null){
            model_instance = new HostModel();
        }
        return model_instance;
    }

    private HostModel(){
        Scanner scanner = new Scanner(System.in);
        int port = scanner.nextInt();
        try {
            hostServer = new ServerSocket(port);
            System.out.println("Server is up and running on port " + port + "...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        board = Board.getBoard();
        bag = Tile.Bag.getBag();
        dictionaryManager = DictionaryManager.get();
        players = new ArrayList<>();
        isGameEnded = false;
        Player player1 = new Player("Player1");
        players.add(player1);
        Player player2 = new Player("Player2");
        players.add(player2);
        Player player3 = new Player("Player3");
        players.add(player3);
        Player player4 = new Player("Player4");
        players.add(player4);
        currentPlayerIndex = 0;

    }



    @Override
    public void passTheTurn(int playerIndex) {

    }

    @Override
    public void setGameFinish() {

    }

    @Override
    public Board getBoardStatus() {
        return Board.getBoard();
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
    public int[] getBagStatus() {
        return new int[0];
    }

    @Override
    public Player getWinner() {
        return null;
    }
}
