package src.com.java.workshop.temparturedata.beans;

public class Sensor {
    private double temparture;
    private String sensorname;
    private int Sensorid;


    public void settemparture(double aTemparture){
        temparture=aTemparture;
    }

    public double gettemparture() {
        return temparture;
    }

    public void setsensorname(String aSensorname){
        sensorname=aSensorname;
    }

    public String getsensorname(){
       return sensorname;
    }
    public void setSensorid(int aSensorId){
        Sensorid=aSensorId;
    }

    public int getSensorid(){
       return Sensorid;

    }
    

}
