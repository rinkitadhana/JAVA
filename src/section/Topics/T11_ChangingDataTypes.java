package section.Topics;

public class T11_ChangingDataTypes {
    public static void main(String[] args) {
        int currentYear = 2023;
        String userDateOfBirth = "2003";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = "+ (currentYear - dateOfBirth)); // We can't subtract string to an integer because of variable difference.So, we change string to integer by this method.

        String userAgeWithPartialYear = "19.7";
        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear); // We can use this method for different types of dataTypes.

        System.out.println("The User says He's = "+ageWithPartialYear);
    }
}
