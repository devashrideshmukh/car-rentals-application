/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Devashri
 */
public class Business {
    
    private static Business business;
    private VehicleDirectory vehicleDirectory;
    private RenterDirectory renterDirectory;
    
    //singleton design pattern
    public static Business getInstance(){
        if (business == null){
            business = new Business();
        }
        return business;
    }

    private Business() {
        vehicleDirectory = new VehicleDirectory();
        renterDirectory = new RenterDirectory();
    }

    public RenterDirectory getRenterDirectory() {
        return renterDirectory;
    }

    public VehicleDirectory getVehicleDirectory() {
        return vehicleDirectory;
    }
    
}
