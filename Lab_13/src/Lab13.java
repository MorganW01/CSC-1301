import java.util.Random;
import java.util.Scanner;
public class Lab13 {
    /*
    * Q1: lab13.java (use a do while loop)
       *Write a program that generates a random number and asks the user to guess what the number is.
       *If the user's guess is higher than the random number, the program should display "Too high, try again."
       *If the user's guess is lower than the random number, the program should display "Too low, try again."
       *The program should use a loop that repeats until the user correctly guesses the random number. */

    public static void main (String []args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomInt = rand.nextInt(100-1)+1;
        System.out.println(randomInt);
        boolean done = false;

        do {
            System.out.println("Guess a random number between 1 and 100.");
            int guess = scanner.nextInt();

            if (guess>randomInt){
                System.out.println("Too high, try again!");
            }
            else if (guess<randomInt){
                System.out.println("Too low, try again!");
            }
            else if(guess==randomInt){
                done=true;
            }
        }
        while(!done);
        System.out.println("You correctly guessed the number!");

    }


}
