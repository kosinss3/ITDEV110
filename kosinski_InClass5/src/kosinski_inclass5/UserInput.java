/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosinski_inclass5;
import java.util.Scanner;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class UserInput {
    //create new scanner
    Scanner in = new Scanner(System.in);
    //create default intro message
    private String intro = "\nWelcome! This program will calculate and display "
            + "the total and average score of 3 bowling games.";
    //creates game variables and intitializes them to an invalid value
    int game1 = -1, game2 = -1, game3 = -1;
    //object constructor
    UserInput(){
        intro();
        inputScores();
    }
    //prints the default intro
    private void intro(){
        System.out.println(intro);
    }
    //gets scores as input from the user
    private void inputScores(){
        do{
            System.out.println("\nEnter score 1: ");
            game1=in.nextInt();
        }
        while(game1<0||game1>300);
        
        do{
            System.out.println("\nEnter score 2: ");
            game2=in.nextInt();            
        }
        while(game2<0||game2>300);
         
        do{
            System.out.println("\nEnter score 3: ");
            game3=in.nextInt();            
        }
        while(game3<0||game3>300);
    }
}
