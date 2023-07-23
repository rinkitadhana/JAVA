package section.Topics;

public class T16_CarRunner {
    public static void main(String[] args) {
    T15_OOPS_Car car = new T15_OOPS_Car();

    car.setMake("honda");
    car.setModel("T-45");
    car.setColor("Pink");
    car.setDoors(3);
    car.setConvertable(false);



        System.out.println("Make = "+car.getMake());
        System.out.println("Model = "+car.getModel());
        System.out.println("Color = "+car.getColor());
        System.out.println("Doors = "+car.getDoors());

    car.describeCar();
    }
}
