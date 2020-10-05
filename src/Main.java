public class Main {
    public static void main(String[] args) {
        double percent = 1;
        int regularExpenses = 290000;
        double cashbackRegularExpenses = percent * regularExpenses/100;
        double limit = 3000;
        if (cashbackRegularExpenses>limit){cashbackRegularExpenses=limit;}

        double percentElevatedCasbak = 5;
        int buys = 15000;
        double cashbackBuys = percentElevatedCasbak * buys/100;
        if (cashbackBuys>limit){cashbackBuys=limit;}

        double specialPercent = 3;
        int SpecialBuys = 5000;
        double specialCashback = specialPercent * SpecialBuys/100;
        if (specialCashback>limit){specialPercent=limit;}
        double total = cashbackRegularExpenses + cashbackRegularExpenses + specialCashback;

        System.out.println(total);
    }
    }
