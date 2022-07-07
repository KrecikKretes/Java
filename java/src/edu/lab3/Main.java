package edu.lab3;

public class Main {

    public static void main(String[] args) {
        CPerson osoba = new CPerson("Ja","Ty", 2000, 31345678901L);
        CEmployee osoba1 = new CEmployee("a","b",31345678901L,99D,89D);
        System.out.println(osoba.toString());
        System.out.println(osoba1.toString());
    }
}
