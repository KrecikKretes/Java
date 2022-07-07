package edu.lab3;

public class CEmployee extends CPerson{

    protected Double empRate;
    protected Double salary;
    private static final String KIND = "PRACOWNIK";

    public CEmployee(Double empRate, Double salary) {
        this.empRate = empRate;
        this.salary = salary;
    }

    public CEmployee(){
        super();
    }

    public CEmployee(CPerson wzor,Double empRate, Double salary) {
        super(wzor);
        this.empRate = empRate;
        this.salary = salary;
    }

    public CEmployee(CEmployee copy) {
        setEmpRate(copy.empRate);
        setSalary(copy.salary);
    }

    public CEmployee(String name,String familyName, Long pesel, Double empRate, Double salary) {
        super(name, familyName, pesel);
        setEmpRate(empRate);
        setSalary(salary);
    }

    public Double getEmpRate() {
        return empRate;
    }

    public void setEmpRate(Double empRate) {
        this.empRate = empRate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String employeeReport(){
        return null;
    }



}
