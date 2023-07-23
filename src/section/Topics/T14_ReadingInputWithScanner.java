package section.Topics;
import java.util.Scanner;
public class T14_ReadingInputWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Types of Scanner we can use to take input
        int intValue = sc.nextInt(); // For integer Value
        float floatValue = sc.nextFloat(); // For float Value
        double doubleValue = sc.nextDouble(); // For double Value
        long longValue = sc.nextLong(); // For long Value
        byte byteValue = sc.nextByte(); // For byte Value
        short shortValue = sc.nextShort(); // For short Value
        String stringValue = sc.next(); // For String but only for single word
        String stringSecondValue = sc.nextLine(); // For String but for whole sentence
        boolean booleanValue = sc.hasNext();
        boolean booleanSecondValue = sc.nextBoolean();
        boolean booleanThirdValue = sc.hasNextBoolean();

    }
}
