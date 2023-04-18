package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.JFrame;
import org.itson.dominio.Usuario;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmGestionarPublicaciones extends javax.swing.JFrame {

    private Usuario usuarioLoggeado;
    private FrmConsultarPublicaciones consultarPublicacionesForm;
    private FrmEliminarPublicaciones eliminarPublicacionesForm;
    private FrmEditarPublicaciones editarPublicacionesForm;
    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(FrmGestionarPublicaciones.class.getName());

    private final JFrame frmAnterior;

    public FrmGestionarPublicaciones(JFrame frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
        this.frmAnterior = frmAnterior;
        initFormsConectados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnEditarPublicacion = new javax.swing.JButton();
        btnEliminarPublicacion = new javax.swing.JButton();
        btnConsultarPublicaciones = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

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
        txtBienvenida.setText("Publicaciones");

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
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(txtBienvenida)
                .addGap(118, 118, 118)
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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        btnEditarPublicacion.setBackground(new java.awt.Color(0, 102, 255));
        btnEditarPublicacion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEditarPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPublicacion.setText("Editar");
        btnEditarPublicacion.setBorder(null);
        btnEditarPublicacion.setBorderPainted(false);
        btnEditarPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPublicacionActionPerformed(evt);
            }
        });
        background3.add(btnEditarPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 40));

        btnEliminarPublicacion.setBackground(new java.awt.Color(0, 102, 255));
        btnEliminarPublicacion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEliminarPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPublicacion.setText("Eliminar");
        btnEliminarPublicacion.setBorder(null);
        btnEliminarPublicacion.setBorderPainted(false);
        btnEliminarPublicacion.setMaximumSize(new java.awt.Dimension(153, 20));
        btnEliminarPublicacion.setMinimumSize(new java.awt.Dimension(153, 20));
        btnEliminarPublicacion.setPreferredSize(new java.awt.Dimension(153, 20));
        btnEliminarPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPublicacionActionPerformed(evt);
            }
        });
        background3.add(btnEliminarPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, 40));

        btnConsultarPublicaciones.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarPublicaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarPublicaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPublicaciones.setText("Consultar");
        btnConsultarPublicaciones.setBorder(null);
        btnConsultarPublicaciones.setBorderPainted(false);
        btnConsultarPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPublicacionesActionPerformed(evt);
            }
        });
        background3.add(btnConsultarPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 40));

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

    private void btnEliminarPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPublicacionActionPerformed
        this.cargarEliminarPublicacionesForm();
    }//GEN-LAST:event_btnEliminarPublicacionActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnEditarPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPublicacionActionPerformed
        this.cargarEditarPublicacionesForm();
    }//GEN-LAST:event_btnEditarPublicacionActionPerformed


    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPublicacionesActionPerformed
        this.cargarConsultarPublicacionesForm();
    }//GEN-LAST:event_btnConsultarPublicacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarPublicaciones;
    private javax.swing.JButton btnEditarPublicacion;
    private javax.swing.JButton btnEliminarPublicacion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

   
    private void cerrarSesion() {
        FormUtils.cerrarSesion(this);
    }


    private void regresar() {
        FormUtils.regresar(this.frmAnterior, this);
        
    }
    
    private void cargarEditarPublicacionesForm(){
        FormUtils.cargarForm(this.editarPublicacionesForm, this);
    }
    
    private void cargarConsultarPublicacionesForm(){
        FormUtils.cargarForm(this.consultarPublicacionesForm,this);
    }
    
    private void cargarEliminarPublicacionesForm(){
        FormUtils.cargarForm(this.eliminarPublicacionesForm, this);
    }

    private void initFormsConectados() {
        consultarPublicacionesForm = new FrmConsultarPublicaciones(this, usuarioLoggeado);
        eliminarPublicacionesForm = new FrmEliminarPublicaciones(this, usuarioLoggeado);
        editarPublicacionesForm = new FrmEditarPublicaciones(this, usuarioLoggeado);
    }

}
