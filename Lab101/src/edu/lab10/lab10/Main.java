package edu.lab10.lab10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()->new CMainForm("Kształt").setVisible(true));
    }
}
