/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosinski_highlow;

import java.util.Scanner;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class View {
    
    Scanner input = new Scanner(System.in);
    
    public void intro() {
        System.out.println("");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t||     ~~~~~ GUESS THE NUMBER GAME ~~~~~      ||");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t||~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~||");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t||                INSTRUCTIONS                ||");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t||  The application will ask for a minimum    ||");
        System.out.println("\t\t||  and maximum number, and then a number in  ||");
        System.out.println("\t\t||  that range will be randomly chosen by the ||");
        System.out.println("\t\t||  computer. Try guessing the number until   ||");
        System.out.println("\t\t||  you get the answer right, or give up at   ||");
        System.out.println("\t\t||  any time. When you get the right answer   ||");
        System.out.println("\t\t||  or chose to give up, you will have the    ||");
        System.out.println("\t\t||  option to play again or quit.             ||");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t||  -GL;HF                                    ||");
        System.out.println("\t\t||                                            ||");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t");
    }
    
    public int userMin() {
        System.out.println("");
        System.out.print("Enter min value: ");
        return input.nextInt();
    }
    
    public int userMax() {
        System.out.println("");
        System.out.print("Enter max value: ");
        return input.nextInt();
    }
    
    public void numberChosen(int min, int max) {
        System.out.println("");
        System.out.println("\t\tA number between "+min+" and "+max+" has been chosen.");
    }
    
    public int guess(int minValue, int maxValue) {
        System.out.println("");
        System.out.print("Guess a number "+minValue+" - "+maxValue+": ");
        return input.nextInt();
    }
    
    public int guessAgain() {
        System.out.println("");
        System.out.print("Enter (1)Guess again or (0)Give up: ");
        return input.nextInt();
    }
    
    public void tooHigh(int theGuess) {
        System.out.println("");
        System.out.println("\t\t"+ theGuess +" is too high.");
    }
    
    public void tooLow(int theGuess) {
        System.out.println();
        System.out.println("\t\t"+ theGuess +" is too low.");

    }
    
    public void correct(int counter, int theGuess) {
        System.out.println("");
        System.out.println("\t\t"+ theGuess +" is correct!");
        if (counter == 1) {
            System.out.println("\t\tBoss status. "+ counter +" guess.");
        } else {
            System.out.println("\t\tIt only took "+ counter +" guesses!");
        }
    }
    
    public int repeat() {
        System.out.println("");
        System.out.print("Enter (1)Play again or (0)Quit: ");
        return input.nextInt();
    }
            
    public void displayNumber(int number) {
        System.out.println(number);
    }
    
    public void giveUp(int counter, int theNumber) {
        System.out.println("");
        System.out.print("\t\tYou gave up after "+ counter);
        if (counter == 1) {
            System.out.println(" guess.");
        } else if(counter > 1) {
            System.out.println(" guesses.");
        }
        System.out.println("\t\tThe number was "+ theNumber +".");
    }
    
    public void debug(int num, int guess, int minVal, int maxVal, int range, int counter) {
        //  DEBUGGING
        System.out.println("");
        System.out.print("!DEBUG! counter: ");
        displayNumber(counter);
        System.out.print("!DEBUG! the number: ");
        displayNumber(num);
        System.out.print("!DEBUG! the guess: ");
        displayNumber(guess);
        System.out.print("!DEBUG! min val: ");
        displayNumber(minVal);
        System.out.print("!DEBUG! max val: ");
        displayNumber(maxVal);
        System.out.print("!DEBUG! range: ");
        displayNumber(range);
    }
}
