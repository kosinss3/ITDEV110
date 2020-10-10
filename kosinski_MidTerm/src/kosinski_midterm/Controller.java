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
    
    //  Instantiate objects
    View view = new View();
    Model model = new Model();
    
    public void run(){

        //  Display intro and instructions to console
        view.intro();
        view.instructions();
        do {            
            //  Get user input to determine how many scores will be entered
            model.setScores(view.arraySize());
            
            //  Get user input to determine if extra credit should be displayed
            model.setExCred(view.displayExtraCredit());

            do {

                //  Ask user to enter a score while the score entered is not between -2 and 100
                do {
                    model.setNewEntry(view.userEntry(model.getCounter()));
                    //  If user entry is not between -2 and 100 this will display an invalid entry message
                    if (model.getNewEntry() < -2 || model.getNewEntry() > 100) {
                        view.invalidEntry();
                    }
                } while (model.getNewEntry() < -2 || model.getNewEntry() > 100);

                //  Checks for quit condition
                if (model.getNewEntry() == -1) {
                    //view.shutdown();
                    view.userQuit();
                    model.setRun(false);
                }
                if (model.getNewEntry() == -2) {
                    if (model.getExCred() == 1) {
                        model.setExCred(0);
                        view.toggleEC();
                    }
                    else if (model.getExCred() == 0) {
                        model.setExCred(1);
                        view.toggleEC();
                    }
                }
                if (model.getNewEntry() >= 0) {
                    //  DEBUGGING
                    //System.out.println(model.getScoresLength());

                    //  Passes through user input to calculate and display results
                    model.setScores(model.getCounter(), model.getNewEntry());
                    model.setCounter();
                    model.setScoreSum(model.getNewEntry());
                    model.setScoreAvg();
                    
                    // Display last user entry
                    if (model.getExCred() == 0) {
                        view.displayEntry(model.getNewEntry());
                    }
                    
                    //  Display extra credit: all user entries
                    if (model.getExCred() == 1){
                        view.extraCredit(model.getCounter(), model.getScores().length, model.getSingle(), model.getScoreSum());
                    }
                    
                    //  Display running totals totals
                    view.displayResults(model.getCounter(), model.getScoreAvg(), model.getScores().length);


                }
                //  DEBUGGING
//                System.out.println(model.getRun());
//                System.out.println(model.getCounter());
//                System.out.println(model.getScoresLength());
            } while (model.getRun() == true && model.getCounter() < model.getScoresLength());
            
            //  Dispaly the final results to the console
            view.dispalyFinal(model.getCounter(), model.getScoreAvg());
            
            model.defaultValues();
            model.setRepeat(view.repeat());
        } while (model.getRepeat() != 0);
        view.shutdown();
    }
}
