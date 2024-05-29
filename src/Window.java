import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Window extends JFrame {

    int width = 500, height = 500;
    JButton btn1;
    JTextField txt1;

    public Window() {
        super("This window!");
        //setLayout(new FlowLayout());
        JPanel jpanel = new JPanel();
        jpanel.setOpaque(true);
        jpanel.setLayout(null);

        btn1 = new JButton("Push the button");
        btn1.setLocation(25,25);
        btn1.setSize(150, 70);
        jpanel.add(btn1);

        btn1.addActionListener(new  actionPerformer());
        btn1.addMouseListener(new mouseActionPerformer());

        setContentPane(jpanel);
    }

    public static class actionPerformer implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Hi my Friend!!!");
        }
    }
    public class mouseActionPerformer implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            btn1.setBackground(null);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            btn1.setBackground(null);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            btn1.setBackground(Color.GREEN);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            btn1.setBackground(Color.RED);
            Random random = new Random();
            btn1.setLocation(random.nextInt(width-75), random.nextInt(height-15));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btn1.setBackground(null);
        }
    }


}
