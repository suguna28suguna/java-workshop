package src.com.java.workshop.temparturedata.beans;

public class Hostel extends Bulding{
    private boolean isMessAvailabe;
    private int numbersofrooms;
    public void setisMessAvailable(boolean aIsMessAvailable){
        isMessAvailabe=aIsMessAvailable;
    }
    public boolean getIsMessAvailable(){
        return isMessAvailabe;
    }
    public void setNumbersOfRooms(int aNumbersOfRooms){
        numbersofrooms=aNumbersOfRooms;
    }
    public int getNumbersOfRooms(){
        return numbersofrooms;
    }
}
