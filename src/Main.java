import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Tip Calculator");
        System.out.print("Enter your billing amount: ");
        String amountB = s.nextLine();
        double Bill = Double.parseDouble(amountB);
        System.out.println();
        System.out.print("Enter your tipping percentage: ");
        String amountT = s.nextLine();
        int tipPercent = Integer.parseInt(amountT);
        System.out.println("%");
        System.out.println();
        System.out.print("Enter the amount of people: ");
        String amountP = s.nextLine();
        int numPpl = Integer.parseInt(amountP);

    }
}