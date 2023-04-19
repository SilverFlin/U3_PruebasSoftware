package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.controladores.ControladorAutor;
import org.itson.controladores.ControladorUsuario;
import org.itson.dominio.Autor;
import org.itson.dominio.Cliente;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.NombreCompleto;
import org.itson.dominio.Usuario;
import org.itson.utils.Dialogs;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import org.itson.utils.FormUtils;
import static org.itson.utils.Validaciones.isInteger;
import static org.itson.utils.ValidacionesForms.isMismaPassword;
import static org.itson.utils.ValidacionesForms.isValidEmail;
import static org.itson.utils.ValidacionesForms.isValidTelefono;
import static org.itson.utils.ValidacionesForms.isValidText;

/**
 *
 * @author Toled
 */
public class FrmRegistroCliente extends javax.swing.JFrame {

    private UnitOfWork uw;
    private Cliente clienteRegistrado;
    private JFrame frmAnterior;
    private static final Logger LOG = Logger.getLogger(FrmRegistroCliente.class.getName());

    public FrmRegistroCliente(JFrame frmAnterior) {
        initComponents();
        uw = new UnitOfWork();
        this.frmAnterior = frmAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblApellidoMaterno = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtApellidoPaterno = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        lblEdad1 = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombres2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        lblNombres3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator9 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        lblNombres4 = new javax.swing.JLabel();
        cBoxIsAutor = new javax.swing.JCheckBox();
        lblNombres5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblTitulo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registro Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(315, 315, 315))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 90));

        txtApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoMaterno.setToolTipText("");
        txtApellidoMaterno.setBorder(null);
        Background.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, 10));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 180, 20));

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
        Background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 204));
        btnRegistrarse.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 70, 30));

        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setToolTipText("");
        txtNombres.setBorder(null);
        Background.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 190, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 190, 10));

        txtApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoPaterno.setToolTipText("");
        txtApellidoPaterno.setBorder(null);
        Background.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 190, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 190, 10));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 180, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 180, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 190, 10));

        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(null);
        Background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 190, 20));

        lblEdad1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblEdad1.setText("Teléfono");
        Background.add(lblEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        lblNombres1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres1.setText("Usuario");
        Background.add(lblNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 20));

        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        Background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 190, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 190, 10));

        lblNombres2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres2.setText("Contraseña");
        Background.add(lblNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 180, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 190, 10));

        txtConfirmPassword.setText("jPasswordField1");
        txtConfirmPassword.setBorder(null);
        Background.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 190, 10));

        lblNombres3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres3.setText("Confirmar Contraseña");
        Background.add(lblNombres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 180, 20));

        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        Background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 20));
        Background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 10));

        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.setToolTipText("");
        txtEmail.setBorder(null);
        Background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 20));

        lblNombres4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres4.setText("Correo Electrónico");
        Background.add(lblNombres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 180, 20));

        cBoxIsAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cBoxIsAutor.setText("¿Es Autor?");
        cBoxIsAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxIsAutorActionPerformed(evt);
            }
        });
        Background.add(cBoxIsAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres5.setText("Dirección");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 180, 20));

        txtDireccion.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccion.setToolTipText("");
        txtDireccion.setBorder(null);
        Background.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 190, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 190, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Inicia el proceso de login
     *
     * @param evt Evento que lo acciona
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        this.registrarCliente();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void cBoxIsAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxIsAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxIsAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox cBoxIsAutor;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblNombres2;
    private javax.swing.JLabel lblNombres3;
    private javax.swing.JLabel lblNombres4;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void registrarCliente() {
        if (!validarCampos()) {
            return;
        }

        this.clienteRegistrado = crearClienteDeCampos();

        if (this.cBoxIsAutor.isSelected()) {
            this.cargarRegistroAutor();
        } else {
            this.guardarCliente();
        }

    }

    private boolean validarCampos() {

        String usuario = txtUsuario.getText();
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());
        String confirmPassword = new String(txtConfirmPassword.getPassword());
        String nombres = txtNombres.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String telefono = txtTelefono.getText();
        // TODO hacer objeto direccion
        String direccion = txtDireccion.getText();

        if (!isValidText(usuario)) {
            mostrarMensajeError(this, "Ingrese un usuario valido");
            return false;
        }

        if (!isValidEmail(email)) {
            mostrarMensajeError(this, "Ingrese un correo valido");
            return false;
        }

        if (!isValidText(nombres)) {
            mostrarMensajeError(this, "Ingrese un nombre valido!");
            return false;
        }

        if (!isMismaPassword(password, confirmPassword)) {
            mostrarMensajeError(this, "Contraseñas no coinciden!");
            return false;

        }

        if (!isValidText(apellidoPaterno)) {
            mostrarMensajeError(this, "Ingrese un apellido paterno valido!");
            return false;
        }

        if (!isValidText(apellidoMaterno)) {
            mostrarMensajeError(this, "Ingrese un apellido materno valido!");
            return false;
        }

        if (!isValidTelefono(telefono)) {
            mostrarMensajeError(this, "Ingrese un teléfono válido");
            return false;
        }

        if (!isValidText(direccion)) {
            mostrarMensajeError(this, "Ingrese una dirección valido!");
            return false;
        }

        return true;

    }

    private Cliente crearClienteDeCampos() {
        String username = txtUsuario.getText();
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());
        String nombres = txtNombres.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String telefono = txtTelefono.getText();
        // TODO hacer objeto direccion
        String direccion = txtDireccion.getText();

        Usuario usuario = new Usuario(username, password);
        NombreCompleto nombreCompleto = new NombreCompleto(nombres, apellidoPaterno, apellidoMaterno);
        return new Cliente(usuario, nombreCompleto, email, telefono, direccion);

    }

    private void cargarRegistroAutor() {
//        FrmRegistroAutor frmRegistroAutor(this,this.clienteRegistrado);
//        FormUtils.cargarForm(frmRegistroAutor, this);
    }

    private void guardarCliente() {
        try {
            ControladorUsuario.persistirCliente(this.clienteRegistrado);
            Dialogs.mostrarMensajeExito(this, "Cliente guardado con exito.");
            this.regresar();
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error al persistir cliente.");
        }
    }

}
