import java.util.Scanner;

// ISSUES: Rounding problems (will round down), math error in total bill calculation

public class Main {
    public static void main(String[] args) {
        // Starting statements

        // Open scanner
        Scanner s = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Tip Calculator");
        System.out.println();

        // Original bill
        System.out.print("Enter your billing amount: ");
        String amountB = s.nextLine();
        double bill = Double.parseDouble(amountB);

        // Original Tip
        System.out.print("Enter your tipping percentage: ");
        String amountT = s.nextLine();
        int tipPercent = Integer.parseInt(amountT);

        // Number of people
        System.out.print("Enter the amount of people: ");
        String amountP = s.nextLine();
        int numPpl = Integer.parseInt(amountP);

        // Math
        double tipMultiplier = (double) tipPercent / 100;       // Percent conversion
        double tipTotal = tipMultiplier * bill;                 // The total tip
        tipTotal = (int)(tipTotal*100)/100.0;
        double totalBill = (tipMultiplier + 1) * bill;                     // The total bill for everyone WITH tip
        totalBill = (int)(totalBill*100)/100.0;
        double tipPer = tipTotal / numPpl;                      // The tip per person
        tipPer = (int)(tipPer*100)/100.0;
        double totalPer = totalBill / numPpl;                   // The total bill and tax for each person
        totalPer = (int)(totalPer*100)/100.0;

        //Print statements
        System.out.println("");
        System.out.println("Your total tip amount is $" + tipTotal);
        System.out.println("Your total bill including tip is $" + totalBill);
        System.out.println("The tip per person is $" + tipPer);
        System.out.println("The total per person is $" + totalPer);
        System.out.println("_______________________");

        s.close();
    }
}