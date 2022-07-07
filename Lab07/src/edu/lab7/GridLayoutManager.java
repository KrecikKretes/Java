package edu.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutManager extends javax.swing.JFrame{
    private JPanel Red;
    private JPanel Blue;
    private JPanel MainPanel;
    private JButton OBLICZButton;
    private JTextField precisionTextField;
    private JRadioButton p2sRadioButton;
    private JRadioButton p3sRadioButton;
    private JCheckBox logStepsCheckBox;
    private JTextField numberTextField;
    private JButton saveParamsButton;
    private JButton readParamsButton;
    private JTextArea textArea1;
    private JButton saveRaportButton;

    public GridLayoutManager(String title) throws HeadlessException{
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        OBLICZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button1Click();
            }
        });
    }


    private void button1Click(){

    }
}
