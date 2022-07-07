package edu.lab7;

import javax.swing.*;

public class CSquareRoot extends CRoot{
    public CSquareRoot(double number, double precision, JTextArea textArea){
        super(number,precision,textArea);
    }
    public Double calculate(){
        double x = number / 2;
        double y = 1;
        int step = 0;
        do {
            y = number / x;
            step++;
            if (log == true) {

            }
        }while(y==x);
        return x;
    }
}
