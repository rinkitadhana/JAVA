package section.Topics;

public class T15_OOPS_Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertable = true;
    public String getMake() {   // getters

        return make;
    }


    public String getModel() {

        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setModel(String model) { // setters
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public void setMake(String make){
       if(make == null) make = "Unknown";
       String lowerCaseMaker = make.toLowerCase();
       switch(lowerCaseMaker){
           case "holden","honda","tesla" -> this.make = make;
           default -> {
               this.make = "Unspported";
           }
       }
    }

    public void describeCar(){
        System.out.println(doors+"-Door " +
                color+ " " +
                make + " " +
                model + " " +
                (convertable ? "Convertable": "Non Convertable"));
    }
}
 class T16_CarRunner {
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

