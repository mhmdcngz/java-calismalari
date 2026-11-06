import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static int[][] map = new int[5][5];


    public static void mapYazdirma() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void run() {
        int x = 0;
        int y = 0;

        while (true) {
            map[y][x] = 1;
            mapYazdirma();

            System.out.println("Yukarı(U)\nAşağı(D)\nSağ(R)\nSol(L)");
            System.out.print("Gitmek istediğiniz yönü girin: ");
            String komut = keyboard.next().toLowerCase();



            map[y][x] = 0;
            for (char yon : komut.toCharArray()) {
                if ((kontrol(x, y, yon))) {
                    System.out.println("\nSınır dışına çıkamazsınız");
                    continue;
                }

                if (yon == 'd') {
                    y++;
                } else if (yon == 'u') {
                    y--;
                } else if (yon == 'r') {
                    x++;
                } else if (yon == 'l') {
                    x--;
                }

            }
            System.out.println();
        }
    }

    public static boolean kontrol(int x, int y, char yon) {
        switch (yon) {
            case 'u':
                if (y == 0) {
                    return true;
                }
                break;
            case 'd':
                if (y == 4) {
                    return true;
                }
                break;
            case 'r':
                if (x == 4) {
                    return true;
                }
                break;
            case 'l':
                if (x == 0) {
                    return true;
                }
                break;
            default:
                return true;
        }
        return false;
    }






    public static void main(String[] args) {
        run();
    }
}
