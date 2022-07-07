package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CPipe extends CCylinder{

    protected int r;

    public CPipe(int R, int m, int r){
        super(R,m);
        this.r=r;
    }
    double momentOfInertia(){
        return 0.5 * Mass  * ((R * R)+ (r * r));
    }
    void getData(JTable tab){
        Mass = Integer.parseInt(tab.getValueAt(0,1).toString());
        R = Integer.parseInt(tab.getValueAt(1,1).toString());
        r = Integer.parseInt(tab.getValueAt(2,1).toString());
    }
    void showData(JTable tab, DefaultTableModel mod){
        mod.setRowCount(3);
        tab.setValueAt("Masa", 0 ,0 );
        tab.setValueAt(Mass, 0 ,1);
        tab.setValueAt("Promień zewnętrzny", 1, 0);
        tab.setValueAt(R, 1, 1);
        tab.setValueAt("Promień wewnętrzny", 2,0);
        tab.setValueAt(r,2,1);
    }
}
