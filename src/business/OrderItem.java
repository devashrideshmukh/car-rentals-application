/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Devashri
 */
public class OrderItem{
    
    private Vehicle vehicle;
    private int noOfDays;
    private int orderItemId;
    private static int count =0;
    private int noOfHoursPerDayForJetSKi;
    private boolean isOffRoad;
    private ArrayList<Date> datesBooked;
    
    public OrderItem() {
        count++;
        orderItemId = count;
        noOfHoursPerDayForJetSKi=0;
        isOffRoad = false;
        datesBooked = new ArrayList<Date>();
    }

    public ArrayList<Date> getDatesBooked() {
        return datesBooked;
    }

    public boolean isIsOffRoad() {
        return isOffRoad;
    }

    public void setIsOffRoad(boolean isOffRoad) {
        this.isOffRoad = isOffRoad;
    }

    public void setDatesBooked(ArrayList<Date> datesBooked) {
        this.datesBooked = datesBooked;
    }
     
    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getNoOfHoursPerDayForJetSKi() {
        return noOfHoursPerDayForJetSKi;
    }

    public void setNoOfHoursPerDayForJetSKi(int noOfHoursPerDayForJetSKi) {
        this.noOfHoursPerDayForJetSKi = noOfHoursPerDayForJetSKi;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return String.valueOf(orderItemId);
    }
    
}
