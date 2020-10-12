/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosinski_highlow;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Controller {
    Model model = new Model();
    View view = new View();
    
    public void go() {
        
        view.intro();

        do {
            //  Sets run condition
            model.setRun(1);
            
            //  Get min and max value from the user
            model.setMinValue(view.userMin());
            model.setMaxValue(view.userMax());
            
            //  Checks for debug condition
            //  Set min value, max value, and guess to the same number
            //  to toggle debugging mode.
            if (model.getMinValue() == model.getMaxValue()) {
                model.setDebug();
            }
            
            //  Calculates range based on user min and max
            model.setRange(model.getMinValue(), model.getMaxValue());
            
            //  Sets the number and displays numberChosen message
            model.setTheNumber(model.getRange(), model.getMinValue(), model.getMaxValue());
            view.numberChosen(model.getMinValue(), model.getMaxValue());
            
            do {
                //  Get a guess from the user
                model.setTheGuess(view.guess(model.getMinValue(), model.getMaxValue()));
                
                //  Check the guess
                switch (model.checkTheGuess(model.getTheNumber(), model.getTheGuess())) {
                    case 0:
                        model.setCounter();
                        view.tooLow(model.getTheGuess());
                        break;
                    case 1:
                        model.setCounter();
                        view.correct(model.getCounter(), model.getTheNumber());
                        model.setRun(0);
                        break;
                    case 2:
                        model.setCounter();
                        view.tooHigh(model.getTheGuess());
                        break;
                }
                
                if (model.isDebug() == true) {
                    //  Debugging
                    view.debug(model.getTheNumber(), model.getTheGuess(), model.getMaxValue(), model.getMinValue(), model.getRange(), model.getCounter());
                }
                
                //  Ask the user if they would like to guess again
                if (model.checkTheGuess(model.getTheNumber(), model.getTheGuess()) != 1) {
                    do {
                        model.setGuessAgain(view.guessAgain());
                    } while (model.getGuessAgain() < 0 || model.getGuessAgain() > 1);

                    if (model.getGuessAgain() == 0) {
                        view.giveUp(model.getCounter(), model.getTheNumber());
                        break;
                    }
                }
                
            } while (model.checkTheGuess(model.getTheNumber(), model.getTheGuess()) != 1);
            
            //  Ask the user if they want to repeat the program
            do {
                model.setRun(view.repeat());
            } while (model.getRun() < 0 || model.getRun() > 1);
            
            //  Resets the counter to 0
            model.resetCouter();
        } while (model.getRun() == 1);
    }
}
