package section.Projects;

import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;
class Mortgage {
    Scanner input = new Scanner(System.in);
    private double principal;
    private double periodInMonth;
    private double interestRate;
    public String mortgageCalculate() {
        double mortgage = principal * interestRate * (Math.pow(1 + interestRate, periodInMonth) / (Math.pow(1 + interestRate, periodInMonth) - 1));
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }
    public double setPrincipal() {
        while (true) {
            System.out.print("Principal(1k-1M): ");
            principal = input.nextDouble();
            if (principal >= 1000 && principal <= 1000000)
                break;
        }
        return principal;
    }
    public double setInterestRate() {
        while (true) {
            System.out.print("Annual Interest Rate: ");
            double annualInterestRate = input.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                interestRate = annualInterestRate/1200;
                break;
            }
        }
        return interestRate;
    }
    public double setPeriodInMonth() {
        while (true) {
            System.out.print("Period (Years): ");
            int period = input.nextInt();
            if (period >= 1 && period <= 30) {
                periodInMonth = period * 12;
                break;
            }
        }
        return periodInMonth;
    }
    private double getPrincipal() {
        return principal;
    }
    private double getPeriodInMonth() {
        return periodInMonth;
    }
    private double getInterestRate() {
        return  interestRate;
    }
}
public class P49_MortgageCalculator {
    public static void main(String[] args) {
        var mortgage = new Mortgage();
         mortgage.setPrincipal();
         mortgage.setInterestRate();
         mortgage.setPeriodInMonth();
        String result = mortgage.mortgageCalculate();
        System.out.println(result);
    }
}

