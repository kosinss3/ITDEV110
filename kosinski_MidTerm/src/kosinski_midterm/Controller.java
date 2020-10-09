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
    
    View view = new View();
    Model model = new Model();
    
    public void run(){
        
        boolean run = true;
        
        view.intro();
        view.instructions();
        model.setScores(view.arraySize());
        
        do {
            do {
                model.setNewEntry(view.userEntry());
                if (model.getNewEntry() < -1 || model.getNewEntry() > 100) {
                    view.invalidEntry();
                }
            } while (model.getNewEntry() < -1 || model.getNewEntry() > 100);
            
            if (model.getNewEntry() == -1) {
                view.shutdown();
                run = false;
            } else {
                model.setScores(model.getCounter(), model.getNewEntry());
                model.setCounter();
                model.setScoreSum(model.getNewEntry());
                model.setScoreAvg();
                view.displayEntry(model.getNewEntry());
                view.displayResults(model.getCounter(), model.getScoreAvg());
            }            
        } while (run == true && model.getCounter() < model.getScoresLength());
        view.dispalyFinal(model.getCounter(), model.getScoreAvg());
    }
}
