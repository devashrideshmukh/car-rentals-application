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
public class RenterDirectory {
     
    private ArrayList<Renter> renterList;

    public RenterDirectory() {
        renterList = new ArrayList<>();
    }

    public ArrayList<Renter> getRenterList() {
        return renterList;
    }

    public Renter addRenter(){
        Renter renter = new Renter();
        renterList.add(renter);
        return renter;
    }
}
