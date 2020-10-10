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
        System.out.println("\t\t\t\t\tScore Average Calculator\n");
    }
    
    public void instructions(){
        //  make this method callable during the program to get help
        System.out.println("\t\t**************************************************************************");
        System.out.println("\t\tThis program will calculate the average of the scores entered by the user,");
        System.out.println("\t\tand then display the average to the console.");
        System.out.println("");
        System.out.println("\t\tStep 1: Enter number of scores to be entered.");
        System.out.println("\t\tStep 1.5: Display extra credit?");
        System.out.println("\t\tStep 2: Enter a score and press return.");
        System.out.println("\t\tStep 3: When you've entered all scores, the final result will be displayed.");
        System.out.println("");
        System.out.println("\t\t\tEnter score of -1 to quit.");
        System.out.println("\t\t**************************************************************************\n");
    }
    
    //  Method used to determine how many scores the user will input
    public int arraySize(){
        int size;
        do {
            System.out.print("How many scores would you like to enter?: ");
            size = input.nextInt();
            System.out.println("");
        } while (size < 1);
        return size;
    }
    
    //  Gets a score from the user
    public double userEntry(int counter){
        System.out.print("Enter score #"+(counter+1)+": ");
        return input.nextDouble();
    }
    
    public void userQuit() {
        System.out.println("");
        System.out.println("You quit the program!");
        System.out.println("");
    }
    
    //  Displays invalid entry message to the console
    public void invalidEntry(){
        System.out.println("\n\tInvalid Score!");
        System.out.println("\tPlease enter a valid score between 0 and 100, or enter -1 to quit.\n");
    }
    
    //  Displays the last score entered by the user
    public void displayEntry(double getNewEntry){
        System.out.println("\n\tYou entered: "+ getNewEntry);
    }
    
    //  Displays a running average of scores entered by the user
    public void displayResults(int getCounter, double scoreAvg, int length){
        System.out.println("\tAverage of "+getCounter+" score(s): "+scoreAvg+"");
        System.out.println("\t"+getCounter+" of "+length+" scores entered.");
        System.out.println("");
    }
    
    //  Displays the final results
    public void dispalyFinal(int getCounter, double scoreAvg){
        System.out.println("\t\t**************************************************************************");
        System.out.println("\t\t\tYou entered "+getCounter+" scores.");
        System.out.println("\t\t\tThe final average is: "+scoreAvg);
        System.out.println("\t\t**************************************************************************\n");
    }
    
    //  Extra credit
    public void extraCredit(int counter, int arrayLength, double[] getSingle, double sum){
        System.out.print("\n\t*** Scores entered: ");
        for (int i = 0; i < counter; i++) {
            if (i > 0 && i < arrayLength){
                System.out.print("+ ");
            }
            System.out.print(getSingle[i]+" ");
        }
        System.out.print("= "+sum);
        System.out.println("");
    }
    
    //  Ask the user if they would like to start over
    public int repeat(){
        
        int s;
        do {
            System.out.print("Rerun program? (1)yes or (0)no: ");
            s = input.nextInt();
        } while (s < 0 || s > 1);
        System.out.println("");
        return s;
    }

    //  Ask the user if they would like to display extra credit
    public int displayExtraCredit(){
        
        int s;
        do {
            System.out.print("*** Display extra credit? (1)yes or (0)no: ");
            s = input.nextInt();
        } while (s < 0 || s > 1);
        System.out.println("");
        return s;
    }    
    
    //  Display shutdown message
    public void shutdown(){
        System.out.println("\n\nThank you and goodnight.\n");
    }
}
