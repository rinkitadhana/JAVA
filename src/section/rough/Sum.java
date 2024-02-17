package section.rough;
import java.util.Scanner;
public class Sum {
    int num1 =10;
    int num2 = 20;
    public int compute(int i, int j){
        return (i+j);
    }

    public static void main(String[] args) {
        var sum = new Sum();
        System.out.println(sum.compute(10,20));

    }
}
