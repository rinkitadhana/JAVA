package section.Topics;

class UniversalAnimal{
    String name;
    public void makeNoise(){
        System.out.println("I'm just an Animal");
    }

}
class UniversalDog extends UniversalAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Woof Woof!");
    }
    public void growl(){
        System.out.println("Grrrrrrrrr");
    }
}
public class T29_UpCastingDownCasting {
    public static void main(String[] args) {
        UniversalAnimal myUniversalAnimal = new UniversalDog();
        myUniversalAnimal.makeNoise(); 


    }

}
