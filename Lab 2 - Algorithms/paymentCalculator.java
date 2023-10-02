import java.util.Arrays;

public class PaymentCalculator {

    public static void calculateMinimumNotes(int[] currencyDenominations, int amount) {
        Arrays.sort(currencyDenominations);

        int n = currencyDenominations.length;
        int[] notesCount = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            notesCount[i] = amount / currencyDenominations[i];
            amount %= currencyDenominations[i];
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (int i = n - 1; i >= 0; i--) {
            if (notesCount[i] > 0) {
                System.out.println(currencyDenominations[i] + ":" + notesCount[i]);
            }
        }
    }
}
