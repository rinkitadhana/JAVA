package section.Projects;
// Watch

public class P34_NumberToWords {
    public static void main(String[] args) {

    }

    public static void numberToWord(int number) {
        int remainder = 0;
        if (number < 0) {
            System.out.println("Invalid Vale");
        } else {
            int reverseNumber = reverse(number);
            for (int i = 0; i < getDigitCount(number); i++) {

                switch (reverseNumber % 10) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Default ");
                        break;
                }
                reverseNumber /= 10;
            }
            System.out.println();
        }
    }
    public static int reverse(int number){
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        int count = 1;
        if (number < 0) {
            return -1;
        } else {
            while (number>9) {
                number = number/10;
                count++;
            }
            return count;
        }
    }
}