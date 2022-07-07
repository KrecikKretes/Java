package edu.lab3;

public class CDriver extends CEmployee{
    protected Integer licenseUntil;
    protected String category;
    private static final String KIND = "KIEROWCA";

    public Integer getLicenseUntil() {
        return licenseUntil;
    }

    public void setLicenseUntil(Integer licenseUntil) {
        this.licenseUntil = licenseUntil;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CDriver(CEmployee wzor,Integer licenseUntil, String category) {
        super(wzor);
        this.licenseUntil = licenseUntil;
        this.category = category;
    }
}
