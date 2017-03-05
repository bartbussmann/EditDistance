/**
 * Demo application with GUI which calculates the edit distance between two input strings.
 *
 * @author Bart Bussmann
 * @since 3-3-2017
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditDistanceDemo extends JFrame {

    public EditDistanceDemo() {
        initUI();
    }

    private void initUI() {


        JFrame frame = new JFrame("Edit distance demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,500,300);
        panel.setLayout(null);
        JButton button1 = new JButton("Calculate edit distance");
        button1.setBounds(5,150,470,30);
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(30,100,130,30);
        JTextField textfield2 = new JTextField();
        textfield2.setBounds(300,100,130, 30);
        JLabel label1 = new JLabel();
        label1.setBounds(170, 200 ,400, 30);
        JLabel label2 = new JLabel("String 1:");
        label2.setBounds(60, 80, 130, 20);
        JLabel label3 = new JLabel("String 2:");
        label3.setBounds(330, 80, 130, 20);



        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str1 = textfield1.getText();
                String str2 = textfield2.getText();
                EditDistance dist = new EditDistance(str1, str2);
                label1.setText("The edit distance is " + Double.toString(dist.distance()));
            }
        });

        panel.add(button1);
        panel.add(textfield1);
        panel.add(textfield2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.add(panel);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            EditDistanceDemo demo = new EditDistanceDemo();
        });
    }
}