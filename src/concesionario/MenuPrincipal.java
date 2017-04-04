/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumno2
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
   
    DefaultTableModel modeloCoche;
    DefaultTableModel modeloCamion;
    
    /**
     * Creates new form MenúPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        modeloCoche = new DefaultTableModel();
        modeloCamion = new DefaultTableModel();
        
        modeloCoche.setColumnIdentifiers(new String[]{"Modelo", "Marca", "Precio",
            "Kilometros", "SegundaMano"});
        
        modeloCamion.setColumnIdentifiers(new String[]{"Modelo", "Marca", "Precio",
            "Tipo", "Carga"});
        
        tablaCoche.setModel(modeloCoche);
        tablaCamion.setModel(modeloCamion);
        tablaCoche.setColumnSelectionAllowed(false);
        tablaCoche.setCellSelectionEnabled(false);
        tablaCamion.setColumnSelectionAllowed(false);
        tablaCamion.setCellSelectionEnabled(false);     
        
        System.out.println("Ha iniciado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCrear = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCoche = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCamion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCrear.setText("Crear nuevo");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.setEnabled(false);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonActualizarMousePressed(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.setEnabled(false);
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBorrarMousePressed(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        tablaCoche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Precio", "Kilometraje", "Segunda Mano"
            }
        ));
        tablaCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCocheMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCoche);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Coche", jPanel1);

        tablaCamion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Precio", "Tipo", "Carga"
            }
        ));
        tablaCamion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCamionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCamion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Camión", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
       if(tablaCoche.getSelectedRow()!=-1)
       {
           Coche c = new Coche();
           c.setModelo((String)tablaCoche.getValueAt(tablaCoche.getSelectedRow(),0));
           c.setMarca((String)tablaCoche.getValueAt(tablaCoche.getSelectedRow(),1));
           c.setPrecio((Float)tablaCoche.getValueAt(tablaCoche.getSelectedRow(),2));
           c.setKilometraje((Integer)tablaCoche.getValueAt(tablaCoche.getSelectedRow(),3));
           c.setSegundaMano((Boolean)tablaCoche.getValueAt(tablaCoche.getSelectedRow(),4));
           Menu.escribirFichero();
           Vehiculo v = (Vehiculo) c;
           CrearVehiculo diag = new CrearVehiculo(this, rootPaneCheckingEnabled, v);
           diag.setVisible(true);
           if(diag.veh != null)
           {
               Coche coche = (Coche)diag.veh;
               tablaCoche.setValueAt(coche.getModelo(), tablaCoche.getSelectedRow(), 0);
               tablaCoche.setValueAt(coche.getMarca(), tablaCoche.getSelectedRow(), 1);
               tablaCoche.setValueAt(coche.getPrecio(), tablaCoche.getSelectedRow(), 2);
               tablaCoche.setValueAt(coche.getKilometraje(), tablaCoche.getSelectedRow(), 3);
               tablaCoche.setValueAt(coche.isSegundaMano(), tablaCoche.getSelectedRow(), 4);
               
           }
       }else if(tablaCamion.getSelectedRow()!=-1)
       {
           Camion c = new Camion();
           c.setModelo((String)tablaCamion.getValueAt(tablaCamion.getSelectedRow(),0));
           c.setMarca((String)tablaCamion.getValueAt(tablaCamion.getSelectedRow(),1));
           c.setPrecio((Float)tablaCamion.getValueAt(tablaCamion.getSelectedRow(),2));
           c.setTipo((String)tablaCamion.getValueAt(tablaCamion.getSelectedRow(),3));
           c.setCarga((Integer)tablaCamion.getValueAt(tablaCamion.getSelectedRow(),4));
           Menu.escribirFichero();
           Vehiculo v = (Vehiculo) c;
           CrearVehiculo diag = new CrearVehiculo(this, rootPaneCheckingEnabled, v);
           diag.setVisible(true);
           if(diag.veh != null)
           {
               Camion camion = (Camion)diag.veh;
               tablaCoche.setValueAt(camion.getModelo(), tablaCoche.getSelectedRow(), 0);
               tablaCoche.setValueAt(camion.getMarca(), tablaCoche.getSelectedRow(), 1);
               tablaCoche.setValueAt(camion.getPrecio(), tablaCoche.getSelectedRow(), 2);
               tablaCoche.setValueAt(camion.getTipo(), tablaCoche.getSelectedRow(), 3);
               tablaCoche.setValueAt(camion.getCarga(), tablaCoche.getSelectedRow(), 4);
           }
       } 
           
           
       
       
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        CrearVehiculo diag = new CrearVehiculo(this, true);
        diag.setVisible(true);
        if(diag.veh != null){
            Menu.escribirFichero();
            if(diag.veh instanceof Coche)
            {
            Coche coche = (Coche)diag.veh;
            modeloCoche.addRow(new Object[]{coche.getModelo(), coche.getMarca(),
                coche.getPrecio(), coche.getKilometraje(), coche.isSegundaMano()});       
            }
            else if(diag.veh instanceof Camion)
            {
            Camion camion = (Camion)diag.veh;
            modeloCamion.addRow(new Object[]{camion.getModelo(), camion.getMarca(),
                camion.getPrecio(), camion.getTipo(), camion.getCarga()});       
            } 
            
        }
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMousePressed
        
    }//GEN-LAST:event_botonActualizarMousePressed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
         if(tablaCoche.getSelectedRow()!=-1)
       {
           modeloCoche.removeRow(tablaCoche.getSelectedRow());
       }else if(tablaCamion.getSelectedRow()!=-1)
       {
           modeloCamion.removeRow(tablaCamion.getSelectedRow());
       }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMousePressed
        
    }//GEN-LAST:event_botonBorrarMousePressed

    private void tablaCocheMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCocheMousePressed
       if(tablaCoche.getSelectedRow() != -1) {
            botonActualizar.setEnabled(true);
            botonBorrar.setEnabled(true);
        }else{
            botonActualizar.setEnabled(false);
            botonBorrar.setEnabled(false);
        }
    }//GEN-LAST:event_tablaCocheMousePressed

    private void tablaCamionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCamionMousePressed
        if(tablaCoche.getSelectedRow() != -1) {
            botonActualizar.setEnabled(true);
            botonBorrar.setEnabled(true);
        }else{
            botonActualizar.setEnabled(false);
            botonBorrar.setEnabled(false);
        }
    }//GEN-LAST:event_tablaCamionMousePressed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaCamion;
    private javax.swing.JTable tablaCoche;
    // End of variables declaration//GEN-END:variables
}
