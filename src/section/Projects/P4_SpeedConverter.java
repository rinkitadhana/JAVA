package section.Projects;

public class P4_SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(-22));
        printConversion(1.25);

    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round((kilometersPerHour / 1.609));
        }
    }
    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " +toMilesPerHour(kilometerPerHour)+ " mi/h");
        }
    }
}
