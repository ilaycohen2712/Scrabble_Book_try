package Model.gameClasses;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int score;
    List<Tile> tilesInHand;

    /**
     * Player constructor. It gets a name and set it, initializes the score to 0 and the tiles in hand to an empty list.
     * @param name Set the player name.
     */
    public Player(String name){
        this.name = name;
        this.score = 0;
        this.tilesInHand = new ArrayList<>();
    }

    /**
     * This method returns the name of the player.
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the score of the player.
     * @return the score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * This method sets the score of the player.
     * @param score Sets the score of the player.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * getTilesInHand method returns the tiles in the player's hand.
     * @return the list of tiles in the player's hand.
     */
    public List<Tile> getTilesInHand() {
        return tilesInHand;
    }

    /**
     * reFillHand method refills the player's hand with tiles from the bag until the player has x tiles or the bag is empty.
     * @param x the number which the player's hand should be refilled.
     */
    public void reFillHand(int x){
        while(tilesInHand.size() < x){
            if(Tile.Bag.getBag().size() == 0)
                break;
            tilesInHand.add(Tile.Bag.getBag().getRand());
        }
    }
}
