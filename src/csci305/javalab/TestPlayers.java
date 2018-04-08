package csci305.javalab;

/*
 * @author Isaac Griffith 
 * 
 * Pre-made method to test players
 */
public class TestPlayers {

    public static void main(String args[]) {
      Player p1 = new StupidBot("StupidBot");
      Player p2 = new RandomBot("RandomBot");
      Element p1move = p1.Play();
      Element p2move = p2.Play();
      System.out.println(p1move.compareTo(p2move));
    }
}
