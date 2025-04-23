
/*
 * Irene Feng Nov 2022
 * This is the class where we create the Quiz and run it. It has the main method.  
 */
// Anna Kim and Emanuella Odell Dec 2024
//We did everything together
import java.util.Scanner;
//import scanner
//import hashmap

public class Quiz {

    static Scanner sc = new Scanner(System.in); //creates new scanner

    public static void main(String[] args) throws Exception {
        // Create Categories and Descriptions
        Category aurora = new Category("Aurora",
                "You are gentle, elegant, nice, introverted, sophisticated, and smart. "
                + "You talk mainly with the people you are close to and trust. ");
        Category stitch = new Category("Stitch", "You have a lot of energy and are very fast."
                + "You are a great friend, but no one wants to get on your bad side.");
        Category mickeymouse = new Category("Mickey Mouse",
                "You are very optimistic and friendly with everyone you meet."
                + "You love meeting new people and stay positive when facing challenges.");
        Category abu = new Category("Abu",
                "You are a goofball and love to have fun."
                + "Sometimes your wild personality can get you into trouble, but at the end of the day, your silliness is the best part about you.");
        Category sofiathefirst = new Category("Sofia the First",
                "You are very compassionate and care a lot about others,"
                + "You are great with animals and make sure that everyone is included..");
        Category simba = new Category("Simba",
                "You are a bundle of joy and have a lot of confidence."
                + "You fight for what you believe in, but you can sometimes be naive.");

        // Create Questions
        Question q1 = new Question("What is your go to starbucks drink?");
        // Attach Answers to Questions and categories
        q1.possibleAnswers[0] = new Answer("Strawberry açaí lemonade", aurora);
        q1.possibleAnswers[1] = new Answer("Hot Chocolate", stitch);
        q1.possibleAnswers[2] = new Answer("Caramel Latte", mickeymouse);
        q1.possibleAnswers[3] = new Answer("Coffee", abu);
        q1.possibleAnswers[4] = new Answer("Chocoolate Frappuccino", sofiathefirst);
        q1.possibleAnswers[5] = new Answer("Pumpkin Spice Latte", simba);

        Question q2 = new Question("Your friend forces you to go on a ride/roller coaster. Which one do you choose to go on?");
        q2.possibleAnswers[0] = new Answer("It’s a Small World", aurora);
        q2.possibleAnswers[1] = new Answer("Cars Ride ", stitch);
        q2.possibleAnswers[2] = new Answer("Space Mountain", mickeymouse);
        q2.possibleAnswers[3] = new Answer("Pirates of the Caribbean", abu);
        q2.possibleAnswers[4] = new Answer("Dumbo", sofiathefirst);
        q2.possibleAnswers[5] = new Answer("Splash Mountain", simba);

        Question q3 = new Question("You have been watching TV all day and it is time to do something else. What do you choose to do?");
        q3.possibleAnswers[0] = new Answer("Bake a treat", aurora);
        q3.possibleAnswers[1] = new Answer("Play a sport", stitch);
        q3.possibleAnswers[2] = new Answer("Read a book", mickeymouse);
        q3.possibleAnswers[3] = new Answer("Go for a walk", abu);
        q3.possibleAnswers[4] = new Answer("Play an instrument", sofiathefirst);
        q3.possibleAnswers[5] = new Answer("Go for a swim", simba);

        Question q4 = new Question("Your product has become instagram/tik tok famous overnight. Which company do you want to sell your product to?");
        q4.possibleAnswers[0] = new Answer("Amazon", aurora);
        q4.possibleAnswers[1] = new Answer("Walmart", stitch);
        q4.possibleAnswers[2] = new Answer("Target", mickeymouse);
        q4.possibleAnswers[3] = new Answer("Home Goods", abu);
        q4.possibleAnswers[4] = new Answer("Sephora", sofiathefirst);
        q4.possibleAnswers[5] = new Answer("Make my own website", simba);

        Question q5 = new Question("A chain is opening up next to your house. What would you choose the new store to be?");
        q5.possibleAnswers[0] = new Answer("Playa Bowls", aurora);
        q5.possibleAnswers[1] = new Answer("Chipotle", stitch);
        q5.possibleAnswers[2] = new Answer("Gong Cha", mickeymouse);
        q5.possibleAnswers[3] = new Answer("Trader Joe's", abu);
        q5.possibleAnswers[4] = new Answer("Panera", sofiathefirst);
        q5.possibleAnswers[5] = new Answer("CVS", simba);

        Question q6 = new Question("Where would you most like to live?");
        q6.possibleAnswers[0] = new Answer("The Moors", aurora);
        q6.possibleAnswers[1] = new Answer("Hawaii", stitch);
        q6.possibleAnswers[2] = new Answer("The Clubhouse", mickeymouse);
        q6.possibleAnswers[3] = new Answer("Agrabah", abu);
        q6.possibleAnswers[4] = new Answer("Enchancia", sofiathefirst);
        q6.possibleAnswers[5] = new Answer("The Pride Lands", simba);

        Question q7 = new Question("Which book is your favorite?");
        q7.possibleAnswers[0] = new Answer("Land of Stories ", aurora);
        q7.possibleAnswers[1] = new Answer("Divergent", stitch);
        q7.possibleAnswers[2] = new Answer("Harry Potter", mickeymouse);
        q7.possibleAnswers[3] = new Answer("The Odyssey", abu);
        q7.possibleAnswers[4] = new Answer("Pride and Prejudice", sofiathefirst);
        q7.possibleAnswers[5] = new Answer("Hunger Games", simba);

        Question q8 = new Question("What animal are you?");
        q8.possibleAnswers[0] = new Answer("Peacock", aurora);
        q8.possibleAnswers[1] = new Answer("Bear", stitch);
        q8.possibleAnswers[2] = new Answer("Mouse", mickeymouse);
        q8.possibleAnswers[3] = new Answer("Monkey", abu);
        q8.possibleAnswers[4] = new Answer("Rabbit", sofiathefirst);
        q8.possibleAnswers[5] = new Answer("Lion", simba);

        Question q9 = new Question("What sport is your favorite?");
        q9.possibleAnswers[0] = new Answer("Mini Golf", aurora);
        q9.possibleAnswers[1] = new Answer("F1", stitch);
        q9.possibleAnswers[2] = new Answer("Track", mickeymouse);
        q9.possibleAnswers[3] = new Answer("Gymnastics", abu);
        q9.possibleAnswers[4] = new Answer("Sailing", sofiathefirst);
        q9.possibleAnswers[5] = new Answer("Wrestling", simba);

        Question q10 = new Question("What color do you like best?");
        q10.possibleAnswers[0] = new Answer("Pink", aurora);
        q10.possibleAnswers[1] = new Answer("Blue", stitch);
        q10.possibleAnswers[2] = new Answer("Red", mickeymouse);
        q10.possibleAnswers[3] = new Answer("Sand", abu);
        q10.possibleAnswers[4] = new Answer("Purple", sofiathefirst);
        q10.possibleAnswers[5] = new Answer("Orange", simba);

        // ... more questions here
        // For each question, ask, read input, store answer.
        gameIntro();
        Question[] qList = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};
        for (Question q : qList) {
            Category c = q.ask(sc);
            c.points++;
        }
        // Get most common category from the questions asked
        // Return Category
        Category[] cList = {aurora, stitch, mickeymouse, abu, sofiathefirst, simba};
        int index = getMostPopularCatIndex(cList);
        System.out.println("If you were a Disney character, you would be " + cList[index].label + ". ");
        System.out.println(cList[index].description);
        FileSave results = new FileSave(); //initializes file
        results.updateResult(cList[index].label);

