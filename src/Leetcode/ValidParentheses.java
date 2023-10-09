package Leetcode;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[]}";
        var result = new SolutionOfValidParentheses();
        System.out.println(result.isValid(s));

    }
}
class SolutionOfValidParentheses {
    public boolean isValid(String s) {
        boolean value = false;
        if(s.length()>1) {
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)==')'|| s.charAt(i)=='}'|| s.charAt(i)==']'){
                    value = false;

                }
                for(int j =i+1; j<s.length();j++){
                    switch (s.charAt(i)) {
                        case '(':
                            if (s.charAt(j) == ')') {
                                value = true;
                            } else {
                                value = false;

                            }
                            break;

                        case '{':
                            if (s.charAt(j) == '}') {
                                value = true;

                            } else {
                                value = false;

                            }
                            break;
                        case '[':
                            if (s.charAt(j) == ']') {
                                value = true;

                            } else {
                                value = false;

                            }
                            break;
                    }
                }
            }
        }else{
            value = false;
        }
        return value;

    }
}
