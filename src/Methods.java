public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore =  calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);



        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore =  calculate(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        // Create a method called displayHighScorePosition
// it should show a players name as a parameter and 2nd parameter as a position in the high score table
// You should display the players name along with a message like " manged to get into position " and the position they got and a further message "on the high score table".

//        Create a 2nd method called calculateHighScorePosition
//        it should be sent one argument only, the player score
//        it should return an int
//        the return data should be
//        1 if the score is > 1000
//        1 if the score is > 500 and < 1000
//        3 if the score is > 100 and < 500
//        4 in all other cases
//        call both methods and display the results of the following
//        a score of 1500, 900, 400, and 50


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Kase", highScorePosition);


        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Meredith", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bobby", highScorePosition);




    }
        public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus){

            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;

                return finalScore;
            } else {
                return -1;
            }
        }

        public static void displayHighScorePosition(String playersName, int highScorePosition){
            System.out.println(playersName+ " managed to get into position " + highScorePosition + " on the high score table.");
        }

        public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if(playerScore >= 100 && playerScore < 500){
            return 3;
        } return 4;
        }
}
