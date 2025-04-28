package JavaInterview;
import Game.GameWriteable;
import java.io.File;
import java.util.Scanner;

 public class JavaInterview implements GameWriteable {

    @Override
    public String getGameName() {
        return "JavaInterview";
    }

    @Override
    public void play() {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Hi! What is your name?");
        String name = input.nextLine();

        System.out.print("Hi " + name + "! What is your favorite ice cream?");
        String icecream = input.nextLine();
        System.out.print("I love " + icecream + " too!");


        System.out.print("What is your age?");
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult, you can eat a lot of ice cream");
        }
        else {
            System.out.println("You are a kid, you can eat only one ice cream");
        }
    }

    @Override
    public String getScore() {
        return "NA";
    }
    
    @Override
    public void writeHighScore(File f) {
    }

    @Override
    public boolean isHighScore(String score, String currentHighScore) {
        return false;
    }
}
