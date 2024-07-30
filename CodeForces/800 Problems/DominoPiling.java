import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        
        int totalSquares = M * N;

        
        int maxDominoes = totalSquares / 2;

        
        System.out.println(maxDominoes);

        scanner.close();
    }
}