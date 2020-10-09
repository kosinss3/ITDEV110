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
    
    private int counter = 0;
    private double newEntry;
    private double scoreSum;
    private double scoreAvg;
    private double[] scores;

    public double[] getScores() {
        return scores;
    }

    public void setScores(int size) {
        this.scores = new double[size];
    }
    
    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter++;
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
        this.scoreSum = scoreSum + newEntry;
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
}
