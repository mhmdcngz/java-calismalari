public class JenerikMethod {
    public <E> void jenerikMetod(E[] arr) {
        for (E item : arr) {
            System.out.println(item);
        }
    }
}
