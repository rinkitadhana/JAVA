package section.Topics;
class Pen {
    String color ;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Rinkit {
    String Surname;
    int age;
    int weight;
    int height;

    public void info(){
        System.out.println(this.age);
        System.out.println(this.Surname);
        System.out.println(this.weight);
        System.out.println(this.height);

    }

}
class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class T17_OOPS {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Rinkit";
        s1.age = 19;
        s1.printInfo();

        Rinkit r1 = new Rinkit();
        r1.age = 19;
        r1.Surname = "Adhana";
        r1.height = 6;
        r1.weight = 75;
        r1.info();
    }

}
