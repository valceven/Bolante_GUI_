package Calculator;

import javax.swing.*;

public class Calculator extends JFrame{


    private JPanel jpanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JTextField result;

    public Calculator(){

        btnCompute.addActionListener(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int res = 0;

            if(cbOperations.getSelectedIndex() == 0){
                res = num1 + num2;
            }else if(cbOperations.getSelectedIndex() == 1){
                res = num1 - num2;
            }else if(cbOperations.getSelectedIndex() == 2){
                res = num1 * num2;
            }else if(cbOperations.getSelectedIndex() == 3){
                res = num1 / num2;
            }
            result.setText(String.valueOf(res));

        });
    }


    public static void main(String[] args) {

        Calculator app = new Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");

    }
}
