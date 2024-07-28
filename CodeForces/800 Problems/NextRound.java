import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read the scores into an array
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Find the score of the k-th place participant
        int thresholdScore = scores[k - 1];

        // Count the number of participants who will advance to the next round
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= thresholdScore && scores[i] > 0) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);

        scanner.close();
    }
}