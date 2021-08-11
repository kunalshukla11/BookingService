package com.booking.price;

import model.Room;

public class PriceCalculatorImpl implements PriceCalculator {


    @Override
    public double getPrice(Room room) {
       return room.calculateRoomCost();
    }
}
