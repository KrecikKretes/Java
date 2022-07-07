package edu.lab08;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public abstract class CSolid extends Main{
    protected int Mass;

    public CSolid(int mass) {
        Mass = mass;
    }

    double momentOfInertia(){
        return 0.0;
    }

    void getData(JTable tab){

    }

    void showData(JTable tab,DefaultTableModel mod){

    }
}
