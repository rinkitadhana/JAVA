

public class Age {
    private int ageInYears = 0;
    private int ageInMonths = 0;
    private int ageInDays = 0;
    private int extraDays = 0;
    public int day1;
    public int day2;
    public int month1;
    public int month2;
    public int year1;
    public int year2;
    private final int[] numberOfDaysInAMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int AgeInYears() {
        if(year2 > year1 && year1>0) {
            if(month2 > month1 || month2 == month1 && day2 >= day1)
                ageInYears = year2 - year1;
            else
                ageInYears = year2 - year1 - 1;
        }
        else
            throw new IllegalArgumentException("Invalid Year");
        return ageInYears;
    }
    public int AgeInMonths() {
        if(month2 > month1)
            ageInMonths = month2 - month1 - 1;
        else
            ageInMonths = 12 - (month1 - month2);

        return ageInMonths;
    }
    public int AgeInDays() {
        if(year1%4==0 || year1%100==0 && year1%400==0) {
            if(day2 > day1)
                ageInDays = day2 - day1;
            else
            if(month2 == 2){
                ageInDays = numberOfDaysInAMonth[month2-1] + 1 - (day1 - day2);
            }

        }
        else {
            if(day2 > day1)
                ageInDays = day2 - day1;
            else
                ageInDays =  numberOfDaysInAMonth[month2-1] - (day1 - day2);
        }
        return ageInDays;


    }
    public int TotalDays() {

        while(year2>year1) {
            if(year1%4==0 || year1%100==0 && year1%400==0) {
                extraDays++;
            }
            year1++;
        }
        return ageInYears*365 + ageInMonths*30 + extraDays + ageInDays;
    }

}