package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class leapYear extends JFrame{

    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public leapYear(){

        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());

            if(((year%4==0) && ((year%400==0) || (year%100!=0)))) {
                JOptionPane.showMessageDialog(this, "Leap year");
            }else{
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }
        });

    }
    public static void main(String[] args) {

        leapYear app = new leapYear();
        app.setContentPane(app.jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");

    }
}

