/*  Scott Kosinski
 *  ITDEV-110-004
 *  Mid-Term Exam
 */
package kosinski_midterm;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Model {
    
    //  Declare private variables to store score data
    private int counter = 0;
    private double newEntry;
    private double scoreSum;
    private double scoreAvg;
    private double[] scores;
    private int exCred;
    private int repeat;
    private boolean run = true;
    
    //  Getters and setters for private variables

    public int getExCred() {
        return exCred;
    }

    public void setExCred(int exCred) {
        this.exCred = exCred;
    }
    
    
    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter++;
    }
    
    public void setScores(int length) {
        scores = new double[length];
    }

    public double[] getScores() {
        return scores;
    }
    
    public double[] getSingle() {
        return scores;
    }

    public double getNewEntry() {
        return newEntry;
    }

    public void setNewEntry(double newEntry) {
        this.newEntry = newEntry;
    }

    public double getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(double newEntry) {
        this.scoreSum += newEntry;
    }

    public void setScores(int counter, double newEntry) {
        this.scores[counter] = newEntry;
    }

    public double getScores(int i) {
        return scores[i];
    }
    
    public int getScoresLength(){
        return scores.length;
    }

    public void setScoreAvg() {
        scoreAvg = getScoreSum()/getCounter();
    }

    public double getScoreAvg() {
        return scoreAvg;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    
    public boolean getRun() {
        return run;
    }
    
    public void defaultValues() {
        this.counter = 0;
        this.newEntry = 0;
        this.scoreSum = 0;
        this.scoreAvg = 0;
        this.scores = null;
        this.exCred = 0;
        this.run = true;
    }
}
