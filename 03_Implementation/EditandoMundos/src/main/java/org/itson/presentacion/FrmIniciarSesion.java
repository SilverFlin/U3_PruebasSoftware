package org.itson.presentacion;

import javax.persistence.NoResultException;
import org.itson.dominio.Usuario;
import org.itson.repositories.UsuariosRepository;
import org.itson.utils.Dialogs;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import org.itson.utils.Encriptador;
import org.itson.utils.FormUtils;
import static org.itson.utils.ValidacionesForms.isValidText;

/**
 *
 * @author Toled
 */
public class FrmIniciarSesion extends javax.swing.JFrame {

    private UnitOfWork unitOfWork;
    private Usuario usuarioLoggeado;

    public FrmIniciarSesion() {
        initComponents();
        unitOfWork = new UnitOfWork();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        campoTextoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        campoTextoContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        txtIniciarSesion = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();

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
        lblBienvenido.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblBienvenido)
                .addContainerGap(30, Short.MAX_VALUE))
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

        btnIniciarSesion.setBackground(new java.awt.Color(0, 102, 204));
        btnIniciarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        Background.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 90, 30));

        txtIniciarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        txtIniciarSesion.setText("Iniciar sesion");
        Background.add(txtIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

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
        Background.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 90, 30));

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
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        this.iniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void campoTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuarioActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        this.registrarse();
    }//GEN-LAST:event_btnRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPasswordField campoTextoContraseña;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel txtIniciarSesion;
    // End of variables declaration//GEN-END:variables

    private void iniciarSesion() {
        if (!this.validarCampos()) {
            return;
        }

        try {
            this.intentarInicioSesion();
        } catch (NoResultException e) {
            mostrarMensajeError(rootPane, "No se encontró el usuario");
        }
    }

    private boolean validarCampos() {
        if (!isValidText(campoTextoUsuario.getText())) {
            mostrarMensajeError(this, "Ingrese un nombre de usuario valido!");
            return false;
        }

        if (!isValidText(new String(campoTextoContraseña.getPassword()))) {
            Dialogs.mostrarMensajeError(this, "Ingrese una contraseña valida!");
            return false;
        }
        return true;
    }

    private void intentarInicioSesion() {
        UsuariosRepository usuariosRepository = unitOfWork.usuariosRepository();
        String intentoPassword = new String(this.campoTextoContraseña.getPassword());
        Usuario usuario = usuariosRepository.obtenPorUsername(campoTextoUsuario.getText());
        if (!Encriptador.verificarPasswordConHash(intentoPassword, usuario.getPassword())) {
            Dialogs.mostrarMensajeError(rootPane, "Credenciales inválidas");
            return;
        }
        this.usuarioLoggeado = usuario;

        this.cargarMenuPrincipal();
    }

    private void cargarMenuPrincipal() {
        MenuPrincipalForm menuPrincipal = new MenuPrincipalForm(usuarioLoggeado);
        FormUtils.cargarForm(menuPrincipal, this);
    }

    private void registrarse() {
        this.cargarRegistroCliente();
    }

    private void cargarRegistroCliente() {
//        FrmRegistroCliente frmRegistroCliente = new FrmRegistroCliente(usuarioLoggeado);
//        frmRegistroCliente.setVisible(true);
//        this.dispose();
    }
}
