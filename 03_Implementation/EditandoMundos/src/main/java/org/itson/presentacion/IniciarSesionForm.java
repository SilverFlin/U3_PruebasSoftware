package org.itson.presentacion;

import java.util.Arrays;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.itson.dominio.Administrador;
import org.itson.dominio.Cliente;
import org.itson.dominio.Usuario;
import org.itson.repositories.UsuariosRepository;
import org.itson.utils.Dialogs;
import org.itson.utils.Encriptador;

/**
 *
 * @author Toled
 */
public class IniciarSesionForm extends javax.swing.JFrame {

    private UnitOfWork unitOfWork;

    public IniciarSesionForm() {
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
        btnIngresar = new javax.swing.JButton();
        txtIniciarSesion = new javax.swing.JLabel();

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

        btnIngresar.setBackground(new java.awt.Color(0, 102, 204));
        btnIngresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 70, 30));

        txtIniciarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        txtIniciarSesion.setText("Iniciar sesion");
        Background.add(txtIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

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
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        this.iniciarSesion();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void campoTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnIngresar;
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
        try {
            UsuariosRepository usuariosRepository = unitOfWork.usuariosRepository();
            String intentoPassword = new String(this.campoTextoContraseña.getPassword());
            Usuario usuario = usuariosRepository.obtenPorUsername(campoTextoUsuario.getText());
            System.out.println(intentoPassword + "\n" + usuario.getPassword());
            if (!Encriptador.verificarPasswordConHash(intentoPassword, usuario.getPassword())) {
                Dialogs.mostrarMensajeError(rootPane, "Credenciales inválidas");
                return;
            }

            MenuPrincipalForm menuPrincipal = new MenuPrincipalForm(false);
            menuPrincipal.setVisible(true);
            this.dispose();

        } catch (NoResultException e) {
            Dialogs.mostrarMensajeError(rootPane, "No se encontró el usuario");
            System.out.println(e);
        }
    }
}
