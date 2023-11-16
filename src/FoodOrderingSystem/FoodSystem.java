package FoodOrderingSystem;

import LeapYear.leapYear;

import javax.swing.*;

public class FoodSystem extends JFrame{
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodSystem(){
        btnOrder.addActionListener(e -> {

            double sum = 0;

            if(cPizza.isSelected()){
                sum += 100;
            }
            if(cBurger.isSelected()){
                sum += 80;
            }
            if(cFries.isSelected()){
                sum += 65;
            }
            if(cSoftDrinks.isSelected()){
                sum += 55;
            }
            if(cTea.isSelected()){
                sum += 50;
            }
            if(cSundae.isSelected()){
                sum += 40;
            }

            if(rbNone.isSelected()){
                JOptionPane.showMessageDialog(this,"The total price is Php "+ String.format("%.2f",sum));
            }else if(rb5.isSelected()){
                sum -= (sum * .05);
                JOptionPane.showMessageDialog(this,"The total price is Php "+ String.format("%.2f",sum));
            }else if(rb10.isSelected()){
                sum -= (sum * .10);
                JOptionPane.showMessageDialog(this,"The total price is Php "+ String.format("%.2f",sum));
            }else if(rb15.isSelected()){
                sum -= (sum * .15);;
                JOptionPane.showMessageDialog(this,"The total price is Php "+ String.format("%.2f",sum));
            }


        });
    }


    public static void main(String[] args) {

        FoodSystem app = new FoodSystem();
        app.setContentPane(app.jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");

    }
}
