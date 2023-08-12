import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShorthandSpeedTester {
    public static void main(String[] args) {
        String correctShorthandContent = "If Miss Nelson wishes to see-the works,";

        System.out.println("Shorthand Practice ex 26");
//        System.out.println("Type the following shorthand content:");
//        System.out.println(correctShorthandContent);
        System.out.println("Press Enter when ready...");

        // Wait for the user to press Enter to start typing
        waitForEnterKey();

        // Get the user's input
        String userInput = getUserInput();

        // Calculate typing speed and accuracy
        int totalTypedWords = userInput.trim().split("\\s+").length;
        double timeTakenInSeconds = calculateTimeTaken();
        double typingSpeedWPM = calculateTypingSpeed(totalTypedWords, timeTakenInSeconds / 60);
        double accuracyPercentage = calculateAccuracy(userInput, correctShorthandContent);
        double finalScore = calculateFinalScore(typingSpeedWPM, accuracyPercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Correct Translation: " + correctShorthandContent);
        System.out.println("User's Input:        " + userInput);
        System.out.println("Typing Speed (WPM):  " + typingSpeedWPM);
        System.out.println("Accuracy (%):        " + accuracyPercentage);
        System.out.println("Final Score:         " + finalScore);
        printWrongWords(userInput, correctShorthandContent);
    }

    // Wait for the user to press Enter
    private static void waitForEnterKey() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    // Get user's input
    private static String getUserInput() {
        System.out.println("Start typing...");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Typing completed!");
        return userInput;
    }

    // Calculate the time taken to complete typing
    private static double calculateTimeTaken() {
        // Replace this with your own mechanism to measure time taken for typing
        // For simplicity, we'll use an example value of 120 seconds (2 minutes).
        return 120;
    }

    // Calculate typing speed in words per minute (WPM)
    private static double calculateTypingSpeed(int totalTypedWords, double timeTakenInMinutes) {
        return totalTypedWords / timeTakenInMinutes;
    }

    // Calculate accuracy percentage using Levenshtein distance
    private static double calculateAccuracy(String userInput, String correctShorthandContent) {
        String normalizedUserInput = userInput.trim().toLowerCase();
        String normalizedCorrectShorthandContent = correctShorthandContent.trim().toLowerCase();

        int totalCharacters = normalizedCorrectShorthandContent.length();
        int levenshteinDistance = calculateLevenshteinDistance(normalizedUserInput, normalizedCorrectShorthandContent);

        return ((double) (totalCharacters - levenshteinDistance) / totalCharacters) * 100;
    }

    // Calculate Levenshtein distance between two strings
    private static int calculateLevenshteinDistance(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= str2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                int cost = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
            }
        }

        return dp[str1.length()][str2.length()];
    }

    // Calculate the final score
    private static int calculateFinalScore(double typingSpeedWPM, double accuracyPercentage) {
        return (int) ((int) (0.6 * typingSpeedWPM) + (0.4 * accuracyPercentage));
    }

    // Find and print wrong words in the user's
    public static void printWrongWords(String userInput, String correctShorthandContent) {
        String[] userWords = userInput.trim().split("\\s+");
        String[] correctWords = correctShorthandContent.trim().split("\\s+");

        int[][] dp = new int[userWords.length + 1][correctWords.length + 1];

        for (int i = 0; i <= userWords.length; i++) {
            for (int j = 0; j <= correctWords.length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = i + j;
                } else if (userWords[i - 1].equalsIgnoreCase(correctWords[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insertion = dp[i][j - 1] + 1;
                    int deletion = dp[i - 1][j] + 1;
                    int substitution = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(insertion, Math.min(deletion, substitution));
                }
            }
        }

        int i = userWords.length;
        int j = correctWords.length;

        List<String> wrongWords = new ArrayList<>();

        while (i > 0 && j > 0) {
            if (userWords[i - 1].equalsIgnoreCase(correctWords[j - 1])) {
                i--;
                j--;
            } else {
                wrongWords.add(userWords[i - 1]);
                j--; // Skip the current word in correctWords to handle trailing words in user input
            }
        }

        while (i > 0) {
            wrongWords.add(userWords[i - 1]);
            i--;
        }

        System.out.println("\nWrong Words:");
        for (int index = wrongWords.size() - 1; index >= 0; index--) {
            System.out.println(wrongWords.get(index));
        }
    }

}
