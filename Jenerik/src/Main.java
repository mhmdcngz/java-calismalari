import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  static void main() {

    Integer[] intArr = {1, 2, 3, 4};
    Double[] doubleArr = {1.1, 2.1, 3.1};
    Character[] chaArr = {'K', 'O', 'D'};

    jenerikMetod(intArr);
    jenerikMetod(doubleArr);
    jenerikMetod(chaArr);

  }

  public static  <E> void jenerikMetod(E[] arr) {
    for (E item : arr) {
      System.out.println(item);
    }
  }
}