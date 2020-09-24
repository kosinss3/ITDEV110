
package kosinski_vtipper;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.text.DecimalFormat;

/*
 * @author Scott Kosinski <https://github.com/kosinss3>
 */

public class BillCalculator {
    
    //Delcaring variables
    Scanner input = new Scanner(System.in);
    String restaurantName;
    double billSubTotal;
    int tipPercent;
    double tipAmount;
    double billTotal;
    double splitAmount;
    int numSplit;
    boolean runAgain = true;
    int repeatCode;

    BillCalculator(){
        intro();
        while (runAgain) { 
            getUserInput();
            tipCalc();
            totalBill();
            calcAgain();
        }
    }
    
    //  truncates decimal numbers to 2 decimal places
    private static DecimalFormat dollarFormat = new DecimalFormat("#.00");
    
    private void intro(){
        /*
         *  This method will execute first. It will welcome the user
         *  and then describes the program.
         */
        System.out.println("Hello there!\n\nThis program is meant to calculate"
                + " tips.\n\nStep #\n\t1\tEnter restaurant name and press return."
                + "\n\n\t2\tEnter bill sub total and press return.\n\n\t3\tEnter "
                + "desired tip percentage and press return.\n\n\t4\tEnter number"
                + " of ways to split the total bill and press return.\n");
    }
    
    private void getUserInput(){
        /*
         *  This method executes after the intro. It asks the user
         *  for the input described in the intro.
         */
        System.out.println("Enter the name of the restaurant: ");
        restaurantName = input.nextLine();
        System.out.println("Enter the bill sub total: ");
        billSubTotal = input.nextDouble();
        System.out.println("Enter tip percentage: ");
        tipPercent = input.nextInt();
        System.out.println("How many people are splitting the bill?: ");
        numSplit = input.nextInt();
    }
    
    private void tipCalc(){
        /*
         *  This method will take the user input from the getUserInput method
         *  and the calculate the tip amount based on that input.
         */
        
        if (billSubTotal < 0){
            billSubTotal*=-1;
        }
        
        if (tipPercent < 0){
            tipPercent*=-1;
        }
        
        if (numSplit == 0){
            numSplit+=1;
        }
        else if (numSplit < 0){
            numSplit*=-1;
        }
        tipAmount = billSubTotal*tipPercent/100;
        billTotal = billSubTotal+tipAmount;
        splitAmount = billTotal/numSplit;
    }
    
    private void totalBill(){
        /*
         *  This method takes user input, the current time and date, and the 
         *  result of the tipCalc method and prints the information to the
         *  console in a readable format.
         */
        System.out.println("\nRestaurant Name: "+restaurantName+"\n\nTime & Date: "
                +java.time.LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))
                +" "
                +java.time.LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))
                +"\n\nBill sub total: $"+dollarFormat.format(billSubTotal)+"\n"
                + "Tip amount: $"+dollarFormat.format(tipAmount)+"\nTip %: "+tipPercent+"\nBill total: $"
                +dollarFormat.format(billTotal)+"\n\nSplit # of ways: "+numSplit
                +"\nSplit check total: $"+dollarFormat.format(splitAmount)+"\n");
    }
    
    private void calcAgain(){
        /*
         *  This method asks the user if they would like to perform another
         *  calculation.
         */
        boolean bool = true;
        while (bool){
            System.out.println("Calculate again? (1)yes or (2)no: ");
            repeatCode = input.nextInt();
            if (repeatCode == 1){
                runAgain = true;
                bool = false;
            }
            else if (repeatCode == 2){
                runAgain = false;
                bool = false;
            }
        }
        input.nextLine();
    }
}    
