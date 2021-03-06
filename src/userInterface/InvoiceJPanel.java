/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Invoice;
import business.InvoiceItem;
import business.Vehicle;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Devashri
 */
public class InvoiceJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Invoice invoice;
    private double totalAmount;
    /**
     * Creates new form InvoiceJPanel
     */
    public InvoiceJPanel(JPanel userProcessContainer,Invoice invoice,double totalAmount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.invoice=invoice;
        this.totalAmount=totalAmount;
        grandTotal.setText(String.valueOf(totalAmount));
        populateInvoiceTable();
    }
    
    public void populateInvoiceTable(){
         DefaultTableModel dtm = (DefaultTableModel)invoiceTable.getModel();
        dtm.setRowCount(0);
        for(InvoiceItem item : invoice.getListOfBilledItems()){
            System.out.print(item.getItemName());
            Object[] row = new Object[4];
            row[0] = item.getItemName();
            row[1] = item.getFromDate();
            row[2] = item.getToDate();
            row[3] = item.getItemAmount();
            dtm.addRow(row);
        }  
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        grandTotal = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vehicle Type", "From Date", "To Date", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(invoiceTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Invoice");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Grand Total:");

        grandTotal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel grandTotal;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
