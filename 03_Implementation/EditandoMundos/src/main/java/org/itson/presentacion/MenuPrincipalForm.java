package org.itson.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.dominio.Administrador;
import org.itson.dominio.Cliente;
import org.itson.dominio.DivisionPago;
import org.itson.dominio.EstadoPago;
import org.itson.dominio.Pago;
import org.itson.dominio.Usuario;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class MenuPrincipalForm extends javax.swing.JFrame {

    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(MenuPrincipalForm.class.getName());
    private FrmPublicaciones frmListaPublicaciones;
    private FrmCotizarPublicacion frmCotizaciones;
    private FrmGestionarPublicaciones frmGestionarPublicaciones;
    private FrmGestionarAutores frmGestionarAutores;
    private FrmConsultarPagosPendientes frmConsultarPagosPendientes;
    private final Usuario usuarioLoggeado;

    public MenuPrincipalForm(Usuario usuarioLoggeado) {
        initComponents();
        ajustarEntornoSegunUsuario(usuarioLoggeado);
        this.usuarioLoggeado = usuarioLoggeado;
        initFormsConectados();
        this.verificarPagosPendientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnGestionarAutores = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        btnGestionarPublicaciones = new javax.swing.JButton();
        btnPagosPendientes = new javax.swing.JButton();

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
        txtBienvenida.setText("Bienvenido");

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
                .addGap(25, 25, 25)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienvenida)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        btnGestionarAutores.setBackground(new java.awt.Color(0, 102, 255));
        btnGestionarAutores.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnGestionarAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarAutores.setText("Gestionar Autores");
        btnGestionarAutores.setBorder(null);
        btnGestionarAutores.setBorderPainted(false);
        btnGestionarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarAutoresActionPerformed(evt);
            }
        });
        background3.add(btnGestionarAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 40));

        btnCotizar.setBackground(new java.awt.Color(0, 102, 255));
        btnCotizar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizar.setText("Cotizar");
        btnCotizar.setBorder(null);
        btnCotizar.setBorderPainted(false);
        btnCotizar.setMaximumSize(new java.awt.Dimension(153, 20));
        btnCotizar.setMinimumSize(new java.awt.Dimension(153, 20));
        btnCotizar.setPreferredSize(new java.awt.Dimension(153, 20));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        background3.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 40));

        btnGestionarPublicaciones.setBackground(new java.awt.Color(0, 102, 255));
        btnGestionarPublicaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnGestionarPublicaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarPublicaciones.setText("Gestionar Publicaciones");
        btnGestionarPublicaciones.setBorder(null);
        btnGestionarPublicaciones.setBorderPainted(false);
        btnGestionarPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPublicacionesActionPerformed(evt);
            }
        });
        background3.add(btnGestionarPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 40));

        btnPagosPendientes.setBackground(new java.awt.Color(0, 102, 255));
        btnPagosPendientes.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnPagosPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPagosPendientes.setText("Pagos Pendientes");
        btnPagosPendientes.setBorder(null);
        btnPagosPendientes.setBorderPainted(false);
        btnPagosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosPendientesActionPerformed(evt);
            }
        });
        background3.add(btnPagosPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 40));

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

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        try {
            this.cargarFormCotizacion();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Boton Cotizar Menu Principal");
        }

    }//GEN-LAST:event_btnCotizarActionPerformed


    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void btnGestionarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarAutoresActionPerformed
        this.cargarFormGestionarAutores();
    }//GEN-LAST:event_btnGestionarAutoresActionPerformed


    private void btnGestionarPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPublicacionesActionPerformed
        this.cargarFormGestionarPublicaciones();
    }//GEN-LAST:event_btnGestionarPublicacionesActionPerformed

    private void btnPagosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosPendientesActionPerformed
        this.cargarPagosPendientes();
    }//GEN-LAST:event_btnPagosPendientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnGestionarAutores;
    private javax.swing.JButton btnGestionarPublicaciones;
    private javax.swing.JButton btnPagosPendientes;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

    private void cargarFormGestionarPublicaciones() {
        FormUtils.cargarForm(this.frmGestionarPublicaciones, this);
    }

    private void cargarFormCotizacion() {
        FormUtils.cargarForm(this.frmCotizaciones, this);
    }

    private void cargarFormGestionarAutores() {
        FormUtils.cargarForm(this.frmGestionarAutores, this);
    }

    private void cargarPagosPendientes() {
        this.frmConsultarPagosPendientes.actualizaFrame();
        FormUtils.cargarForm(this.frmConsultarPagosPendientes, this);
    }

    private void cerrarSesion() {
        FormUtils.cerrarSesion(this);
    }

    private void ajustarEntornoSegunUsuario(Usuario usuarioLoggeado) {
//        if (!(usuarioLoggeado instanceof Administrador)) {
//            btnAgregarUsuario.setVisible(false);
//        }
    }

    private void initFormsConectados() {
        this.frmGestionarPublicaciones = new FrmGestionarPublicaciones(this, this.usuarioLoggeado);
        this.frmCotizaciones = new FrmCotizarPublicacion(this, this.usuarioLoggeado);
        this.frmGestionarAutores = new FrmGestionarAutores(this, this.usuarioLoggeado);
        this.frmConsultarPagosPendientes = new FrmConsultarPagosPendientes(this, usuarioLoggeado);
    }

    private void verificarPagosPendientes() {
        if(!(this.usuarioLoggeado instanceof Cliente)){
            return;
        }
        Cliente cliente = (Cliente) this.usuarioLoggeado;
        List<Pago> pagosCliente = cliente.getPagos();
        List<Pago> pagosPendientes = new ArrayList<>();

        for (Pago pago : pagosCliente) {
            boolean isDosPagos = pago.getDivisionPago() == DivisionPago.DOS_PAGOS;
            boolean isPagado = pago.getEstado() == EstadoPago.PAGADO;

            if (isDosPagos && !isPagado) {
                pagosPendientes.add(pago);
            }

        }
        if (pagosPendientes.isEmpty()) {
            return;
        }

        String msgPagosPendientes = "Usted tiene " + pagosPendientes.size() + " pago(s) pendiente(s)";
        Dialogs.mostrarMensajeError(rootPane, msgPagosPendientes);

    }

}
