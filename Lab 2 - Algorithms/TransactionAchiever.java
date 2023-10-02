public class TransactionAchiever {

    public static void achieveTargets(int[] transactionArray, int[] targets) {
        for (int target : targets) {
            int total = 0;
            int transactions = transactionArray.length;
            int i;
            for (i = 0; i < transactions; i++) {
                total += transactionArray[i];
                if (total >= target) {
                    System.out.println("Target " + target + " achieved after " + (i + 1) + " transactions");
                    break;
                }
            }
            if (i == transactions) {
                System.out.println("Target " + target + " is not achievable");
            }
        }
    }
}
