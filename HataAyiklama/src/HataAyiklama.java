import java.util.InputMismatchException;
import java.util.Scanner;

public class HataAyiklama {
    static void main() {
        Scanner keyboard = new Scanner(System.in);

        int a = 0, b;
        System.out.println(a);
        try {
            a = 2 / 0;
            //hatadan sonrasını okumaz
            System.out.println("try içi");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("catch içi");
        }

        System.out.println(a);
        System.out.println("-------------------------------------\n");

        int[] dizi = new int[3];
        try {
            dizi[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.println("-------------------------------------\n");

        try {
            a = 2 / 1;
            System.out.println(a);
            dizi[2] = 10;

            System.out.print("Gir: ");
            b = keyboard.nextInt();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("burası her zaman çalışır");
        }

    }
}
