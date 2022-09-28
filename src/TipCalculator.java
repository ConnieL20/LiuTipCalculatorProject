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

        //total bill and tip percentage//
        System.out.println("------------------------------");
        System.out.println("Total bill before tip: " + totalBill);
        System.out.println("Tip percentage: " + tipPercent);

        //tip variable
        double totalTip = totalBill * (double)tipPercent / 100;
        String formattedTip = formatter.format(totalTip);
        System.out.println("Total Tip: " + formattedTip);

        //total bill with tip
        totalBill += totalTip;
        String formattedBill = formatter.format(totalBill);
        System.out.println("Total Bill with tip: " + formattedBill);

        //total bill before tip divided amongst totalPeople
        double costPer = (totalBill - totalTip) / totalPeople;
        String formattedCost = formatter.format(costPer);
        System.out.println("Per person cost before tip: " + formattedCost);

        //tip per person
        double tipPer = totalTip / totalPeople;
        String formattedTipPer = formatter.format(tipPer);
        System.out.println("Tip per person: " + formattedTipPer);

        //total cost per person
        double totalCostPer = totalBill / totalPeople;
        String formattedTotalPer = formatter.format(totalCostPer);
        System.out.println("Total cost per person: " + formattedTotalPer);

        scan.close();


        }
    }

