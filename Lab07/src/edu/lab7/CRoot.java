package edu.lab7;

import javax.swing.*;

public class CRoot {
    protected double number;
    protected double precision;
    protected boolean  log;
    protected JTextArea textArea;

    public CRoot(double number, double precision, JTextArea textArea) {
        this.number = number;
        this.precision = precision;
        this.textArea = textArea;
        if(textArea == null){
            this.log = false;
        }else{
            this.log = true;
        }
    }

    public Double calculate(){
        return null;
    }
}
