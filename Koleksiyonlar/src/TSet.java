import java.util.TreeSet;

public class TSet {
    static void main() {
        TreeSet tree = new TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(6);

        try {
            tree.add(null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        tree.forEach(item -> System.out.println(item));
    }
}
