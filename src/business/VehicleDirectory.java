/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Devashri
 */
public class VehicleDirectory {
    
    private ArrayList<Vehicle> listOfVehicles;

    public VehicleDirectory() {
        listOfVehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public void setListOfVehicles(ArrayList<Vehicle> listOfVehicles) {
        this.listOfVehicles = listOfVehicles;
    }
    
    public Vehicle addAVehicle(){
        Vehicle vehicle = new Vehicle();
        listOfVehicles.add(vehicle);
        return vehicle;
    }
    
    
    
}
