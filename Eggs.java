import java.util.Scanner;

/*
Module 3 In-Class Activity: METHODS PRACTICE
Program: Eggs.java (Starter with TODOs)

Scenario:
Meadowdale Dairy Farm sells organic brown eggs.
- $3.25 per dozen
- $0.45 per loose egg (not part of a dozen)

Goal:
Prompt the user for the number of eggs and print a full explanation, e.g.:
You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at $0.45 each for a total of $7.85.

Instructions:
Complete the TODOs. Keep your methods small and focused.
*/

public class Eggs {

    // TODO 1: Create constants for prices:
    // - PRICE_PER_DOZEN (double) = 3.25
    // - PRICE_PER_LOOSE_EGG (double) = 0.45

    private static final double PRICE_PER_DOZEN = 3.25;
    private static final double PRICE_PER_LOOSE_EGG = 0.45;

    // TODO 2: Create a method named calculateDozens(int eggs)
    // It should return how many full dozens are in the order.

    public static int calculateDozens(int eggs) {
        return eggs / 12;
    }
    // TODO 3: Create a method named calculateLooseEggs(int eggs)
    // It should return how many eggs are NOT part of a full dozen.

    public static int calculateLooseEggs(int eggs) {
        return eggs % 12;
    }

    // TODO 4: Create a method named calculateTotalCost(int dozens, int looseEggs)
    // It should return the total cost as a double.

    public static double calculateTotalCost(int dozens, int looseEggs){
        return (dozens * PRICE_PER_DOZEN) + (looseEggs * PRICE_PER_LOOSE_EGG);
    }

    // TODO 5: Create a method named buildExplanation(int eggs, int dozens, int looseEggs, double total)
    // It should return the full explanation string to print.

    public static String buildExplanation(int eggs, int dozens, int looseEggs, double totalCost) {
        return "You ordered " + eggs + " eggs. That's " + dozens + " dozen at $"
                + String.format("%.2f", PRICE_PER_DOZEN) + " per dozen and " + looseEggs + " loose eggs at $" +
                String.format("%.2f", PRICE_PER_LOOSE_EGG) + " each for a total of $" + totalCost + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of eggs in the order: ");
        // TODO 6: Read the number of eggs (int). Validate: eggs >= 0.
        // If eggs < 0, print an error and exit.

        int eggs = input.nextInt();

        if (eggs < 0) {
            System.out.print("Error: Number of eggs cannot be negative.");
            input.close();
            return;
        }


        // TODO 7: Use your methods to compute:
        // dozens, looseEggs, totalCost, explanation

        int dozens = calculateDozens(eggs);
        int looseEggs = calculateLooseEggs(eggs);
        double totalCost = calculateTotalCost(dozens, looseEggs);


        // TODO 8: Print the explanation

        System.out.println(buildExplanation(eggs, dozens, looseEggs, totalCost));

        input.close();
    }
}
