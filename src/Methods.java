public class Methods {

    public static void main(String[] args) {

        calculate(true,800,5,100);

        calculate(true, 10000, 8, 200);

    }
        public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus){

            if(gameOver){
//            if(gameOver)
//            finalScore is a scoped variable meaning that it can only be accessed inside the code block.
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("Your final score was " + finalScore);
            }
        }
}
