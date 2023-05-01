package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.dominio.DivisionPago;
import org.itson.dominio.EstadoPago;
import org.itson.dominio.MetodoPago;
import org.itson.dominio.Pago;
import org.itson.dominio.PagoDeposito;
import org.itson.dominio.PagoEfectivo;
import org.itson.dominio.PagoTarjeta;
import org.itson.utils.Dialogs;

import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmRealizarPago extends javax.swing.JFrame {

    private UnitOfWork unitOfWork;
    private JFrame frmAnterior;
    private PagoDTO pagoDTO;

    /**
     * Logger de excepciones
     */
    private static final Logger LOG = Logger.getLogger(FrmGestionarAutores.class.getName());

    private static final Double MINIMO_MONTO_DOS_PAGOS = 1000.0;

    public FrmRealizarPago(JFrame frmAnterior, PagoDTO pagoDTO) {
        initComponents();
        unitOfWork = new UnitOfWork();
        this.frmAnterior = frmAnterior;
        this.pagoDTO = pagoDTO;
        this.cargarCampos();

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
        btnProceder = new javax.swing.JButton();
        cBoxTipoPago =  new javax.swing.JComboBox<>();
        cBoxTipoPago.setModel(new DefaultComboBoxModel<>(TipoMetodoPago.values()));
        lblTotal = new javax.swing.JLabel();
        cboxDosPasos = new javax.swing.JCheckBox();

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
        lblBienvenido.setText("Tipo de Pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
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
        lblNacionalidad.setText("Tipo de Pago");
        Background.add(lblNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

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

        btnProceder.setBackground(new java.awt.Color(0, 102, 204));
        btnProceder.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnProceder.setForeground(new java.awt.Color(255, 255, 255));
        btnProceder.setText("Proceder");
        btnProceder.setBorder(null);
        btnProceder.setBorderPainted(false);
        btnProceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcederActionPerformed(evt);
            }
        });
        Background.add(btnProceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 30));

        Background.add(cBoxTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 190, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotal.setText("Total: $");
        Background.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        cboxDosPasos.setText("Realizar en dos pagos");
        Background.add(cboxDosPasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

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

    private void btnProcederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcederActionPerformed
        this.proceder();
    }//GEN-LAST:event_btnProcederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnProceder;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<TipoMetodoPago> cBoxTipoPago;
    private javax.swing.JCheckBox cboxDosPasos;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables

    private void proceder() {
        Pago pago = this.realizarPago();
        Pago pagoGuardado = this.persistirPago(pago);
        if (pagoGuardado == null) {
            Dialogs.mostrarMensajeError(rootPane, "Algo salió mal.");
            return;
        }
        Dialogs.mostrarMensajeExito(rootPane, "Pago realizado.");
        this.regresar();
    }

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void cargarComboBox() {
        if (this.pagoDTO.getMontoTotal() < MINIMO_MONTO_DOS_PAGOS) {
            this.cboxDosPasos.setVisible(false);
        }
    }

    private void cargarCampos() {
        this.cargarComboBox();
        this.lblTotal.setText("Total: $" + this.pagoDTO.getMontoTotal());
    }

    private Pago realizarPago() {
        Pago pago = new Pago();

        pago.setCliente(pagoDTO.getCliente());

        DivisionPago divisionPago = this.cboxDosPasos.isSelected() ? DivisionPago.DOS_PAGOS : DivisionPago.PAGO_UNICO;
        pago.setDivisionPago(divisionPago);

        pago.setEstado(divisionPago == DivisionPago.PAGO_UNICO? EstadoPago.PAGADO:EstadoPago.PENDIENTE);

        pago.setFechaPago(new GregorianCalendar());

        MetodoPago metodoPago = this.getMetodoPago();
        metodoPago.setMonto(pagoDTO.getMontoTotal());
        metodoPago.setPago(pago);
        pago.setMetodoPago(metodoPago);

        pago.setPublicacion(pagoDTO.getPublicacion());
        pago.setMonto(pagoDTO.getMontoTotal());

        return pago;
    }

    private MetodoPago getMetodoPago() {
        int selectedItem = cBoxTipoPago.getSelectedIndex();
        TipoMetodoPago tipoMetodoPago = cBoxTipoPago.getItemAt(selectedItem);

        MetodoPago metodoPago = null;
        switch (tipoMetodoPago) {
            case PAGO_DEPOSITO ->
                metodoPago = new PagoDeposito();
            case PAGO_EFECTIVO ->
                metodoPago = new PagoEfectivo();
            case PAGO_TARJETA ->
                metodoPago = new PagoTarjeta();
            default ->
                throw new AssertionError();
        }

        return metodoPago;
    }

    private Pago persistirPago(Pago pago) {
        try {
            System.out.println(pago.getMonto());
            return unitOfWork.pagosRepository().agregar(pago);
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error al persistir pago.");
        }
        return null;

    }
}
