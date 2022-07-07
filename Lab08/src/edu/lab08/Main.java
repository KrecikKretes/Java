package edu.lab08;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> new CMainForm("Momenty bezwładności").setVisible(true));
    }
}
