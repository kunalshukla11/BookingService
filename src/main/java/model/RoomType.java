package model;

public enum RoomType {
    STANDARD("Standard"),
    SUITE("Suite"),
    GREAT_VIEW("Great_View");

    public String value;

     RoomType(String value){

         this.value= value;
    }

    public static String getRoomTypeName(RoomType roomType){
         return roomType.name();
    }

    public static String getRoomTypeValue(RoomType roomType){
        return roomType.value;
    }
}
