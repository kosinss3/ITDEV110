/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosinski_highlow;

import java.util.Random;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Model {
    Random random = new Random();
    
    private int run;
    private int minValue;
    private int maxValue;
    private int range;
    private int theNumber;
    private int theGuess;
    private int counter = 0;
    private boolean debug = false;
    
    public int getRun() {
        return run;
    }

    public void setRun(int n) {
        this.run = n;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int minValue, int maxValue) {
        this.range = maxValue+1 - minValue;
    }
    
    
    public int getTheNumber() {
        return theNumber;
    }

    public void setTheNumber(int range, int minValue, int maxValue) {
        if (minValue == maxValue) {
            this.theNumber = minValue;
        } else {
            this.theNumber = random.nextInt(range) + minValue;
        }
    }
    
    public int getTheGuess() {
        return theGuess;
    }

    public void setTheGuess(int theGuess) {
        this.theGuess = theGuess;
    }
    
    public int checkTheGuess(int theNumber, int theGuess){
        
        int x = 0;
        
        if (theNumber > theGuess) {
            x = 0;
        }
        if (theNumber < theGuess) {
            x = 2;
        }
        if (theNumber == theGuess) {
            x = 1;
        }
        
        return x;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        this.counter++;
    }
    
    public void resetCouter() {
        this.counter = 0;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug() {
        if (isDebug() == true) {
            debug = false;
        } else if (isDebug() == false) {
            debug = true;
        }
    }
}
    
