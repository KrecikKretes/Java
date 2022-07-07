package edu.lab7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()->new GridLayoutManager("Kształt").setVisible(true));
    }
}
