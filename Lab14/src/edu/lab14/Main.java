package edu.lab14;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {new CMainForm("Kółko - krzyżyk").setVisible(true); } );
    }
}
