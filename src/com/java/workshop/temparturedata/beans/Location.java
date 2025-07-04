package src.com.java.workshop.temparturedata.beans;

public class Location{
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private long postalcode;


    public void setname(String aName){
        name=aName;
    }

    public String getName() {
        return name;
    }

    public void setLatitude(double aLatitude){
        latitude=aLatitude;
    }

    public double getLatitude(){
       return latitude;
    }

    public void setLongitude(double aLongitude){
        longitude=aLongitude;
    } 
    public double getLongitude(){
        return longitude;
    }
    public void setdescription(String aDescription){
        description=aDescription;
    }
    public String getdescription(){
        return description;
    }
    public void setcountry(String aCountry){
        country=aCountry;
    }
    public String getcountry(){
        return country;
    }
    public void setcity(String aCity){
        city=aCity;
    }
    public String getcity(){
        return city;
    }
    public void setAddress(String aAddress){
        address=aAddress;
    }
    public String getAddress(){
        return address;
    }
    public void setPostalcode(long aPostalcode){
        postalcode=aPostalcode;
    }
    public long getPostalcode(){
        return postalcode;
    }
    public String tostring(){
        return "Location{name:"+name+
        ",latitude:"+latitude+
        ",longitude:"+longitude+
        ",description:"+description+
        ",country:"+country+
        ",city:"+city+
         ",address:"+address+
         ",postal code:"+postalcode+
        "}";
    }
}











