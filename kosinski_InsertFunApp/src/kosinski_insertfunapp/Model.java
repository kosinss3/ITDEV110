/*  Scott Kosinski
 *  ITDEV-110-004
 *  Assignment #4
 */

package kosinski_insertfunapp;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Model {
    
    // Declare empty array to store user entered words
    private String[] userWords = new String[7];
    
    // Add a new word to the userWords array
    public void setWords(int i, String word){
        this.userWords[i] = word;
    }
    
    // Return the userWords array
    public String[] getWords(){
        return userWords;        
    }
}
