package rooms;

import com.booking.store.FacilitiesStore;
import model.Facilities;
import model.Room;
import model.RoomType;

import java.util.ArrayList;

public class SuiteRoom extends Room {





    private RoomType roomType;
    private ArrayList<Facilities> facilities;

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<Facilities> facilities) {
        this.facilities = facilities;
    }


    public SuiteRoom(){
        this.roomType=RoomType.STANDARD;
    }
    @Override
    public   double calculateRoomCost(){

        double swimmingPrice= 1;
        double lateCheckPrice=1;
        double internetPrice=2;
        double roomBreakFastPrice=5;
        double ensuiteBathroom=4;

        double price= 0;

        for (Facilities facilities : facilities) {
            if (facilities.name().equalsIgnoreCase(Facilities.SWIMMING_POOL.name())) {
                price = price + swimmingPrice;
            } else if (facilities.name().equalsIgnoreCase(Facilities.LATE_CHECKOUT.name())) {
                price = price + lateCheckPrice;
            } else if (facilities.name().equalsIgnoreCase(Facilities.INTERNET.name())) {
                price = price + internetPrice;
            }else if(facilities.name().equalsIgnoreCase(Facilities.ROOM_BREAKFAST.name())){
                price=price+roomBreakFastPrice;
            }else if (facilities.name().equalsIgnoreCase(Facilities.ENSUITE_BATHROOM.name())){
                price=price+ensuiteBathroom;
            }

        }

        return price;


    }

}
