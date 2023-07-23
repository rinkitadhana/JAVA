package section.Topics;

public class T8_WhileLoop {
    public static void main(String[] args) {
     int i = 1;
     while(i<=5){
         System.out.println(i);
         i++;
     }
     int j =1;
        while (true) {
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}