        FileSave fsave = new FileSave("BuzzFeedQuizResults.csv");
        if (fsave.results.containsKey(cList[index].label)) {
            fsave.results.put(cList[index].label, Integer.toString(Integer.parseInt(fsave.results.get(cList[index].label)) + 1));
        } else {
            fsave.results.put(cList[index].label, "1");
        }
        fsave.writeResults();
        for (String key : fsave.getResults().keySet()) {
            System.out.println(key + " was chosen " + Integer.valueOf(fsave.results.get(key)) + " time(s)");
        }
    }

    public static void gameIntro() {
        String play;
        int playnum;
        // requires 1 to keep going
        System.out.println("Which Disney Character Are You?");
        System.out.println("You get to choose numbers 1-6 for every question. Enter '1' to play!");
        play = sc.nextLine();
        for (int i = 0; i < play.length(); i++) {
            // Check if the character is not a digit
            if ((Character.isDigit(play.charAt(i))) == false) {
                //if character is not a digit, reruns input() function
                System.out.println("Unidentifiable input. Please enter '1' to play");
                gameIntro();
                return;
            }
        }
        playnum = Integer.valueOf(play);
        //saves String ans as an integer value in variable userAnswer
        if (playnum < 1 || playnum > 1) {
            System.out.println("Unidentifiable input. Please enter '1' to play");
            gameIntro();
        }
    }

    // returns the index that is the max
    // the tie breaker is the first Category that has the count is the "max" :/ 
    public static int getMostPopularCatIndex(Category[] counts) {
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].points > maxCount) {
                maxCount = counts[i].points;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
