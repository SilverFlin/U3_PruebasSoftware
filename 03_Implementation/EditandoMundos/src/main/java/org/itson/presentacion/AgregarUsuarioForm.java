package org.itson.presentacion;

import org.itson.controladores.ControladorAdministrador;
import org.itson.controladores.ControladorCliente;
import org.itson.dominio.Usuario;
import org.itson.utils.Dialogs;
import org.itson.utils.ValidacionesForms;

/**
 *
 * @author Toled
 */
public class AgregarUsuarioForm extends javax.swing.JFrame {

    private Usuario usuarioLoggeado;
    private MenuPrincipalForm menuPrincipalForm;
    private final int RADIO_USUARIO_CLIENTE = 0;
    private final int RADIO_USUARIO_ADMIN = 1;    
    
    public AgregarUsuarioForm(Usuario usuarioLoggeado) {
        initComponents();
        this.usuarioLoggeado = usuarioLoggeado;
        this.menuPrincipalForm = new MenuPrincipalForm(this.usuarioLoggeado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnGroupTipoUsuario = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        campoTextoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        campoTextoContraseña = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        radioUsuarioCliente = new javax.swing.JRadioButton();
        radioUsuarioAdministrador = new javax.swing.JRadioButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblBienvenido.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Agregar Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        campoTextoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario.setToolTipText("");
        campoTextoUsuario.setBorder(null);
        campoTextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuarioActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 10));

        lblCorreo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblCorreo.setText("Usuario");
        Background.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 190, 10));

        lblContraseña.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");
        Background.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        campoTextoContraseña.setBorder(null);
        Background.add(campoTextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, 20));

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

        btnAgregar.setBackground(new java.awt.Color(0, 102, 204));
        btnAgregar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Background.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 70, 30));

        btnGroupTipoUsuario.add(radioUsuarioCliente);
        radioUsuarioCliente.setMnemonic(RADIO_USUARIO_CLIENTE);
        radioUsuarioCliente.setSelected(true);
        radioUsuarioCliente.setText("Usuario Cliente");
        radioUsuarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsuarioClienteActionPerformed(evt);
            }
        });
        Background.add(radioUsuarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnGroupTipoUsuario.add(radioUsuarioAdministrador);
        radioUsuarioAdministrador.setMnemonic(RADIO_USUARIO_ADMIN);
        radioUsuarioAdministrador.setText("Usuario Administrador");
        radioUsuarioAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUsuarioAdministradorActionPerformed(evt);
            }
        });
        Background.add(radioUsuarioAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
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

    private void campoTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuarioActionPerformed

    }//GEN-LAST:event_campoTextoUsuarioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!validarCampos()) {
            return;
        }        
        
        String nombreUsuario = campoTextoUsuario.getText();
        String contraseña = new String(campoTextoContraseña.getPassword());
        
        int tipoUsuario = btnGroupTipoUsuario.getSelection().getMnemonic();
        
        try{
            switch (tipoUsuario) {
                case RADIO_USUARIO_CLIENTE -> {
                    ControladorCliente.persistirCliente(nombreUsuario, contraseña);
                    Dialogs.mostrarMensajeExito(this, "Usuario guardado con exito");
                    break;
                }        
                case RADIO_USUARIO_ADMIN -> {
                    ControladorAdministrador.persistirAdministrador(nombreUsuario, contraseña);
                    Dialogs.mostrarMensajeExito(this, "Usuario guardado con exito");
                    break;
                }
                default -> throw new IllegalArgumentException();
            }
        }catch(Exception e){
            Dialogs.mostrarMensajeError(this, "No se pudo guardar el usuario.");
        }finally{
            limpiarCampos();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void radioUsuarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsuarioClienteActionPerformed
     
    }//GEN-LAST:event_radioUsuarioClienteActionPerformed

    private void radioUsuarioAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUsuarioAdministradorActionPerformed

    }//GEN-LAST:event_radioUsuarioAdministradorActionPerformed
    
    private boolean validarCampos(){
        String nombreUsuario = campoTextoUsuario.getText();
        String contraseña = new String(campoTextoContraseña.getPassword());
        
        if(!ValidacionesForms.isValidText(nombreUsuario)){
            Dialogs.mostrarMensajeError(this, "Ingrese un nombre de usuario valido!");
            return false;
        }
        else if (!ValidacionesForms.isValidText(contraseña)) {
            Dialogs.mostrarMensajeError(this, "Ingrese una contraseña valida!");
            return false;
        }
        else{
            return true;
        } 
    }
    
    private void limpiarCampos(){
        campoTextoContraseña.setText("");
        campoTextoUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup btnGroupTipoUsuario;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPasswordField campoTextoContraseña;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JRadioButton radioUsuarioAdministrador;
    private javax.swing.JRadioButton radioUsuarioCliente;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        menuPrincipalForm.setVisible(true);
        this.setVisible(false);
    }
}
