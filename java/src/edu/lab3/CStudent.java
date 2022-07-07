package edu.lab3;

public class CStudent extends CPerson{
    protected String field;
    protected Integer semester;
    private static final String KIND = "STUDENT";

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String studentReport(){
        return null;
    }

    public static String getKIND(){
        return KIND;
    }

    public CStudent(CPerson wzor,String field, Integer semester) {
        super(wzor);
        this.field = field;
        this.semester = semester;
    }

    public CStudent(String Name, String familyname, Long pesel, String field, Integer semester) {
        super(Name, familyname, pesel);
        this.field = field;
        this.semester = semester;
    }
}
