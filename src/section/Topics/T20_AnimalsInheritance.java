package section.Topics;
class Animal {
    private final String type;
    private final String size;
    private final String weight;

    public Animal(String type, String size, String weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big","50");
    }



    public Dog(String type, String size, String weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

}

public class T20_AnimalsInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal ","Huge","400");
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}
