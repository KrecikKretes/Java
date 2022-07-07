package edu.lab08;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CMainForm extends JFrame{
    private JPanel mainPanel;
    private JPanel picturePanel;
    private JComboBox comboBox1;
    private JLabel resultLabel;
    private JButton calculateButton;
    private JTable table1;

    private void createUIComponents() {
        picturePanel = new CPaintPanel();
    }

    private DefaultTableModel model;
    private CSolid[] solids;

    private void frameOpened(){
        String n[] = {"Nazwa", "Wartośc"};
        model = new DefaultTableModel(null, n);
        table1.setModel(model);
        table1.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        comboBox1.setSelectedIndex(0);
        calculateActionPerformed();
    }
    void comboBoxActionPerfomed(){
        int idx = comboBox1.getSelectedIndex();
    }
    void calculateActionPerformed(){

    }
    public CMainForm(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent we){
                frameOpened();
            }
        });


        comboBox1.addActionListener( actionEvent -> comboBoxActionPerfomed());
        calculateButton.addActionListener((actionEvent -> calculateActionPerformed()));

        solids = new  CSolid[6];
        solids[0]= new CSphere(1,2);
        solids[1]= new CPlate(3,4);
        solids[2]= new CCone(5,6);
        solids[3]= new CCylinder(7,8);
        solids[4]= new CPipe(2,3,1);
        solids[5]= new CCuboid(4,5,6);


    }




}
