public class Methods {

    public static void main(String[] args) {


        calculate(true,800,5,100);

        calculate(true, 10000, 8, 200);

    }
        public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus){

            if(gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("Your final score was " + finalScore);
                return finalScore;
            } else {
                return -1;
            }
        }
}
