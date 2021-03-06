/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.gui;

import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 *
 * @author Vladko
 */
public class EmptyRoomsFrame extends javax.swing.JFrame {
    
    private EmptyRoomsTableModel roomTable;
    protected LocalDate from;
    protected LocalDate to;
    /**
     * Creates new form RoomFrame
     */
    public EmptyRoomsFrame(EmptyRoomsTableModel roomTable,LocalDate from,LocalDate to) {
        this.from = from;
        this.to=to;
        initComponents();
        this.roomTable = roomTable;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmptyRooms = new javax.swing.JTable();
        jBtnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableEmptyRooms.setModel(new EmptyRoomsTableModel(from,to));
        jTableEmptyRooms.getColumnModel().getColumn(0).setMinWidth(0);
        jTableEmptyRooms.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableEmptyRooms.getColumnModel().getColumn(0).setWidth(0);
        jScrollPane1.setViewportView(jTableEmptyRooms);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("texts"); // NOI18N
        jBtnClose.setText(bundle.getString("cancel")); // NOI18N
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnClose)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnClose))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed
         this.dispose();
    }//GEN-LAST:event_jBtnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmptyRooms;
    // End of variables declaration//GEN-END:variables
}
