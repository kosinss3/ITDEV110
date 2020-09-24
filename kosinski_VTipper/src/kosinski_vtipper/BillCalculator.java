
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
    
    BillCalculator(){
        introMessage();
        getUserInput();
        tipCalc();
        displayResults();
    }
    
    private static DecimalFormat dollarFormat = new DecimalFormat("#.00");
    
    private void introMessage(){
        /*
         *  This method will execute first. It will welcome the user
         *  and then describes the program.
         */
        System.out.println("Hello there!\n\nThis program is meant to calculate"
                + " tips.\n\nStep #\n\t1\tEnter restaurant name and press return."
                + "\n\n\t2\tEnter bill sub total and press return.\n\n\t3\tEnter "
                + "desired tip percentage and press return.\n");
    }
    
    private void getUserInput(){
        /*
         *  This method executes after the introMessage. It asks the user
         *  for the input described in the introMessage.
         */
        System.out.println("Enter the name of the restaurant: ");
        restaurantName = input.nextLine();
        System.out.println("Enter the bill sub total: ");
        billSubTotal = input.nextDouble();
        System.out.println("Enter tip percentage: ");
        tipPercent = input.nextInt();
        
    }
    
    private void tipCalc(){
        /*
         *  This method will take the user input from the getUserInput method
         *  and the calculate the tip amount based on that input.
         */
        tipAmount = billSubTotal*tipPercent/100;
        billTotal = billSubTotal+tipAmount;
        
    }
    
    private void displayResults(){
        /*
         *  This method takes user input, the current time and date, and the 
         *  result of the tipCalc method and prints the information to the
         *  console in a readable format.
         */
        System.out.println("\nRestaurant Name: "+restaurantName+"\nCurrent time: "
                +java.time.LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))
                +"\nCurrent date: "
                +java.time.LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))
                +"\nBill sub total: "+dollarFormat.format(billSubTotal)+"\n"
                + "Tip amount: "+dollarFormat.format(tipAmount)+"\nBill total: "
                +dollarFormat.format(billTotal));
    }
    
}
