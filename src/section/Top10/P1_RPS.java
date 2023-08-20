package section.Top10;
import java.util.Scanner;
import java.util.Random;
public class P1_RPS {
    public static void main(String[] args) {
        System.out.println("Welcome to 'THE ROCK PAPER AND SCISSORS'");
        result();
        System.out.println("THANK YOU FOR PLAYING!\n");
        System.out.println("MADE BY RINKIT ADHANA");
    }
    public static void result(){
        while (true){
            System.out.println("Enter: '0' for Rock \n       '1' for Paper \n       '2' for Scissors ");
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Enter Your Number:");
            int x = scan.nextInt();
            int y = random.nextInt(2);
            if (x==y) {
                System.out.println("Computer has selected the same number as you\nMATCH DRAW");
            }
            else if (x==0 && y==1) {
                System.out.println("Computer has selected 'PAPER'\nCOMPUTER WON\nYOU LOST");
            }
            else if (x==0&&y==2) {
                System.out.println("Computer has selected 'SCISSOR'\nYOU WON\nCOMPUTER LOST");
            }
            else if (x==1&&y==0) {
                System.out.println("Computer has selected 'ROCK'\nYOU WON\nCOMPUTER LOST");
            }
            else if (x==1&&y==2) {
                System.out.println("Computer has selected 'SCISSOR'\nCOMPUTER WON\nYOU LOST");
            }
            else if (x==2&&y==0) {
                System.out.println("Computer has selected 'ROCK'\nCOMPUTER WON\nYOU LOST");
            }
            else if (x==2&&y==1) {
                System.out.println("Computer has selected 'PAPER'\nYOU WON\nCOMPUTER LOST");
            }
            else {
                System.out.println("Are You Dumb or Wottttt?\nSelect the number from 0,1,2.");
            }
            System.out.println("Do you want to play again?"+"\n \nEnter \"AnyKey\" for Restart and \"N\" for Exit!");
            String a = scan.next();
            if (a.equals("n")) {
                break;
            }
        }
    }
}