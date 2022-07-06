package me.loremente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JTextArea textArea;
    private JTextField textField;
    private JButton button;

    public GUI() {
        super("TODOList");

        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textField = new JTextField();
        button = new JButton("Add to TODOList");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                String testoTextField = textField.getText();

                if (!testoTextField.equals("")) { //for don't carrying text if be null

                    textArea.append(testoTextField + "\n");
                    textField.setText("");
                }
            }
        });

        add(textArea, BorderLayout.CENTER);
        add(textField, BorderLayout.PAGE_START);
        add(button, BorderLayout.AFTER_LAST_LINE);


        setVisible(true);
    }
}
