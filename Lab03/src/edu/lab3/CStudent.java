package edu.lab3;

public class CStudent{
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

    public CStudent(CPerson osoba,String field, Integer semester) {
        super(osoba);
        this.field = field;
        this.semester = semester;
    }

    public CStudent(String name, String familyname, String field, Integer semester) {
        name = name;
        familyname = familyname;
        this.field = field;
        this.semester = semester;
    }
}
