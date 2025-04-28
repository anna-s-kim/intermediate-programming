import java.util.Scanner;

public class ErrorCheck {

    public static int getInt(Scanner sc) {
        String ans = sc.nextLine(); //uses scanner for user input
        for (int i = 0; i < ans.length(); i++) {
            // Check if the character is not a digit
            if ((Character.isDigit(ans.charAt(i))) == false) {
                //if character is not a digit, reruns input() function
                System.out.println("Input invalid. Please try again.");
                getInt(sc);
            }
        }
        return Integer.valueOf(ans);
    }
}
