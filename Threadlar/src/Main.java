public class Main {
    static void main() {
        // Thread

        İslemler islem = new İslemler("İlk");
        Thread t1 = new Thread(islem);

        İslemler islem2 = new İslemler("Son");
        Thread t2 = new Thread(islem2);

        t1.start();
        t2.start();
    }
}
