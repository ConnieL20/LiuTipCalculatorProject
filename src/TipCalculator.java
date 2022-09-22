import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("------------------------------");
        System.out.print("How many people are in your group? ");
        int totalPeople = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? (1-100) ");
        int tipPercent = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type -1 to end): ");
        double price = scan.nextDouble();

        double totalBill; //figure out how to print the totalBill outside of the while loop//
        double price2;


        while (price != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type -1 to end): ");
            price2 = scan.nextDouble();
            totalBill = price + price2;
            String formatBill = formatter.format(totalBill); //fix the format
            System.out.println(totalBill);
            }


        //receipt code
        System.out.println("-------------------------");
        System.out.println("Total bill before tip: " );


        }
    }

