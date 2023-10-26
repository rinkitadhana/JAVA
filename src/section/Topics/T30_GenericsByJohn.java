package section.Topics;
class Printer <T> {
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}

public class T30_GenericsByJohn {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
    }
}
