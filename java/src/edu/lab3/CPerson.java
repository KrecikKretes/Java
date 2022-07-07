package edu.lab3;

import javax.print.attribute.standard.MediaSize;
import java.util.Objects;

public class CPerson{
    protected String name;
    protected String familyName;
    protected Integer birthYear;
    protected Long pesel;
    public static String NATIONALITY = "PL";
    private static final String KIND = "OSOBA";

    @Override public String toString(){
        return (getName() + " " + getFamilyName() + " " + getPesel() + " " + getBirthYear() + " " + getKIND() + " " + NATIONALITY);
    }

    @Override void public String info(){
        System.out.println(getKIND() + " " + getName() + " " + getFamilyName() + ",");
        System.out.println("ur. w " + getBirthYear()+ ",");
        System.out.println("Pesel: " + getPesel());
    }

    public static String getKIND(){
        return KIND;
    }

    public CPerson(){
        setName("a");
        setFamilyName("b");
        setBirthYear(2000);
        setPesel(31345000000L);
    }


    public CPerson(String name, String familyName, Integer birthYear, Long pesel) {
        setName(name);
        setFamilyName(familyName);
        setBirthYear(birthYear);
        setPesel(pesel);
    }

    public CPerson(String name, String familyName, Long pesel) {
        setName(name);
        setFamilyName(familyName);
        setPesel(pesel);

        Integer year = Math.toIntExact(pesel/1000000000L);
        year += ((Math.toIntExact((pesel % 1000000000L)/1000000000L)<13) ? 1900 : 2000);
        setBirthYear(year);
    }

    public CPerson(CPerson wzor) {
        setName(wzor.name);
        setFamilyName(wzor.familyName);
        setBirthYear(wzor.birthYear);
        setPesel(wzor.pesel);
    }

    public void setBirthYear(Integer birthYear) {
        if((birthYear < 0 ) || (birthYear > 9999))
            throw new IllegalArgumentException("Niepoprawny rok urodzenia");
        this.birthYear = birthYear;
    }

    public void setPesel(Long pesel) {
        if((pesel < 210000000L ) || (pesel > 99999999999L))
            throw new IllegalArgumentException("Niepoprawny pesel");
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Long getPesel() {
        return pesel;
    }
}
