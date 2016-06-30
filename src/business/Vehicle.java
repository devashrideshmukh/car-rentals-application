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
public class Vehicle {
    
    private String vehicleType;
    private String vehicleId;
    private boolean isOffRoad = false;
    private boolean driverNeeded = false;
    private boolean packageWanted = false;
    private static int count = 0;

    public Vehicle() {
        count++;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("VEH");
        stringBuffer.append(count);
        isOffRoad = false;
        driverNeeded = false;
        packageWanted = false;
        vehicleId=stringBuffer.toString();
    }
    
    public double findAmountPerDay(int dayOfWeek,int age,int noOfHoursPerDay){
        
         double amount = 0;
         switch (vehicleId) {
            case "VEH1"://midsize car
                        amount = midSizeCarRate(dayOfWeek);
                        break;
            case "VEH2"://economy car
                        amount = midSizeCarRate(dayOfWeek)/2;
                        break;
            case "VEH3"://SUV
                        amount= midSizeCarRate(dayOfWeek)+(midSizeCarRate(dayOfWeek)*0.50);
                        if(this.isIsOffRoad()){
                        amount = amount + 15;
                        }
                        break;
            case "VEH4"://Limousine
                        amount =100;
                        if(this.isPackageWanted()){
                            amount = amount +75;
                        }
                        
                        if(this.driverNeeded){
                            amount = amount+150;
                        }
                        
                        if(dayOfWeek==6 || dayOfWeek==7){
                            amount = amount + (amount * 0.40);
                        }else if(dayOfWeek==1){
                            amount = 100;
                        }
                        break;
            case "VEH5"://Luxury car
                        amount = 2*midSizeCarRate(dayOfWeek);
                        break; 
            case "VEH6"://bicycle
                        amount = 10;
                        break;
            case "VEH7"://scooter
                        amount = 25;   
                        break;
            case "VEH8"://motor cycle
                        amount = midSizeCarRate(dayOfWeek);
                        if(18<=age && age<=25){
                          amount = amount+50;
                        }else if(26<=age && age<=32){
                          amount = amount+35;
                        }else if(33<=age && age<=45){
                          amount = amount+15;
                        }
                        break;
            case "VEH9"://jet ski
                        amount = 25 * noOfHoursPerDay; 
                        break;
            
        }
         
        return amount; 
    }

    public boolean isIsOffRoad() {
        return isOffRoad;
    }

    public void setIsOffRoad(boolean isOffRoad) {
        this.isOffRoad = isOffRoad;
    }
    
    public double midSizeCarRate(int dayOfWeek){
        double baseRate = 30;
            if(dayOfWeek==6 || dayOfWeek==7){
                baseRate = baseRate + (baseRate * 0.25);
            }else if(dayOfWeek==1){
                baseRate = baseRate - (baseRate * 0.20);
            }
        return baseRate;
    }

    public boolean isDriverNeeded() {
        return driverNeeded;
    }

    public void setDriverNeeded(boolean driverNeeded) {
        this.driverNeeded = driverNeeded;
    }

    public boolean isPackageWanted() {
        return packageWanted;
    }

    public void setPackageWanted(boolean packageWanted) {
        this.packageWanted = packageWanted;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
       return vehicleId;
    }
    
}
