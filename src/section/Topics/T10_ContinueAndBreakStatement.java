package section.Topics;

public class T10_ContinueAndBreakStatement {
    public static void main(String[] args) {
        int number = 0;
        while(number<50){
            number+=5;
            if(number % 25 ==0){
                continue;
            }
            System.out.print(number + "_");
        }

        int a = 0;
        for(a=0; a<=10; a++){
            if(a>5){
                break;
            }
            System.out.println(a);
        }

        int i = 0;
        while (i< 15){
            i ++;
            if(i<=5){

                System.out.println("Skipping number "+i);
                continue;

            }
            System.out.println("number "+i);
            if(i>=10){
                System.out.println("Breaking at "+i);
                break;
            }
        }
    }
}
