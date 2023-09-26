package section;
import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
    int[][][] matrix = {{{1,2,3},{3,4,5}},{{1,2,3},{3,4,5}}};

        System.out.println(Arrays.deepToString(matrix));
        int[][][] number = new int[2][2][3];
        number[0][0][0] = 1;
        number[0][0][1] = 2;
        number[0][0][2] = 3;
        number[0][1][0] = 4;
        number[0][1][1] = 5;
        number[0][1][2] = 6;
        number[1][0][0] = 1;
        number[1][0][1] = 2;
        number[1][0][2] = 3;
        number[1][1][0] = 4;
        number[1][1][1] = 5;
        number[1][1][2] = 6;
        String a = "1";


//        System.out.println(Arrays.deepToString(number));
        int i = Integer.parseInt(a);
        System.out.println(i);


    }

}
