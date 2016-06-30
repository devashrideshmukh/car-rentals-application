/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Devashri
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private Invoice invoice;
    private boolean hasRentedSUV;
    private boolean hasAppliedSUVDiscountOnce;
    
    public Order() {
        orderItemList = new ArrayList<>();
        invoice = new Invoice();
        hasAppliedSUVDiscountOnce = false;
        hasRentedSUV =false;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public OrderItem addOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setHasAppliedSUVDiscountOnce(boolean hasAppliedSUVDiscountOnce) {
        this.hasAppliedSUVDiscountOnce = hasAppliedSUVDiscountOnce;
    }

    public void setHasRentedSUV(boolean hasRentedSUV) {
        this.hasRentedSUV = hasRentedSUV;
    }

    public boolean isHasRentedSUV() {
        return hasRentedSUV;
    }

    public boolean isHasAppliedSUVDiscountOnce() {
        return hasAppliedSUVDiscountOnce;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    public double calculateTotalAmount(int age) throws ParseException{
        
       
       
        double totalAmount = 0.0;
        
        for(OrderItem orderItem : orderItemList){
           double totalCostOfOrderItem=0.0;
            Vehicle vehicle = orderItem.getVehicle();
            
            //calculating per day amounts for each of the days booked
            for(Date date:orderItem.getDatesBooked()){
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                totalCostOfOrderItem = totalCostOfOrderItem + vehicle.findAmountPerDay(dayOfWeek, age,orderItem.getNoOfHoursPerDayForJetSKi());
            }
            
            
            if(vehicle.getVehicleId().equals("VEH6") && this.hasRentedSUV && !this.hasAppliedSUVDiscountOnce){
                totalCostOfOrderItem = 0;
                this.hasAppliedSUVDiscountOnce =true;
            }
            
            totalAmount=totalAmount+totalCostOfOrderItem;
            InvoiceItem invoiceItem = this.invoice.addInvoiceItem();
            invoiceItem.setItemAmount(totalCostOfOrderItem);
            invoiceItem.setItemName(orderItem.getVehicle().getVehicleType());
            invoiceItem.setFromDate(orderItem.getDatesBooked().get(0));
            int size = orderItem.getDatesBooked().size();
            invoiceItem.setToDate(orderItem.getDatesBooked().get(size-1));
        }
        
        return totalAmount;
    }
       
}
