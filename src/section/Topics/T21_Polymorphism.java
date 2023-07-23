package section.Topics;


class product {
    private String model;
    private String manufacture;
    private int width;
    private int height;
    private int depth;

    public product(String model, String manufacture, int width, int height, int depth) {
        this.model = model;

        this.manufacture = manufacture;
    }

}
    class Monitor extends product {
    private int size;
    private String revolution;

        public Monitor(String model, String manufacture, int width, int height, int depth, int size, String revolution) {
            super(model, manufacture, width, height, depth);
            this.size = size;
            this.revolution = revolution;
        }
        public void drawPixelAt(int x, int y, String color){
            System.out.println(String.format("Drawing pixel at %d,%d in color %s ", x, y, color));
        }

        public Monitor(String model, String manufacture, int width, int height, int depth) {
            super(model, manufacture, width, height, depth);

        }
    }
class Motherboard extends product {


    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacture, int width, int height, int depth) {
        super(model, manufacture, width, height, depth);
    }

    public Motherboard(String model, String manufacture, int width, int height, int depth, int ramSlot, int cardSlot, String bios) {
        super(model, manufacture, width, height, depth);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+ programName + " is now loading...");
    }
}
class ComputerCase extends product {
    private String powerSupply;

    public ComputerCase(String model, String manufacture, int width, int height, int depth) {
        super(model, manufacture, width, height, depth);
    }

    public ComputerCase(String model, String manufacture, int width, int height, int depth, String powerSupply) {
        super(model, manufacture, width, height, depth);
        this.powerSupply = powerSupply;
    }



    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

}



 class personalComputer extends product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

     public personalComputer(String model, String manufacture, int width, int height, int depth, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
         super(model, manufacture, width, height, depth);
         this.computerCase = computerCase;
         this.monitor = monitor;
         this.motherboard = motherboard;
     }

     public ComputerCase getComputerCase() {
         return computerCase;
     }

     public Monitor getMonitor() {
         return monitor;
     }

     public Motherboard getMotherboard() {
         return motherboard;
     }
 }




public class T21_Polymorphism {
    public static void main(String[] args) {

    }
}
