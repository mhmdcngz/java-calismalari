import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static void main() {
        //pencere
        JFrame frame = new JFrame("deneme");
        frame.setSize(800, 800);

//        JPanel panel = new JPanel();
//        panel.setLocation(1,1);
//        frame.add(panel);


        JButton button = new JButton("Buton");
        button.setBounds(400, 400, 100, 30);         // button.setBounds(x, y , width, height);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("butona tıkladın");
            }
        });
        frame.add(button);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);         // görünebilme yeteneği

    }
}