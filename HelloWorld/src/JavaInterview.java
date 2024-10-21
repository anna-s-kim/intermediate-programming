import java.util.Scanner;

 public class JavaInterview {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Hi! What is your name?");
        String name = input.nextLine();

        System.out.print("Hi " + name + "! What is your favorite icecream?");
        String icecream = input.nextLine();
        System.out.print("I love " + icecream + " too!");


        System.out.print("What is your age?");
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println("You are an adult, you can eat a lot of icecream");
        }
        else {
            System.out.println("You are a kid, you can eat only one icereamm");
        }
    }
}
