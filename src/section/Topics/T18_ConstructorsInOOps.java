package section.Topics;
class College {
    String name;
    int age;
    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // There are three type of constructor :- (as following)
    College(){  // This is a simple constructor (without any variable or dataType)
        System.out.println("This is a constructor!");
    }
    College(String name, int age){ // This is Variable Constructor
        this.name = name;
        this.age = age;

    }
    College(College c2){  //This is copy Constructor
        this.name = c2.name;
        this.age = c2.age;
    }
}
public class T18_ConstructorsInOOps {
    public static void main(String[] args) {
        College c1 = new College("Rinkit",19);// We need to write the information in the bracket just like we used in functions.
//        c1.name = "Rinkit";   // Now we can directly print the information with the help of variable constructor
//        c1.age = 19;
        c1.studentInfo();
        College c2 = new College(c1);
        c2.studentInfo();




    }
}
