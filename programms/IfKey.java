/**
 * IfKey
 */
public class IfKey {
  public static void main(String[] args) {
    boolean gameOver = true;
    int firstScore = 800;
    int levelCompleted = 5;
    int bonus = 100;
        if (gameOver) {
          int finalScore = firstScore + (levelCompleted * bonus);
          System.out.println("your finalScore is: "+finalScore);
        }
    // Second Score
    boolean secondGameOver = true;
    int secondScore = 10000;
    int newLevelCompleted = 8;
    int newBonus = 200;
        if (gameOver) {
          int finalScore = secondScore + (newLevelCompleted * newBonus);
          System.out.println("your finalScore is: "+finalScore);
        }

  }
}
