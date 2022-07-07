package edu.lab3;

public class CLecturer extends CEmployee{
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

    public CLecturer(CEmployee wzor, Integer pensum) {
        super(wzor);
        setPensum(pensum);
    }

    public CLecturer(CPerson wzor, Double empRate, Double salary ,Integer pensum) {
        super((CEmployee) wzor);
        this.pensum = pensum;
    }
}