package section.Topics;

import java.util.Scanner;
public class T12_ConsoleAndScanner {
    public static void main(String[] args) {
        int currentYear = 2023;

        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's Your Name?");
        System.out.println("Hi "+name+" Thanks for taking the course!");
        String dateOfBirth = System.console().readLine("what year were you born ?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+ age + " Years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What's your Name? ");
        String name = sc.nextLine();
        System.out.println("Hi "+name+" Thanks for taking the course!");
        System.out.println("What year were you born ? ");
        String dateOfBirth = sc.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+ age + " Years old";
    }
}
