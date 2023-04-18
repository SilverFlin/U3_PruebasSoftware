package org.itson.presentacion;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.controladores.ControladorAutor;
import org.itson.dominio.Autor;
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
public class FrmEditarAutor extends javax.swing.JFrame {

    private UnitOfWork uw;
    private Usuario usuarioLoggeado;
    private Autor autorModificar;
    private JFrameActualizable frmAnterior;

    public FrmEditarAutor(JFrameActualizable frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
        uw = new UnitOfWork();
        this.usuarioLoggeado = usuarioLoggeado;
        this.frmAnterior = frmAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        campoTextoApellidoMaterno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        comboBoxNacionalidad = comboBoxNacionalidad = new javax.swing.JComboBox<>();
        comboBoxNacionalidad.setModel(new DefaultComboBoxModel<>(Nacionalidad.values()));
        jSeparator3 = new javax.swing.JSeparator();
        campoTextoEdad = new javax.swing.JTextField();
        campoTextoNombres = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        campoTextoApellidoPaterno = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();

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
        lblBienvenido.setText("Editar Autor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
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

        campoTextoApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoMaterno.setToolTipText("");
        campoTextoApellidoMaterno.setBorder(null);
        Background.add(campoTextoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 190, 10));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 20));

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

        btnAgregar.setBackground(new java.awt.Color(0, 102, 204));
        btnAgregar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Editar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        Background.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 30));

        lblEdad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblEdad.setText("Edad");
        Background.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        Background.add(comboBoxNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 190, -1));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 190, 10));

        campoTextoEdad.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoEdad.setToolTipText("");
        campoTextoEdad.setBorder(null);
        Background.add(campoTextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 20));

        campoTextoNombres.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoNombres.setToolTipText("");
        campoTextoNombres.setBorder(null);
        Background.add(campoTextoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 190, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 190, 10));

        campoTextoApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoPaterno.setToolTipText("");
        campoTextoApellidoPaterno.setBorder(null);
        Background.add(campoTextoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 190, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 10));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 180, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, 20));

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.modificar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private boolean validarCampos() {
        String nombres = campoTextoNombres.getText();
        String apellidoPaterno = campoTextoApellidoPaterno.getText();
        String apellidoMaterno = campoTextoApellidoMaterno.getText();
        String edad = campoTextoEdad.getText();

        if (!isValidText(nombres)) {
            mostrarMensajeError(this, "Ingrese un nombre valido!");
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
        if (!isInteger(edad)) {
            mostrarMensajeError(this, "Ingrese una edad valida!");
            return false;
        }

        return true;
    }

    private void modificar() {
        if (autorModificar == null) {
            throw new IllegalArgumentException("No hay un autor a editar!");
        }

        if (!validarCampos()) {
            return;
        }

        int eleccion = Dialogs.mostrarMensajeYesNoOption(this, "¿Seguro que desea modificar el autor?", "Confirmación");
        if (eleccion == Dialogs.OPCION_NO) {
            return;
        }

        this.actualizarAutorModificar();

        try {
            ControladorAutor.modificarAutor(autorModificar);
            Dialogs.mostrarMensajeExito(this, "Autor modificado con exito.");
        } catch (Exception e) {
            Dialogs.mostrarMensajeError(this, "No se pudo modificar el autor.");
        } finally {
            this.regresar();
        }
    }

    public void setAutorModificar(Autor autorModificar) {
        this.autorModificar = autorModificar;
        llenarCampos();
    }

    private void limpiarCampos() {
        campoTextoApellidoMaterno.setText("");
        campoTextoApellidoPaterno.setText("");
        campoTextoNombres.setText("");
        campoTextoEdad.setText("");
    }

    private void llenarCampos() {
        if (autorModificar == null) {
            throw new IllegalArgumentException("No hay un autor a editar!");
        }
        this.comboBoxNacionalidad.setSelectedItem(this.autorModificar.getNacionalidad());
        this.campoTextoEdad.setText(String.valueOf(this.autorModificar.getEdad()));
        this.campoTextoNombres.setText(this.autorModificar.getNombres());
        this.campoTextoApellidoPaterno.setText(this.autorModificar.getApellidoPaterno());
        this.campoTextoApellidoMaterno.setText(this.autorModificar.getApellidoMaterno());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoTextoApellidoMaterno;
    private javax.swing.JTextField campoTextoApellidoPaterno;
    private javax.swing.JTextField campoTextoEdad;
    private javax.swing.JTextField campoTextoNombres;
    private javax.swing.JComboBox<Nacionalidad> comboBoxNacionalidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombres;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void actualizarAutorModificar() {
        autorModificar.setNombres(campoTextoNombres.getText());
        autorModificar.setApellidoPaterno(campoTextoApellidoPaterno.getText());
        autorModificar.setApellidoMaterno(campoTextoApellidoMaterno.getText());
        autorModificar.setEdad(Integer.parseInt(campoTextoEdad.getText()));
        autorModificar.setNacionalidad((Nacionalidad) comboBoxNacionalidad.getSelectedItem());
    }
}
