public class Rinkit{
    public static void main(String[] args) {
        var kes = new Keshav();
      kes.rin();
       ada();
    }
    public static void ada(){
        System.out.println("ada");
    }
}
class Keshav{
    static int a = 4;
    int i = 10;
    public static void rin(){
        Rinkit.ada();
        int s = a;
        System.out.println("Rinkit");
    }
}