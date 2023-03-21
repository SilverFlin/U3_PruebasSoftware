package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Elkur
 */
public class MenuPrincipalForm extends javax.swing.JFrame {

    private boolean isAdmin;
    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(MenuPrincipalForm.class.getName());

    public MenuPrincipalForm(boolean isAdmin) {
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
        btnTransferencia = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        imgMenuPrincipal = new javax.swing.JLabel();
        btnConsultarPublicaciones = new javax.swing.JButton();
        btnTransferencia1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout head3Layout = new javax.swing.GroupLayout(head3);
        head3.setLayout(head3Layout);
        head3Layout.setHorizontalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienvenida)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        btnTransferencia.setBackground(new java.awt.Color(0, 102, 255));
        btnTransferencia.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setText("Agregar Autor");
        btnTransferencia.setBorder(null);
        btnTransferencia.setBorderPainted(false);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        background3.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 40));

        btnCotizar.setBackground(new java.awt.Color(0, 102, 255));
        btnCotizar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizar.setText("Cotizar");
        btnCotizar.setBorder(null);
        btnCotizar.setBorderPainted(false);
        btnCotizar.setMaximumSize(new java.awt.Dimension(153, 20));
        btnCotizar.setMinimumSize(new java.awt.Dimension(153, 20));
        btnCotizar.setPreferredSize(new java.awt.Dimension(153, 20));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        background3.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 40));
        background3.add(imgMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 600, 240));

        btnConsultarPublicaciones.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarPublicaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarPublicaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPublicaciones.setText("Consultar Publicaciones");
        btnConsultarPublicaciones.setBorder(null);
        btnConsultarPublicaciones.setBorderPainted(false);
        btnConsultarPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPublicacionesActionPerformed(evt);
            }
        });
        background3.add(btnConsultarPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 40));

        btnTransferencia1.setBackground(new java.awt.Color(0, 102, 255));
        btnTransferencia1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnTransferencia1.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferencia1.setText("Agregar Usuario");
        btnTransferencia1.setBorder(null);
        btnTransferencia1.setBorderPainted(false);
        btnTransferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferencia1ActionPerformed(evt);
            }
        });
        background3.add(btnTransferencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 40));

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

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
    }//GEN-LAST:event_btnCotizarActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed

    }//GEN-LAST:event_btnTransferenciaActionPerformed


    private void btnConsultarPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPublicacionesActionPerformed
    }//GEN-LAST:event_btnConsultarPublicacionesActionPerformed

    private void btnTransferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferencia1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarPublicaciones;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JButton btnTransferencia1;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel imgMenuPrincipal;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

}
