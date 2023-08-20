
import java.util.Scanner;
public class Main{
    public static void main(String []args) {
        var sc = new Scanner(System.in);
        var personAge = new Age();
        System.out.println("Enter your birth date in DD MM YYYY format.");
        personAge.day1 = sc.nextByte();
        personAge.month1 = sc.nextByte();
        personAge.year1 = sc.nextInt();

        System.out.println("Enter today's date in DD MM YYYY format");
        personAge.day2 = sc.nextByte();
        personAge.month2 = sc.nextByte();
        personAge.year2 = sc.nextInt();

        int yearsAge = personAge.AgeInYears();
        int monthsAge = personAge.AgeInMonths();
        int daysAge = personAge.AgeInDays();
        int sumDays = personAge.TotalDays();


        System.out.println("You are "+yearsAge+" years, "+monthsAge+" months, "+daysAge+" days.");
        System.out.println("Total Days you've lived so far: "+sumDays);

    }
}