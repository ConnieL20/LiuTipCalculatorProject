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

        //variables//
        double totalBill = 0;
        double updatePrice = 0;

        while (updatePrice >=0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (Type -1 to end): ");
            totalBill += updatePrice;
            updatePrice = scan.nextDouble();
            }

        //receipt code//
        System.out.println("-------------------------");
        System.out.println("Total bill before tip: " + totalBill);

        scan.close();


        }
    }

