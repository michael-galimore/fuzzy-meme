public class CodeBlocksAndIfThenElseControlStatements {

    public static void main(String[] args) {
      boolean gameOver = true;
      int score = 5000;
      int levelCompleted = 5;
      int bonus = 100;

      if(score < 5000 && score > 1000){
          System.out.println("Your score less than was 5000 but greater than 1000.");
      } else if (score < 1000){
          System.out.println("Your score was less than 1000.");
      }
      else {
          System.out.println("Your score was not less than 5000!");
      }
        if(gameOver == true){
//            if(gameOver)
//            finalScore is a scoped variable meaning that it can only be accessed inside the code block.
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        int score2 = 10000;
        int levelCompleted1 = 8;
        int bonus1 = 200;
        boolean newGameOver = true;

        if(newGameOver){
            int finalScore1 = score2 + (levelCompleted1 * bonus1);
            System.out.println("Your new final score is " + finalScore1);
        }


    }
}
