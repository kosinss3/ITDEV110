/*  Scott Kosinski
 *  ITDEV-110-004
 *  Assignment #4
 */ 
package kosinski_insertfunapp;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Controller {
        
    //Create new admin, view, and model objects
    Admin admin = new Admin();
    View view = new View();
    Model model = new Model();
    
    public void run() {
        
        // Display intro message to console
        admin.intro();
        
        // Get input from user and set words to userWords array
        for (int i = 0; i < (view.blanks.length-1); i++) {
            model.setWords(i, view.getUserWord(i));
        }
        
        // DEBUGGING
        //  System.out.println("\nSet user words complete.");
        //  System.out.println(model.getWords()+"\n");
        
        
        // Display results to console
        view.displayResult(model.getWords());
        
        // Display shutdown message to console
        admin.shutdown();        
    }
}
