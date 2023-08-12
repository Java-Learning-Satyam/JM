public class MainChellange {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 10000;
        int level = 8;
        int bonus = 200;

        calculateScore(true,8000,level,bonus); // as in upside i have declared this var then i can run this

        // can also we can ad a funcion call in print statement like
        System.out.println("The value of highscore is " + calculateScore(true,8000,level,bonus));
        // by making this we are doing code duplication -- to solve this we use method

//        gameOver = true;
//        score = 10000;
//        level = 8;
//        bonus = 200;
//        finalScore = score;
//        if (gameOver) {
//            finalScore += (level * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        int finalScore = calculateScore(true,10000,7,150);
        System.out.println("The final score is " + finalScore);
    }
    // You need to add a method outside a main , method cannot exist alone , without a class

    public static int calculateScore(boolean gameOver , int score , int level, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (level * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
