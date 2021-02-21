package com.company;

            import java.awt.event.ActionEvent;
            import java.awt.event.ActionListener;
            import javax.swing.*;
            import java.awt.*;


public abstract class TemperatureConvert  implements ActionListener {

    JFrame frame;
    JTextField textField_input, textField_result;
    JRadioButton fahrenheitRadioButton, celsiusRadioButton;
    JButton button;
    JLabel label;


    Font myFont = new Font("Arial", Font.PLAIN, 20);

    TemperatureConvert(){

        frame = new JFrame("TEMPERATURE LAB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);


        label = new JLabel();
        label.setText("TEMPERATURE CONVERTER");
        label.setBounds(65,50, 300, 40);
        label.setFont(myFont);
        label.setFont(new Font("Arial", Font.PLAIN,20));
        label.setBackground( new Color(255,0,0,126));
        label.setForeground(Color.BLACK);
        label.setBorder(BorderFactory.createEtchedBorder());
        frame.getContentPane().add(label);
        label.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        fahrenheitRadioButton = new JRadioButton("Fahrenheit", true);
        fahrenheitRadioButton.setFont(myFont);
        fahrenheitRadioButton.setBounds(50, 110, 200, 40);
        frame.getContentPane().add(fahrenheitRadioButton);
        group.add(fahrenheitRadioButton);

        celsiusRadioButton = new JRadioButton("Celsius", true);
        celsiusRadioButton.setFont(myFont);
        celsiusRadioButton.setBounds(250, 110, 200, 40);
        frame.getContentPane().add(celsiusRadioButton);
        group.add(celsiusRadioButton);


        textField_input = new JTextField();
        textField_input.setBounds(100,190, 200,40);
        textField_input.setFont(myFont);
        textField_input.setColumns(15);
        frame.getContentPane().add(textField_input);


        textField_result = new JTextField("");
        textField_result.setBounds(100,250, 200,40);
        textField_result.setFont(myFont);
        textField_result.setColumns(15);
        frame.getContentPane().add(textField_result);


        button = new JButton("CONVERT");
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(Color.BLUE);
        button.setBounds(100, 320, 200, 40);
        button.setFocusable(false);
        frame.getContentPane().add(button);

        frame.setVisible(true);


    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            try {
                if (fahrenheitRadioButton.isSelected()) {
                    double far = Double.parseDouble(textField_input.getText());
                    double cel = (far - 32) * 5/9;
                    textField_result.setText(cel + " C");
                } else {

                    double cel = Double.parseDouble(textField_input.getText());
                    double far = (cel * 9/5) + 32;
                    textField_result.setText(far + " F");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame,"INVALID NUMBER!", null, 2);


            }
        }
    });
    }
}





