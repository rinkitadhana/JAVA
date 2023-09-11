package section.Topics.Generics;
public class Main {
    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);
//        list.add("String");
//        list.add(new User());
        var list1 = new GenericList<Integer>();
        list1.add(1);
        int print = list1.get(0);
        System.out.println(print);
    }
}
