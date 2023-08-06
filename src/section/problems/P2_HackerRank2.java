package section.problems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P2_HackerRank2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String xAsString = Integer.toString(x);
            String padded = String.format("%-15s", s1);
            if (xAsString.length() == 3) {
                System.out.println(padded + xAsString);
            } else if (xAsString.length() == 2) {
                xAsString = "0" + xAsString;
                System.out.println(padded + xAsString);
            } else {
                xAsString = "00" + xAsString;
                System.out.println(padded + xAsString);
            }



        }
        System.out.println("================================");

    }
    
}