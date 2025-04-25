package model;

public class Criminal {
    private int criminalID;
    private String criminalNo;
    private String name;
    private String address;
    private String aadhaar;
    private byte[] image;

    public int getCriminalID() { return criminalID; }
    public void setCriminalID(int criminalID) { this.criminalID = criminalID; }

    public String getCriminalNo() { return criminalNo; }
    public void setCriminalNo(String criminalNo) { this.criminalNo = criminalNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAadhaar() { return aadhaar; }
    public void setAadhaar(String aadhaar) { this.aadhaar = aadhaar; }

    public byte[] getImage() { return image; }
    public void setImage(byte[] image) { this.image = image; }
}
