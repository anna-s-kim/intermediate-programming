import java.util.Scanner;

public class ErrorCheck {

    public static int getInt(Scanner sc) {
        String ans = sc.nextLine(); //uses scanner for user input
        boolean notInt = false;
        for (int i = 0; i < ans.length(); i++) {
            // Check if the character is not a digit
            if ((Character.isDigit(ans.charAt(i))) == false) {
                //if character is not a digit, reruns input() function
                notInt = true;
                System.out.println("Input invalid. Please try again.");
            }
        }
        if (notInt == false) {
            return Integer.valueOf(ans);
        }
        else {
            return getInt(sc);
        }


        // if notInt equals false, then we can just return the integer 
        // else, return getInt 
     }
}
