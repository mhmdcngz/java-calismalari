public class İslemler implements Runnable {
String name;

    public İslemler(String name) {
        this.name = name;
        System.out.println(name + " işlem oluştu");
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " bitti");
    }
}
