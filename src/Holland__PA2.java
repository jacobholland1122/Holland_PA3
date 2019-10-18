import java.text.DecimalFormat;

public class Holland__PA2 {
    private static double annualInterestRate;
    private double savingsBalance;

    public Holland__PA2 (double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12.00;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = (newInterestRate >= 0 && newInterestRate <= 1.00) ? newInterestRate : 0.04;
    }

    private double displaySavings() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Holland__PA2 saver1 = new Holland__PA2 (2000.00);
        Holland__PA2 saver2 = new Holland__PA2 (3000.00);
        Holland__PA2.modifyInterestRate(0.04);

        System.out.println("0.04 balance for one year per month");
        System.out.println();
        System.out.println("Balances: ");
        System.out.print("                     saver1");
        System.out.println("                saver2");
        System.out.println();
        System.out.println("Month:");

        System.out.print("                   " + saver1.displaySavings());
        System.out.print("                  " + saver2.displaySavings());
        System.out.println();

        for(int month = 1; month <= 12; month++) {
            String monthName = String.format("Month %d: ", month);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("" + monthName);
            System.out.print("          " + df.format(saver1.displaySavings()));
            System.out.print("                 " + df.format(saver2.displaySavings()));
            System.out.println();
        }

        Holland__PA2.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println();
        System.out.println("Interest Rate of 0.05");
        System.out.println("Balances: ");

        System.out.print("  saver1");
        System.out.println("           saver2");
        System.out.print("  " + df.format(saver1.displaySavings()));
        System.out.println("          " + df.format(saver2.displaySavings()));

    }
}

