package section.Topics;

public class T7_ForStatementLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter<=5; counter++){
            System.out.println(counter);
        }
        for(int number = 1; number <=10; number++){
            if(number>8){
                break;
            }
            System.out.println(number);
        }
    }
}
