package section.Topics;


class Class1{
    public static int num1=2;
    public int num2=1;
    public static void method1(){
        int result=num1;
   System.out.println(result);

    }
    public void method2(){
        int result =num1+num2;
        System.out.println(result);

    }

}
class Class2{
    public static void method3(){
        Class1.num1=2;
        Class1.method1();
        var result = new Class1();
        result.method2();
        result.num2=1;
    }
    public void method4(){
        Class1.num1=1;
        Class1.method1();
        var result = new Class1();
        result.num2=2;
        result.method2();;

    }
}
public class T28_StaticAndInstanceMethods {
    public static void main(String[] args) {
        Class1.num1=1;
        Class1.method1();
        var result = new Class1();
        result.method2();
        result.num2=1;
    }

}
