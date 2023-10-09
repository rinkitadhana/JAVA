package Leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        var result = new SolutionOfPalindromeNumber();
        System.out.println(result.isPalindrome(0));

    }
}
class SolutionOfPalindromeNumber {
    public boolean isPalindrome(int x) {
        int result = 0;
        int remainder = 0;
//        if(x<10&&x>0||x<0){
//            return false;
//        }
        int value=x;
        while(value>0){
            remainder = value%10;
            result = result*10 +remainder;
            value = value/10;
        }
        if(result==x){
            return true;
        }
        else
            return false;


    }
}
