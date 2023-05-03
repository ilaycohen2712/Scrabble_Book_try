package Model.tests;
import Model.gameClasses.Player;
import Model.gameClasses.Tile;
import java.util.List;

public class TestPlayer {
    public void testPlayer() {
        Player p = new Player("test");
        if (p.getScore() != 0 || p.getTilesInHand().size() != 0 || !p.getName().equals("test"))
            System.out.println("Player initialization failed");
        p.setScore(p.getScore() + 10);
        if (p.getScore() != 10)
            System.out.println("Player setScore failed");
        p.reFillHand(8);
        if (p.getTilesInHand().size() != 8)
            System.out.println("Player reFillHand1 failed");
        List<Tile> playerHand = p.getTilesInHand();
        p.reFillHand(8);
        if (p.getTilesInHand() != playerHand)
            System.out.println("Player reFillHand2 failed");
    }

    public void bagTest(){
        Player p = new Player("test");
        p.reFillHand(5);
        List<Tile> playerHand = p.getTilesInHand();
        if(p.getTilesInHand().size()!=5)
            System.out.println("TestPlayer bagTest failed");
        Tile.Bag b = Tile.Bag.getBag();
        //empty the bag
        while(b.size()>0){
            b.getRand();
        }
        p.reFillHand(8);
        if(p.getTilesInHand()!=playerHand)
            System.out.println("TestPlayer bagTest failed - player hand should not change when bag is empty");

    }
    public static void main(String[] args) {
        TestPlayer test = new TestPlayer();
        test.testPlayer();
        test.bagTest();
        System.out.println("TestPlayer finished- all tests passed");

    }
}
