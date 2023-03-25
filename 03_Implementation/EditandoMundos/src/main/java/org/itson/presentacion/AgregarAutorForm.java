package org.itson.presentacion;


import org.itson.dominio.Usuario;
import org.itson.utils.Dialogs;
import org.itson.utils.ValidacionesForms;
import org.itson.utils.Validaciones;
/**
 *
 * @author Toled
 */
public class AgregarAutorForm extends javax.swing.JFrame {

    private UnitOfWork uw;
    private Usuario usuarioLoggeado;
    private MenuPrincipalForm menuPrincipalForm;

    public AgregarAutorForm(Usuario usuarioLoggeado) {
        initComponents();
        uw = new UnitOfWork();
        this.usuarioLoggeado = usuarioLoggeado;
        this.menuPrincipalForm = new MenuPrincipalForm(this.usuarioLoggeado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        campoTextoNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        comboBoxNacionalidad = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        campoTextoEdad = new javax.swing.JTextField();

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
        lblBienvenido.setText("Agregar Autor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        campoTextoNombre.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoNombre.setToolTipText("");
        campoTextoNombre.setBorder(null);
        campoTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombreActionPerformed(evt);
            }
        });
        Background.add(campoTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 10));

        lblNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 20));

        lblNacionalidad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");
        Background.add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

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

        lblEdad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblEdad.setText("Edad");
        Background.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        comboBoxNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNacionalidadActionPerformed(evt);
            }
        });
        Background.add(comboBoxNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, -1));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, 10));

        campoTextoEdad.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoEdad.setToolTipText("");
        campoTextoEdad.setBorder(null);
        campoTextoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoEdadActionPerformed(evt);
            }
        });
        Background.add(campoTextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 20));

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

    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!ValidacionesForms.isValidText(campoTextoNombre.getText())) {
            Dialogs.mostrarMensajeError(this, "Ingrese un nombre valido!");
        }
        else if (!Validaciones.isInteger(campoTextoEdad.getText())) {
            Dialogs.mostrarMensajeError(this, "Ingrese una edad valida!");
        }
        else{
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboBoxNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNacionalidadActionPerformed

    private void campoTextoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoEdad;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JComboBox<String> comboBoxNacionalidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        menuPrincipalForm.setVisible(true);
        this.setVisible(false);
    }
}
