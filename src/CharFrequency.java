
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String S = sc.nextLine();

        // Input character
        char C = sc.next().charAt(0);

        int count = 0;

        // Loop through the string
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                count++;
            }
        }

        // Output result
        System.out.println(count);

        sc.close();
    }
}
