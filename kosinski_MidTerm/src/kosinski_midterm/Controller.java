/*  Scott Kosinski
 *  ITDEV-110-004
 *  Mid-Term Exam
 */
package kosinski_midterm;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Controller {
    
    //  Instantiate view object
    View view = new View();
    
    public void run(){
    
        //  Boolean to determine quit condition
        boolean run = true;
        
        //  Ints to display extra credit and determine repeat condition
        int exCred;
        int repeat;
        
        //  Display intro and instructions to console
        view.intro();
        view.instructions();
        do {
            
            //  Instantiate model object
            Model model = new Model();
            
            //  Get user input to determine how many scores will be entered
            model.setScores(view.arraySize());
            
            //  Get user input to determine if extra credit should be displayed
            exCred = view.displayExtraCredit();

            do {

                //  Ask user to enter a score while the score entered is not between -1 and 100
                do {
                    model.setNewEntry(view.userEntry(model.getCounter()));
                    //  If user entry is not between -1 and 100 this will display an invalid entry message
                    if (model.getNewEntry() < -1 || model.getNewEntry() > 100) {
                        view.invalidEntry();
                    }
                } while (model.getNewEntry() < -1 || model.getNewEntry() > 100);

                //  Checks for quit condition
                if (model.getNewEntry() == -1) {
                    //view.shutdown();
                    view.userQuit();
                    run = false;
                } else {

                    //  Passes through user input to calculate and display results
                    model.setScores(model.getCounter(), model.getNewEntry());
                    model.setCounter();
                    model.setScoreSum(model.getNewEntry());
                    model.setScoreAvg();
                    
                    // Display last user entry
                    if (exCred == 0) {
                        view.displayEntry(model.getNewEntry());
                    }
                    
                    //  Display extra credit: all user entryies
                    if (exCred == 1){
                        view.extraCredit(model.getCounter(), model.getScores().length, model.getSingle(), model.getScoreSum());
                    }
                    view.displayResults(model.getCounter(), model.getScoreAvg(), model.getScores().length);


                }            
            } while (run == true && model.getCounter() < model.getScoresLength());

            //  Dispaly the final results to the console
            view.dispalyFinal(model.getCounter(), model.getScoreAvg());
            
            repeat = view.repeat();
        } while (repeat != 0);
        view.shutdown();
    }
}
