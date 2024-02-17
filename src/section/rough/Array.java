package section.rough;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] rinkit = {1,2,4};

        int[] rin = new int[10];
        rin[0] = 10;
        System.out.println(rin[0]);
        System.out.println(Arrays.toString(rinkit));
        System.out.println(rinkit.length);
    }
}
