package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.itson.dominio.Administrador;
import org.itson.dominio.Usuario;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class ConsultarPublicacionesForm extends javax.swing.JFrame {

    private Usuario usuarioLoggeado;
    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(ConsultarPublicacionesForm.class.getName());

    private final JFrame frmAnterior;
    private PublicacionesForm consultarForm;

    public ConsultarPublicacionesForm(JFrame frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
//        cargarImagen();
//        initFormsConectados();
        this.consultarForm = new PublicacionesForm(this, this.usuarioLoggeado);
        this.frmAnterior = frmAnterior;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnConsultarFechaEntrega = new javax.swing.JButton();
        btnConsultarTodas = new javax.swing.JButton();
        btnConsultarPendientesPago = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnConsultarTipo = new javax.swing.JButton();
        btnConsultarPagadas1 = new javax.swing.JButton();

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
        txtBienvenida.setText("Consultar Publicaciones");

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
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(txtBienvenida)
                .addGap(66, 66, 66)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBienvenida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        btnConsultarFechaEntrega.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarFechaEntrega.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarFechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarFechaEntrega.setText("Consultar Fecha Entrega");
        btnConsultarFechaEntrega.setBorder(null);
        btnConsultarFechaEntrega.setBorderPainted(false);
        btnConsultarFechaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFechaEntregaActionPerformed(evt);
            }
        });
        background3.add(btnConsultarFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 40));

        btnConsultarTodas.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarTodas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarTodas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarTodas.setText("Consultar Todas");
        btnConsultarTodas.setBorder(null);
        btnConsultarTodas.setBorderPainted(false);
        btnConsultarTodas.setMaximumSize(new java.awt.Dimension(153, 20));
        btnConsultarTodas.setMinimumSize(new java.awt.Dimension(153, 20));
        btnConsultarTodas.setPreferredSize(new java.awt.Dimension(153, 20));
        btnConsultarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTodasActionPerformed(evt);
            }
        });
        background3.add(btnConsultarTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, 40));

        btnConsultarPendientesPago.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarPendientesPago.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarPendientesPago.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPendientesPago.setText("Consultar Pendientes Pago");
        btnConsultarPendientesPago.setBorder(null);
        btnConsultarPendientesPago.setBorderPainted(false);
        btnConsultarPendientesPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPendientesPagoActionPerformed(evt);
            }
        });
        background3.add(btnConsultarPendientesPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 180, 40));

        btnRegresar.setBackground(new java.awt.Color(0, 102, 204));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        background3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        btnConsultarTipo.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarTipo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarTipo.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarTipo.setText("Consultar Tipo");
        btnConsultarTipo.setBorder(null);
        btnConsultarTipo.setBorderPainted(false);
        btnConsultarTipo.setMaximumSize(new java.awt.Dimension(153, 20));
        btnConsultarTipo.setMinimumSize(new java.awt.Dimension(153, 20));
        btnConsultarTipo.setPreferredSize(new java.awt.Dimension(153, 20));
        btnConsultarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTipoActionPerformed(evt);
            }
        });
        background3.add(btnConsultarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 40));

        btnConsultarPagadas1.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarPagadas1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarPagadas1.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPagadas1.setText("Consultar Pagadas");
        btnConsultarPagadas1.setBorder(null);
        btnConsultarPagadas1.setBorderPainted(false);
        btnConsultarPagadas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPagadas1ActionPerformed(evt);
            }
        });
        background3.add(btnConsultarPagadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, 40));

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

    private void btnConsultarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTodasActionPerformed
        cargarConsultarTodasForm();
    }//GEN-LAST:event_btnConsultarTodasActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnConsultarFechaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFechaEntregaActionPerformed
    }//GEN-LAST:event_btnConsultarFechaEntregaActionPerformed


    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnConsultarPendientesPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPendientesPagoActionPerformed
    }//GEN-LAST:event_btnConsultarPendientesPagoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarTipoActionPerformed

    private void btnConsultarPagadas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPagadas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPagadas1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarFechaEntrega;
    private javax.swing.JButton btnConsultarPagadas1;
    private javax.swing.JButton btnConsultarPendientesPago;
    private javax.swing.JButton btnConsultarTipo;
    private javax.swing.JButton btnConsultarTodas;
    private javax.swing.JButton btnConsultarTodas1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

   
    private void cerrarSesion() {
        FormUtils.cerrarSesion(this);
    }

    private void cargarConsultarTodasForm(){
        FormUtils.cargarForm(this.consultarForm, this);
        this.consultarForm.cargarTablaPublicaciones();
    }

    private void regresar() {
        FormUtils.regresar(this.frmAnterior, this);
        
    }

    private void initFormsConectados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
