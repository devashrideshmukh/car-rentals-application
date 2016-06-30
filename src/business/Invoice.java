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
public class Invoice {

    private ArrayList<InvoiceItem> listOfBilledItems;

    public Invoice() {
        listOfBilledItems = new ArrayList<>();
    }

    public InvoiceItem addInvoiceItem() {
        InvoiceItem invoiceItem = new InvoiceItem();
        listOfBilledItems.add(invoiceItem);
        return invoiceItem;
    }

    public ArrayList<InvoiceItem> getListOfBilledItems() {
        return listOfBilledItems;
    }

    public void setListOfBilledItems(ArrayList<InvoiceItem> listOfBilledItems) {
        this.listOfBilledItems = listOfBilledItems;
    }

}
