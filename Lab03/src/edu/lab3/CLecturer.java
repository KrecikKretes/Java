package edu.lab3;

public class CLecturer {
    protected Integer pensum;
    private static final String KIND = "WYKŁADOWCA";

    public Integer getPensum() {
        return pensum;
    }

    public void setPensum(Integer pensum) {
        this.pensum = pensum;
    }

    public static String getKIND(){
        return KIND;
    }

    public CLecturer(CEmployee osoba, Integer pensum) {
        super(osoba);
        this.pensum = pensum;
    }

    public CLecturer(CPerson osoba, Double empRate, Double salary ,Integer pensum) {
        this.pensum = pensum;
    }
}
