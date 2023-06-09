package org.itson.presentacion;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.controladores.ControladorAutor;
import org.itson.controladores.ControladorUsuario;
import org.itson.dominio.Autor;
import org.itson.dominio.Cliente;
import org.itson.dominio.Nacionalidad;
import org.itson.dominio.Usuario;
import org.itson.utils.Dialogs;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import org.itson.utils.FormUtils;
import static org.itson.utils.Validaciones.isInteger;
import static org.itson.utils.ValidacionesForms.isValidText;

/**
 *
 * @author Toled
 */
public class FrmRegistroAutor extends javax.swing.JFrame {

    private UnitOfWork uw;
    private Cliente cliente;
    private JFrame frmAnterior;

    public FrmRegistroAutor(JFrame frmAnterior, Cliente cliente) {
        initComponents();
        uw = new UnitOfWork();
        this.cliente = cliente;
        this.frmAnterior = frmAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        comboBoxNacionalidad = comboBoxNacionalidad = new javax.swing.JComboBox<>();
        comboBoxNacionalidad.setModel(new DefaultComboBoxModel<>(Nacionalidad.values()));
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
        lblBienvenido.setText("Registro Autor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
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

        lblNacionalidad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");
        Background.add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

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

        btnRegistrar.setBackground(new java.awt.Color(0, 102, 204));
        btnRegistrar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        Background.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 30));

        lblEdad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblEdad.setText("Edad");
        Background.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        Background.add(comboBoxNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 190, -1));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, 10));

        campoTextoEdad.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoEdad.setToolTipText("");
        campoTextoEdad.setBorder(null);
        Background.add(campoTextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 20));

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.agregarAutor();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private boolean validarCampos() {
        String edad = campoTextoEdad.getText();

        if (!isInteger(edad)) {
            mostrarMensajeError(this, "Ingrese una edad valida!");
            return false;
        }

        return true;

    }

    private void limpiarCampos() {
        campoTextoEdad.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoEdad;
    private javax.swing.JComboBox<Nacionalidad> comboBoxNacionalidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNacionalidad;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void agregarAutor() {
        if (!validarCampos()) {
            return;
        }

        try {
            Autor autor = crearAutorDeCampos();
            ControladorUsuario.persistirAutor(autor);
            Dialogs.mostrarMensajeExito(this, "Registro completado.");
            this.regresar();
        } catch (Exception e) {
            Dialogs.mostrarMensajeError(this, "No se pudo guardar el autor.");
        }
    }

    private Autor crearAutorDeCampos() {
        Integer edad = Integer.valueOf(campoTextoEdad.getText());
        Nacionalidad nacionalidad = (Nacionalidad) comboBoxNacionalidad.getSelectedItem();
        return new Autor(this.cliente, edad, nacionalidad);
    }
}
