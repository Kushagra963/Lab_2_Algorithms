import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1: Achieving Daily Targets for Transactions
        System.out.print("Enter the size of transaction array: ");
        int transactions = scanner.nextInt();

        int[] transactionArray = new int[transactions];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < transactions; i++) {
            transactionArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the total no of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        int[] targets = new int[numTargets];
        System.out.println("Enter the values of target: ");
        for (int i = 0; i < numTargets; i++) {
            targets[i] = scanner.nextInt();
        }

        // Achieve targets and display results
        TransactionAchiever.achieveTargets(transactionArray, targets);

        // Problem 2: Minimum Number of Notes for Payment
        System.out.print("Enter the size of currency denominations: ");
        int n = scanner.nextInt();

        int[] currencyDenominations = new int[n];
        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < n; i++) {
            currencyDenominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        // Calculate minimum notes for payment and display results
        PaymentCalculator.calculateMinimumNotes(currencyDenominations, amount);
    }
}
