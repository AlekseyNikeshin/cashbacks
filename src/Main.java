public class Main {
    public static void main(String[] args) {
        int percent = 1;
        double regularExpenses = 290000;
        double cashbackRegularExpenses = percent * regularExpenses / 100;
        int limit = 3000;
        if (cashbackRegularExpenses > limit) {
            cashbackRegularExpenses = limit;
        }

        int percentElevatedCashback = 5;
        double buys = 15000;
        double cashbackBuys = percentElevatedCashback * buys / 100;
        if (cashbackBuys > limit) {
            cashbackBuys = limit;
        }

        int specialPercent = 3;
        double specialBuys = 5000;
        double specialCashback = specialPercent * specialBuys / 100;
        if (specialCashback > limit) {
            specialPercent = limit;
        }
        double total = cashbackRegularExpenses + cashbackRegularExpenses + specialCashback;
        if (total > limit) {
            total = limit;
        }
        System.out.println(total);
    }
}
