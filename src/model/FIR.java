package model;

import java.sql.Date;

public class FIR {
    private int firNo;
    private String name;
    private Date date;
    private String crime;
    private String gender;
    private String alias;
    private String address;
    private String aadhaar;
    private byte[] image;
    private int criminalID;

    public int getFirNo() { return firNo; }
    public void setFirNo(int firNo) { this.firNo = firNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getCrime() { return crime; }
    public void setCrime(String crime) { this.crime = crime; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAadhaar() { return aadhaar; }
    public void setAadhaar(String aadhaar) { this.aadhaar = aadhaar; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }

    public int getCriminalID() { return criminalID; }
    public void setCriminalID(int criminalID) { this.criminalID = criminalID; }
}
