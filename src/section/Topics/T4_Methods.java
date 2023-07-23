package section.Topics;

public class T4_Methods {
    public static void main(String[] args) {
        method1();
        method2(1,3,4);
        method3();
        System.out.println(method4(3,3));
        System.out.println(method5(2003));
    }
    public static void method1(){
        System.out.println("My name is Rinkit Adhana");
        }
    public static void method2(int num1,int num2, int num3){
        int sum = num1 + num2 + num3;
            System.out.println(sum);
        }
        public static void method3(){
            System.out.println("Rinkit Is gay!");
        }
        public static int method4(int a , int b){
        return a + b;
        }
        public static int method5(int dateOfBirth){
         return(2023-dateOfBirth);
        }
}

