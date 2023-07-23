package section.Topics;

public class T5_MethodOverLoading {
    public static void main(String[] args) {
        method();
        method(19);
        method(2,2);
        method("Rinkit Adhana",19);
    }
    public static int method(){
        System.out.println("Hello, my name is Rinkit Adhana");
        return 0;
    }
    public static int method(int a){
        System.out.println("My age is "+a);
        return 0;
    }
    public static int method(int a, int b){
        System.out.println(a+b);
        return 0;
    }
    public static int method(String name, int a){
        System.out.println("My name is "+name+ " and my age is "+a);
        return 0;
    }
}
