/*  Scott Kosinski
 *  ITDEV-110-004
 *  Mid-Term Exam
 */
package kosinski_midterm;

import java.util.Scanner;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class View {
    
    // view should contain all System.in and System.out statements
    Scanner input = new Scanner(System.in);
    
    public void intro(){
        System.out.println("\t\t\t\tScore Average Calculator\n");
    }
    
    public void instructions(){
        //  make this method callable during the program to get help
        System.out.println("\t\t**************************************************************************");
        System.out.println("\t\tThis program will calculate the average of the scores entered by the user,");
        System.out.println("\t\tand then display the average to the console.");
        System.out.println("");
        System.out.println("\t\tStep 1: Enter number of scores to be entered.");
        System.out.println("\t\tStep 2: Enter a score and hit return.");
        System.out.println("\t\tStep 3: When you've entered all scores, the final result will be displayed.");
        System.out.println("");
        System.out.println("\t\t\tEnter -1 at any time to quit.");
        System.out.println("\t\t**************************************************************************\n");
    }
    
    public int arraySize(){
        System.out.print("How many scores would you like to input?: ");
        return input.nextInt();
    }
    
    public double userEntry(){
        System.out.print("Enter a score: ");
        return input.nextDouble();
    }
    
    public void invalidEntry(){
        System.out.println("\n\tInvalid Score!");
        System.out.println("\tPlease enter a valid score between 0 and 100, or enter -1 to quit.\n");
    }
    
    public void displayEntry(double getNewEntry){
        System.out.println("\n\tYou entered: "+ getNewEntry);
    }
    
    public void displayResults(int getCounter, double scoreAvg){
        System.out.println("\tAverage of "+getCounter+" entered scores: "+scoreAvg+"\n");
    }
    
    public void dispalyFinal(int getCounter, double scoreAvg){
        System.out.println("\t\t**************************************************************************");
        System.out.println("\t\t\tYou entered "+getCounter+" scores.");
        System.out.println("\t\t\tThe final average is: "+scoreAvg);
        System.out.println("\t\t**************************************************************************\n");
    }
    
    public int repeat(){
        System.out.print("Enter -1 to quit, any other integer to start over: ");
        return input.nextInt();
    }
    
    public void shutdown(){
        System.out.println("Thank you and goodnight.");
    }
}
