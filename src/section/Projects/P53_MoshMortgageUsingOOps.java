package section.Projects;

import java.text.NumberFormat;
import java.util.Scanner;
class Console{
    private static Scanner scan = new Scanner(System.in);
    public static double readNumber(String prompt){
        return scan.nextDouble();
    }
    public static double readNumber(String prompt,double min,double max){
        double value;
        while (true) {
            System.out.print(prompt+": ");
            value = scan.nextDouble();
            if (min<=value && value<=max)
                break;
            System.out.println("Enter a number between "+min+" and "+max);
        }
        return value;
    }

}
public class P53_MoshMortgageUsingOOps {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static double calculateMortgage(int principal,float annualInterest,byte years){
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        float months = years*MONTHS_IN_YEAR;
        return principal * monthlyInterest * (Math.pow(1 +monthlyInterest , months) / (Math.pow(1 + monthlyInterest, months) - 1));
    }
    public static double calculateBalance(int principal,float annualInterest,byte years,short numberOfPayments){

        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        float months = years*MONTHS_IN_YEAR;
        return principal* (Math.pow(1+monthlyInterest,numberOfPayments) - Math.pow(1+monthlyInterest,months))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);
    }
    public static void printMortgage(int principal,float annualInterest, byte years){
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment: "+mortgageFormatted);
    }
    public static void printPaymentSchedule(int principal,float annualInterest,byte years){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month =1; month<=years*MONTHS_IN_YEAR; month++){
            System.out.println(NumberFormat.getCurrencyInstance().format(calculateBalance(principal,annualInterest,years,month)));
        }
    }
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest",1,30);
        byte years = (byte) Console.readNumber("Years",1,30);
        printMortgage(principal,annualInterest,years);
        printPaymentSchedule(principal,annualInterest,years);}

}

