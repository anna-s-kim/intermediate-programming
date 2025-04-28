package Quiz;
// Irene Feng 10/12/2022
// A question class with Answers.
// Anna Kim and Emanuella Odell Dec 2024
// We did everything together

import java.util.Scanner;

public class Question {

    // Fields
    String label;
    Answer[] possibleAnswers = new Answer[6];
    int userAnswer;
    Scanner sc = new Scanner(System.in);
    String ans;

    public Question(String label) {
        this.label = label;
    }

    // ask a question, and return the category that corresponds to the answer
    public Category ask(Scanner sc) {
        System.out.println(this.label);
        // prints out all the answer choices
        for (int i = 0; i < this.possibleAnswers.length; i++) {
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:"
                    + this.possibleAnswers[i].label);
        }
        //runs input function for user inputs
        input();
        return this.possibleAnswers[userAnswer - 1].cat;
    }

    public void input() {
        ans = sc.nextLine(); //uses scanner for user input
        for (int i = 0; i < ans.length(); i++) {
            // Check if the character is not a digit
            if ((Character.isDigit(ans.charAt(i))) == false) {
                //if character is not a digit, reruns input() function
                System.out.println("Input invalid. Please try again.");
                input();
            }
        }
        userAnswer = Integer.valueOf(ans);
        //saves String ans as an integer value in variable userAnswer
        if (userAnswer < 1 || userAnswer > 6) {
            System.out.println("Input out of answer range. Please try again.");
            input();
        }
        //makes sure character is in answer range – if not, reruns input() function
    }
}
