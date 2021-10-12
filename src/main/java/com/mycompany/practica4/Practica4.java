/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author marti
 */
public class Practica4 extends javax.swing.JFrame{
    private int nEstelas;
    /**
     * Creates new form Practica4
     */
    public Practica4() {
        initComponents();
        setLocationRelativeTo(null); 
        /*lienzo.setBackground(Color.WHITE);
        lienzo.setForeground(Color.red);
        nEstelas=0;*/
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estelaCombo = new javax.swing.JComboBox<>();
        fondoCombo = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lienzo = new com.mycompany.practica4.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estelaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Rosa", "Naranja" }));
        estelaCombo.setToolTipText("Color estela");
        estelaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estelaComboActionPerformed(evt);
            }
        });

        fondoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Negro", "Gris", "Oro" }));
        fondoCombo.setToolTipText("Color del fondo");
        fondoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoComboActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        titleLabel.setText("¡Dibuja el rastro de tu ratón!");

        jLabel1.setText("Elige el color de la estela y fondo del lienzo: ");

        lienzo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzoMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(titleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(estelaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fondoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estelaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estelaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estelaComboActionPerformed
        int indexEstelaCol=estelaCombo.getSelectedIndex();
        switch(indexEstelaCol){
                case 0:
                    lienzo.cambiaEstela(Color.red);
                   break;
                case 1:
                    lienzo.cambiaEstela(Color.blue);
                   break;
                case 2:
                    lienzo.cambiaEstela(Color.PINK);
                   break;
                case 3:
                    lienzo.cambiaEstela(Color.orange);
                   break;
           }
        
        
    }//GEN-LAST:event_estelaComboActionPerformed

    private void fondoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoComboActionPerformed
        int indexFondoCol=fondoCombo.getSelectedIndex();
        switch(indexFondoCol){
                case 0:
                    lienzo.cambiaFondo(Color.WHITE);
                   break;
                case 1:
                    lienzo.cambiaFondo(Color.BLACK);
                   break;
                case 2:
                    lienzo.cambiaFondo(Color.GRAY);
                   break;
                case 3:
                   lienzo.cambiaFondo(new Color(255,215,0));
                   break;
           }
        
    }//GEN-LAST:event_fondoComboActionPerformed

    private void lienzoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseMoved
        lienzo.addPunto(new Point(evt.getX(), evt.getY()));
        lienzo.eliminaPunto();
        repaint();
    }//GEN-LAST:event_lienzoMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> estelaCombo;
    private javax.swing.JComboBox<String> fondoCombo;
    private javax.swing.JLabel jLabel1;
    private com.mycompany.practica4.Lienzo lienzo;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
