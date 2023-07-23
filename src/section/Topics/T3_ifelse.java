package section.Topics;

public class T3_ifelse {
    public static void main(String[] args) {
        // if else
        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("Aliens are real!");
        } else {
            System.out.println("Aliens aren't real!");
        }
        // else if
        int num = 18;
        if (num >= 18) {
            System.out.println("You can drive!");
        } else if (num < 18) {
            System.out.println("You can't drive!");
        } else {
            System.out.println("Enter the correct age!");
        }
    }
}
