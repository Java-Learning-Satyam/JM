// method dispHighScorePogistion 2 perameter - player name and player pogistion
// method calcHighScoerePogistion 1 perameter- player score return num btwn 1 and 4
public class MethodChellange {
    public static void main(String[] args) {

        int score = calculateHighScorePosition(1500);
        displayHighScorePosistion("Satyam",score);

        score = calculateHighScorePosition(1000);
        displayHighScorePosistion("Rohan",score);

        score = calculateHighScorePosition(500);
        displayHighScorePosistion("Manas",score);

        score = calculateHighScorePosition(100);
        displayHighScorePosistion("Jigesh",score);

        score = calculateHighScorePosition(25);
        displayHighScorePosistion("jhon",score);

    }

    public static void displayHighScorePosistion(String playerName, int pogistion) {
        System.out.println(playerName + " managed to get " + pogistion + " pogistion in the score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result = 4;

        if (playerScore >= 1000) {
          result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }
        
        return result;

    }
}
