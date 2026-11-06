public class Local {
    public void run() {

        class Yerel {
            int a;
            Yerel(int a) {
                this.a = a;
            }

            public void yazdir() {
                System.out.println(a);
            }
        }

        Yerel y = new Yerel(10);
        y.yazdir();
    }
}
