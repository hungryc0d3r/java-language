/**
 * statementif | and | or
 */
public class statementif {

  public static void main(String[] args) {
    int topScore = 100;
    int secTopScore = 80;
    int score = 85;
    // and operator
    if (score == 100) {
      System.out.println("It is top score");
    }

    if (score > 100 && score >= 85) {
      System.out.println("It is first grade");
    }
    // or operator
    if (score >= 100 || score <=80 ) {
      System.out.println("It is top score");
    }

    if (score < 100 || score >= 85) {
      System.out.println("It is first grade");
    }

  }
}
