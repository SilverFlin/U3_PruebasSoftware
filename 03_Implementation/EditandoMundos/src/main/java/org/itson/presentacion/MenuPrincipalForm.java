package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Elkur
 */
public class MenuPrincipalForm extends javax.swing.JFrame {

    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(MenuPrincipalForm.class.getName());

    public MenuPrincipalForm() {
        initComponents();
//        cargarImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnEditarCuenta = new javax.swing.JButton();
        btnHistorialActividad = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnMisCuentas = new javax.swing.JButton();
        imgMenuPrincipal = new javax.swing.JLabel();
        btnCrearCuentaBancaria1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BancoTransacciones");
        setResizable(false);

        background3.setBackground(new java.awt.Color(255, 255, 255));
        background3.setMaximumSize(new java.awt.Dimension(600, 400));
        background3.setMinimumSize(new java.awt.Dimension(600, 400));
        background3.setPreferredSize(new java.awt.Dimension(600, 400));
        background3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head3.setBackground(new java.awt.Color(0, 102, 255));

        txtBienvenida.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        txtBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenida.setText("Bienvenido");

        btnCerrarSesion.setBackground(new java.awt.Color(0, 102, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnEditarCuenta.setBackground(new java.awt.Color(0, 102, 255));
        btnEditarCuenta.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEditarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCuenta.setText("Editar Cuenta");
        btnEditarCuenta.setBorder(null);
        btnEditarCuenta.setBorderPainted(false);
        btnEditarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout head3Layout = new javax.swing.GroupLayout(head3);
        head3.setLayout(head3Layout);
        head3Layout.setHorizontalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(btnEditarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienvenida)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        btnHistorialActividad.setBackground(new java.awt.Color(0, 102, 255));
        btnHistorialActividad.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnHistorialActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialActividad.setText("Historial Actividad");
        btnHistorialActividad.setBorder(null);
        btnHistorialActividad.setBorderPainted(false);
        btnHistorialActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActividadActionPerformed(evt);
            }
        });
        background3.add(btnHistorialActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 120, 40));

        btnTransferencia.setBackground(new java.awt.Color(0, 102, 255));
        btnTransferencia.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setText("Transferencia");
        btnTransferencia.setBorder(null);
        btnTransferencia.setBorderPainted(false);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        background3.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, 40));

        btnMisCuentas.setBackground(new java.awt.Color(0, 102, 255));
        btnMisCuentas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnMisCuentas.setForeground(new java.awt.Color(255, 255, 255));
        btnMisCuentas.setText("Mis Cuentas");
        btnMisCuentas.setBorder(null);
        btnMisCuentas.setBorderPainted(false);
        btnMisCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisCuentasActionPerformed(evt);
            }
        });
        background3.add(btnMisCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, 40));
        background3.add(imgMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 600, 240));

        btnCrearCuentaBancaria1.setBackground(new java.awt.Color(0, 102, 255));
        btnCrearCuentaBancaria1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCrearCuentaBancaria1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuentaBancaria1.setText("Crear Cuenta");
        btnCrearCuentaBancaria1.setBorder(null);
        btnCrearCuentaBancaria1.setBorderPainted(false);
        btnCrearCuentaBancaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaBancaria1ActionPerformed(evt);
            }
        });
        background3.add(btnCrearCuentaBancaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMisCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisCuentasActionPerformed
    }//GEN-LAST:event_btnMisCuentasActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed

    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnHistorialActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActividadActionPerformed
    }//GEN-LAST:event_btnHistorialActividadActionPerformed


    private void btnCrearCuentaBancaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaBancaria1ActionPerformed
    }//GEN-LAST:event_btnCrearCuentaBancaria1ActionPerformed


    private void btnEditarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCuentaActionPerformed
    }//GEN-LAST:event_btnEditarCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearCuentaBancaria1;
    private javax.swing.JButton btnEditarCuenta;
    private javax.swing.JButton btnHistorialActividad;
    private javax.swing.JButton btnMisCuentas;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel imgMenuPrincipal;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

}
