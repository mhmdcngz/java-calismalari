import java.util.Vector;

public class Vektorler {
    static void main() {

        Vector vctr = new Vector(10, 5);

        vctr.add("Armut");
        vctr.add("Kiraz");
        vctr.add("Çilek");
        vctr.add("Kavun");
        vctr.add("Karpuz");
        vctr.add("Elma");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");
        vctr.add("Armut");

        System.out.println("boyut: " + vctr.size());
        System.out.println("Kapasite: " + vctr.capacity());
        System.out.println();

        //vctr.forEach(i -> System.out.println(i));
    }
}
