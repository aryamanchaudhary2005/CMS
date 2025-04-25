package ui;

import java.util.Date;

public class FIRViewUI {
    private int firNo;
    private String name;
    private Date date;
    private String crime;
    private String gender;

    public FIRViewUI(int firNo, String name, Date date, String crime, String gender) {
        this.firNo = firNo;
        this.name = name;
        this.date = date;
        this.crime = crime;
        this.gender = gender;
    }

    // Getters
    public int getFirNo() { return firNo; }
    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getCrime() { return crime; }
    public String getGender() { return gender; }
}
