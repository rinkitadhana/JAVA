package Leetcode;
public class ValidAnagram {
    public static void main(String[] args) {
        var result = new SolutionOfValidAnagram();
        result.isAnagram("aman","nama");
    }
}
class SolutionOfValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        StringBuilder sb = new StringBuilder(t);

        if (s.length()!=t.length()){
            result = false;
        }else {
            for(int i=0; i<s.length();i++){

                for (int j=0; j<t.length(); j++){
                    if (s.charAt(i)==sb.charAt(j)){
                       sb = sb.deleteCharAt(j);
                    }
                }
            }


        }
        if (sb.isEmpty()){
            result=true;
        }
        return result;

    }
}
