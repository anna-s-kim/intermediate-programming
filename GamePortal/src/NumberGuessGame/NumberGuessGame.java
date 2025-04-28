package NumberGuessGame;
// Copyright 2024 Anna Kim

import Game.GameWriteable; // arraylist generator
import java.io.File; //random generator
import java.util.ArrayList; // scanner generator
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame implements GameWriteable {
  
  int count = 0; // creates a variable to count the number of guesses 
  
  @Override
  public String getGameName() {
    return "NumberGuessGame";
  }

  @Override
  public void play() {
    int best = -1; 
    int current;
    int numberofgames = 3;

    System.out.println("This is a number guessing game. You will play "  + Integer.toString(numberofgames) + " rounds!");
    
    for (int i = 0; i < numberofgames; i += 1) { 
      //has the player play 3 rounds (can change the value of numberofgames variable to have the player play more or less rounds)
      System.out.println("This is round " + Integer.toString(i+1)); 
      current = RunGame(); // makes amount of return/guesses in RunGame the current score
        if (current > 1) {
          System.out.println("You took " + Integer.toString(current) + " guesses.");
        }
        else {
          System.out.println("You took " + Integer.toString(current) + " guess.");
        } 
      if (current < best || best == -1) {
        best = current; // makes the current score the best score if it is less than (better than) the previous score(s)
      }
    }
    
    System.out.print("Your final score is " + best + "!"); // lets the player know their best score across all rounds at the end
  }

  @Override
  public String getScore() {
    return "Integer.toString(count)";
  }
  
  @Override
  public void writeHighScore(File f) {
  }

  @Override
  public boolean isHighScore(String score, String currentHighScore) {
    return false;
  }
  

  public int RunGame (){
    
    Scanner input = new Scanner(System.in); // using scanner 

    ArrayList<Integer> guessednums = new ArrayList<> ();
          
    System.out.println("Enter the minimum value for your range.");
   
    int minimumnumber, maximumnumber; // creating minimumnumber variable and maximumnumber variable which is used to store range

    while (true) { 
      if (input.hasNextInt()) {
        minimumnumber = input.nextInt(); 
        break;
      }
      else {
        System.out.println("Please enter an integer"); 
        // if what the player types as the minimum number that is not an integer, it asks the player to enter an integer
      }
      input.nextLine();
    }
    
    System.out.println("Enter a the maximum value for your range.");

    while (true) { 
      input.nextLine();
      if (input.hasNextInt()) {
        maximumnumber = input.nextInt(); 
        if (maximumnumber > minimumnumber) {
          break;
        } 
        else {
          System.out.println("Please type in an integer greater than " + Integer.toString(minimumnumber));
          // if the maximum number is smaller than the minimum number, it asks the player to enter an number larger than the minimum number
        }
      }
      else {
        System.out.println("Please enter an integer");
        // if what the player types as the maximum number that is not an integer, it asks the player to enter an integer
      }
    }

    System.out.println("Your range is " + Integer.toString(minimumnumber) + " to " + Integer.toString(maximumnumber)+ "."); // states range to player
    
    Random random = new Random();
    int target = random.nextInt(minimumnumber, maximumnumber); // chooses a random number within range
    
    int number = target + 1; // creates a variable for the number guessed 

    while (number != target) {
      while (true) { 
        input.nextLine();
        if (input.hasNextInt()) {
          number = input.nextInt();  // guessed number has to be an integer
          if (number <= maximumnumber && number >= minimumnumber) { 
            // guessed number has to be within range
            break;
          }
          else {
            System.out.println("Please enter an integer within range"); 
            // lets the player know if the number guessed is not within range
          }
        }
        else {
          System.out.println("Please enter an integer");
          // lets the plyaer know if the number guessed is not an integer
        }
      }
      if (number == target) {
        System.out.println("You guessed the right number!");
        // when the number guessed is the target number, it lets the player know they got it right 
        count = count + 1; // adds 1 to count value each time a number is guessed
        guessednums.add(number);
      }
      else if (guessednums.contains(number)) {  
        // when a number that has been guessed is guessed again, the code asks for the person to guess a different number
        System.out.println("Please guess a number that you have not guessed.");
      } 
      else if (number < target) { // when the number guessed is less than the target number, it tells the player to guess a higher number
        System.out.println("The number is higher!");
        count = count + 1; // adds 1 to count value each time a number is guessed
        guessednums.add(number);
      }
      else if (number > target) { 
        // when the number guessed is greater than the target number, it tells the player to guess a lower number
        System.out.println("The number is lower!");
        count = count + 1; // adds 1 to count value each time a number is guessed
        guessednums.add(number);
      }
    }
    return count; // returns the count value
  }
}