package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CCuboid extends CSolid{
    protected int a;
    protected int b;

    public CCuboid(int m,int a, int b){
        super(m);
        this.a=a;
        this.b=b;
    }

    double momentOfInertia(){
        return 1/12 * Mass  * ((a * a)+ (b * b));
    }
    void getData(JTable tab){
        Mass = Integer.parseInt(tab.getValueAt(0,1).toString());
        a = Integer.parseInt(tab.getValueAt(1,1).toString());
        b = Integer.parseInt(tab.getValueAt(2,1).toString());
    }
    void showData(JTable tab, DefaultTableModel mod){
        mod.setRowCount(3);
        tab.setValueAt("Masa", 0 ,0 );
        tab.setValueAt(Mass, 0 ,1);
        tab.setValueAt("Długość", 1, 0);
        tab.setValueAt(a, 1, 1);
        tab.setValueAt("Szerokość", 2,0);
        tab.setValueAt(b,2,1);
    }
}
