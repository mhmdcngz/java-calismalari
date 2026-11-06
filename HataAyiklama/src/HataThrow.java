public class HataThrow {
    static void main() {
        int a = 0;
        if (a == 0) {
            System.out.println("bölen 0 olamaz");
            throw new ArithmeticException("Hata bölen 0");
        }

        System.out.println("devam");

    }
}
