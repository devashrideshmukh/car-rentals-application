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
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        VehicleDirectory vehicleDirectory = business.getVehicleDirectory();
        RenterDirectory renterDirectory =business.getRenterDirectory();
        
        //Motorcycles, JetSkis

        Vehicle midsizeCar = vehicleDirectory.addAVehicle();
        midsizeCar.setVehicleType("MidSize Car");
        
        Vehicle economyCar = vehicleDirectory.addAVehicle();
        economyCar.setVehicleType("Economy Car");
        
        Vehicle suv = vehicleDirectory.addAVehicle();
        suv.setVehicleType("SUV");
        
        Vehicle limousine = vehicleDirectory.addAVehicle();
        limousine.setVehicleType("Limousine");
        
        Vehicle luxuryCar = vehicleDirectory.addAVehicle();
        luxuryCar.setVehicleType("Luxury Car");
        
        Vehicle bicycles = vehicleDirectory.addAVehicle();
        bicycles.setVehicleType("Bicycle");
        
        Vehicle scooters = vehicleDirectory.addAVehicle();
        scooters.setVehicleType("Scooter");
        
        Vehicle motorCycle = vehicleDirectory.addAVehicle();
        motorCycle.setVehicleType("Motor Cycle");
        
        Vehicle jetSki = vehicleDirectory.addAVehicle();
        jetSki.setVehicleType("Jet Ski");
        
        Renter renter1 = renterDirectory.addRenter();
        renter1.setUserName("devashri");
        renter1.setRenterName("Devashri Deshmukh");
        renter1.setRenterAge(24);
        renter1.setPassword("password");
        
        return business;
    }
    
}
