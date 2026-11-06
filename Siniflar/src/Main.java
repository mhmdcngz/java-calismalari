public class Main {
    static void main() {
        NonStatic nnst = new NonStatic();
        NonStatic.Inner nnin = nnst.new Inner();
        //nnin.run();
        //nnst.run();

        Static.Inner s = new Static.Inner();
        //s.run();

        Local lcl = new Local();
        //lcl.run();

        Anonim a = new Anonim() {
            public void run() {
                System.out.println("anonim run metodu");
            }

            public void yazdir() {
                System.out.println("yazdir");
            }
        };
        a.run();
        a.yazdir();
    }
}