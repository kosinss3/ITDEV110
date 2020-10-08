/*  Scott Kosinski
 *  ITDEV-110-004
 *  Assignment #4
 */
package kosinski_insertfunapp;
import java.util.Scanner;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class View {
    
    // Declarations    
    final String textBody[] = {"\nMary had a little ", ". Its ", " was ", 
        " as ", ". Everywhere that Mary ", ". The ", " was sure to ", "."};
    final String blanks[] = {"animal", "body part", "color", "food", 
        "verb", "animal", "verb", "\n"};
        
    // Create new scanner object
    Scanner input = new Scanner(System.in);

    // Ask the user for a word and return that word
    public String getUserWord(int i){
        System.out.println("Enter a(n) "+ blanks[i]+": ");
        return input.nextLine();
    }
        
    // Method to display the final poem with user words
    public void displayResult(String userWords[]) {
        for (int i = 0; i < (textBody.length-1); i++){
            System.out.print(textBody[i]);
            System.out.print(userWords[i]);
        }
    }
}
