package model;

public enum Facilities {
    SWIMMING_POOL("swimming pool"),
    ENSUITE_BATHROOM("ensuite bathroom"),
    ROOM_BREAKFAST("room breakfast"),
    INTERNET("internet"),
    LATE_CHECKOUT("late checkout");

    public String value;

    Facilities(String value){

        this.value= value;
    }

    public static String getFacilityName(Facilities facilities){
        return facilities.name();
    }

    public static String getFacilityValue(Facilities facilities){
        return facilities.value;
    }
}
