import java.sql.*;
import java.util.Scanner;

public class Main {

    static void main() throws SQLException{

        Scanner keyboard = new Scanner(System.in);

        Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/araba?user=KULLANICI&password=SIFRE");

        Statement st = c.createStatement();

        System.out.print("Araba adı : ");
        String name = keyboard.nextLine();

        System.out.print("Araba hızı : ");
        int speed = keyboard.nextInt();

        /*
        String sorgu = "INSERT INTO araba (cars_name,cars_speed) VALUES ('" + name + "', " + speed + ")";
        int sonuc = st.executeUpdate(sorgu);
        System.out.println(sonuc);
        st.close();
        */

        /*
        String srg = "INSERT INTO araba (cars_name, cars_speed) VALUES (?,?)";
        PreparedStatement pt = c.prepareStatement(srg);
        pt.setString(1,name);
        pt.setInt(2, speed);
        pt.executeUpdate();
        */

        ResultSet rs = st.executeQuery("SELECT * FROM araba");
        while (rs.next()) {
            System.out.println(rs.getString("cars_id") + " - " + rs.getString( "cars_name") + " - " + rs.getInt("cars_speed"));
        }

    }
}