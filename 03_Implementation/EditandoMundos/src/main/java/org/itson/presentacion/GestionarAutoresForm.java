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
public class GestionarAutoresForm extends javax.swing.JFrame {

    private Usuario usuarioLoggeado;
    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(GestionarAutoresForm.class.getName());

    private final JFrame frmAnterior;
    private AutoresForm autoresForm;
    private AgregarAutorForm agregarAutorForm;
    private EliminarAutoresForm eliminarAutoresForm;
    private EditarAutoresForm editarAutoresForm;

    public GestionarAutoresForm(JFrame frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
//        cargarImagen();
        initFormsConectados();
        this.frmAnterior = frmAnterior;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        btnAgregarAutor = new javax.swing.JButton();
        btnConsultarAutores = new javax.swing.JButton();
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
        txtBienvenida.setText("Autores");

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
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(txtBienvenida)
                .addGap(166, 166, 166)
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

        btnEditarAutor.setBackground(new java.awt.Color(0, 102, 255));
        btnEditarAutor.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEditarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAutor.setText("Editar");
        btnEditarAutor.setBorder(null);
        btnEditarAutor.setBorderPainted(false);
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });
        background3.add(btnEditarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 40));

        btnEliminarAutor.setBackground(new java.awt.Color(0, 102, 255));
        btnEliminarAutor.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEliminarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAutor.setText("Eliminar");
        btnEliminarAutor.setBorder(null);
        btnEliminarAutor.setBorderPainted(false);
        btnEliminarAutor.setMaximumSize(new java.awt.Dimension(153, 20));
        btnEliminarAutor.setMinimumSize(new java.awt.Dimension(153, 20));
        btnEliminarAutor.setPreferredSize(new java.awt.Dimension(153, 20));
        btnEliminarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutorActionPerformed(evt);
            }
        });
        background3.add(btnEliminarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 40));

        btnAgregarAutor.setBackground(new java.awt.Color(0, 102, 255));
        btnAgregarAutor.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAgregarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAutor.setText("Agregar");
        btnAgregarAutor.setBorder(null);
        btnAgregarAutor.setBorderPainted(false);
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });
        background3.add(btnAgregarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 40));

        btnConsultarAutores.setBackground(new java.awt.Color(0, 102, 255));
        btnConsultarAutores.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnConsultarAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarAutores.setText("Consultar");
        btnConsultarAutores.setBorder(null);
        btnConsultarAutores.setBorderPainted(false);
        btnConsultarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAutoresActionPerformed(evt);
            }
        });
        background3.add(btnConsultarAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 40));

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

    private void btnEliminarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutorActionPerformed
        this.cargarEliminarAutoresForm();
    }//GEN-LAST:event_btnEliminarAutorActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        this.cargarEditarAutoresForm();
    }//GEN-LAST:event_btnEditarAutorActionPerformed


    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        this.cargarAgregarAutorForm();
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnConsultarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAutoresActionPerformed
        this.cargarConsularAutoresForm();
    }//GEN-LAST:event_btnConsultarAutoresActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultarAutores;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnEliminarAutor;
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
    
    private void cargarConsularAutoresForm(){
        this.autoresForm.cargarTablaAutores();
        FormUtils.cargarForm(this.autoresForm, this);
    }

    private void cargarAgregarAutorForm(){
        FormUtils.cargarForm(this.agregarAutorForm, this);
    }
    
    private void initFormsConectados() {
        autoresForm = new AutoresForm(this, this.usuarioLoggeado);
        agregarAutorForm = new AgregarAutorForm(this, this.usuarioLoggeado);
        eliminarAutoresForm = new EliminarAutoresForm(this, usuarioLoggeado);
        editarAutoresForm = new EditarAutoresForm(this, usuarioLoggeado);
    }
    
    private void cargarEliminarAutoresForm(){
        this.eliminarAutoresForm.cargarTablaPublicaciones();
        FormUtils.cargarForm(this.eliminarAutoresForm, this);
    }
    
    private void cargarEditarAutoresForm(){
        this.editarAutoresForm.cargarTablaPublicaciones();
        FormUtils.cargarForm(this.editarAutoresForm, this);
    }

}
