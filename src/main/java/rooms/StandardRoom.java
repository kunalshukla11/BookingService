package rooms;

import com.booking.store.FacilitiesStore;
import model.Facilities;
import model.Room;
import model.RoomType;

import java.util.ArrayList;

public class StandardRoom extends Room {


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



    public StandardRoom(){
        roomType=RoomType.STANDARD;

    }

    @Override
    public   double calculateRoomCost(){
        if(facilities.size()<=3){
            return 3* facilities.size();
        }
        else {
            double remainingFacilities= facilities.size()-3;
            return remainingFacilities * 6 + 9;
        }
    }


}
