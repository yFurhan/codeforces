import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

       
        int solvedCount = 0;

        
        for (int i = 0; i < n; i++) {
            
            int p = scanner.nextInt();
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            
            int confidentFriends = p + v + t;

            
            if (confidentFriends >= 2) {
                solvedCount += 1;
            }
        }

        
        System.out.println(solvedCount);

        scanner.close();
    }
}