import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int MONTH_IN_YEAR = 12;
        Scanner in = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = in.nextDouble();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = in.nextFloat() / 100;
        System.out.print("Period (Years): ");
        byte years = in.nextByte();
        float monthlyInterestRate = annualInterestRate / MONTH_IN_YEAR;
        int months = years * 12;
        double mortgage = principle *
                monthlyInterestRate  * Math.pow((1 + monthlyInterestRate), months) /
                ( Math.pow((1 + monthlyInterestRate), months) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}