import java.util.Scanner;

public class Watermelon4A {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int w=scanner.nextInt();
        scanner.close();

        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}