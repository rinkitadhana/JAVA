package section.Topics;
import java.util.Arrays;
import java.util.Scanner;

public class T22_Array {
    public static void main(String[] args) {
//        int numbers[] = {1,2,3,5,6};
//        System.out.println(numbers[2]);
//        int number[] = new int[10];
//        number[0] = 10;
//        System.out.println(number[0]);
//        int rinkit[];
//        rinkit = new int[10];
//        rinkit[0]= 19;
//        String rin[];
//        rin = new String[10];
//        rin[2]="rinkit";
//        int a[],b[],c;//c is wrong.
//        a = new int [40];
//        a[1]=19;
//        b= new int[29];
//        System.out.println(a.length);
//        int t[] = new int[10];
//        t[0]=0;
//        t[1]=1;
//        t[2]=2;
//        t[3]=3;
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i<t.length ; i++){
//            System.out.println("array"+i +"value"+ t[i]);


        int[][] numbers = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString(numbers));
        int[][][] rinkit = new int[2][3][4];
        rinkit[0][0][0]=1;
        System.out.println(Arrays.deepToString(rinkit));







    }
}
