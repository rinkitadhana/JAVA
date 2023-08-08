package section.Projects;

import java.text.NumberFormat;
import java.util.Scanner;

public class P52_MoshMortgage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        double monthlyInterest;
        int months;


        while (true) {
            System.out.print("Principal: ");
            principal = scan.nextInt();
            if (1000<=principal && principal<=1000000)
                break;
            System.out.println("Enter a number between 1,000 to 1,000,000.");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            double annualInterest = scan.nextDouble();
            if (0<annualInterest && annualInterest<=30) {
                monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter a number greater than 0 and less than or equal to 30");
        }
        while (true){
            System.out.print("Period (Years): ");
            int years = scan.nextInt();
            if(0<years && years<=30){
                months = years*MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a number between 1 and 30");
        }

        double mortgage = principal * monthlyInterest * (Math.pow(1 +monthlyInterest , months) / (Math.pow(1 + monthlyInterest, months) - 1));
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);


    }
}