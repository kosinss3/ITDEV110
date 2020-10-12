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
    
    public int guess(int minValue, int maxValue) {
        System.out.println("");
        System.out.print("Guess a number "+minValue+"-"+maxValue+": ");
        return input.nextInt();
    }
    
    public void tooHigh() {
        System.out.println("");
        System.out.println("\t\tToo high.");
    }
    
    public void tooLow() {
        System.out.println("");
        System.out.println("\t\tToo low.");

    }
    
    public void correct(int counter) {
        System.out.println("");
        System.out.println("\t\tCorrect!");
        if (counter == 1) {
            System.out.println("\t\tBoss status. "+ counter +" guess.");
        } else {
            System.out.println("\t\tIt only took "+ counter +" guesses!");
        }
    }
    
    public int repeat() {
        System.out.println("");
        System.out.print("Enter (1)Try again or (0)Quit: ");
        return input.nextInt();
    }
            
    public void displayNumber(int number) {
        System.out.println(number);
    }
    
    public void debug(int num, int guess, int maxVal, int minVal, int range, int counter) {
        //  DEBUGGING
        System.out.println("");
        System.out.print("!DEBUG! the number: ");
        displayNumber(num);
        System.out.print("!DEBUG! the guess: ");
        displayNumber(guess);
        System.out.print("!DEBUG! max val: ");
        displayNumber(maxVal);
        System.out.print("!DEBUG! min val: ");
        displayNumber(minVal);
        System.out.print("!DEBUG! range: ");
        displayNumber(range);
        System.out.print("!DEBUG! counter: ");
        displayNumber(counter);
    }
}
