package org.itson.presentacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.controladores.ControladorPagos;
import org.itson.controladores.ControladorPublicacion;
import org.itson.dominio.Cliente;
import org.itson.dominio.EstadoPago;
import org.itson.dominio.Pago;
import org.itson.dominio.Publicacion;
import org.itson.dominio.Usuario;
import org.itson.utils.ConfiguracionPaginado;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmConsultarPagosPendientes extends JFrameActualizable {

    private static final Logger LOG = Logger.getLogger(FrmConsultarPagosPendientes.class.getName());
    private Usuario usuarioLoggeado;
    private ConfiguracionPaginado configPaginado;
    private final DateFormat formateador = new SimpleDateFormat("dd/MM/yyy");
    private final JFrame frmAnterior;
    private List<Pago> pagosPendientes;

    public FrmConsultarPagosPendientes(JFrame frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
        this.configPaginado = new ConfiguracionPaginado(this.tblPagosPendientes.getModel().getRowCount(), 0);
        this.usuarioLoggeado = usuarioLoggeado;
        this.frmAnterior = frmAnterior;
        cargarTablaPagos();

    }

    public final void cargarTablaPagos() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPagosPendientes.getModel();
        modeloTabla.setRowCount(0);
        
        if (!(this.usuarioLoggeado instanceof Cliente)) {
            return;
        }
        
        this.conseguirListaPagosPendientes();

        for (Pago pago : pagosPendientes) {

            Publicacion publicacion = pago.getPublicacion();
            Object[] fila = {
                publicacion.getTitulo(),
                publicacion.getAutor().getNombres() + " " + publicacion.getAutor().getApellidoPaterno(),
                publicacion.getNoPaginas(),
                pago.getMonto() / 2,
                this.formatoFecha(pago.getFechaPago())
            };

            modeloTabla.addRow(fila);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblPagosPendientes = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblOperaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblOperaciones.setText("Pagos Pendientes");

        btnAtras.setBackground(new java.awt.Color(0, 102, 255));
        btnAtras.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(lblOperaciones)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperaciones)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        tblPagosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "No. Paginas", "Monto Pendiente", "Fecha realización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPagosPendientes.setColumnSelectionAllowed(true);
        panelTablaCuentas.setViewportView(tblPagosPendientes);
        tblPagosPendientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Background.add(panelTablaCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 560, 190));

        btnAdelante.setBackground(new java.awt.Color(0, 102, 255));
        btnAdelante.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAdelante.setForeground(new java.awt.Color(255, 255, 255));
        btnAdelante.setText(">");
        btnAdelante.setBorder(null);
        btnAdelante.setBorderPainted(false);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        Background.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 30, 30));

        btnRetroceder.setBackground(new java.awt.Color(0, 102, 255));
        btnRetroceder.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setText("<");
        btnRetroceder.setBorder(null);
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        Background.add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 30, 30));

        btnPagar.setBackground(new java.awt.Color(0, 102, 255));
        btnPagar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.setBorder(null);
        btnPagar.setBorderPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        Background.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));

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
     * Dirige a la ventana anterior
     *
     * @param evt Evento que lo acciono
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnAtrasActionPerformed
    /**
     * Avanza en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        this.configPaginado.avanzarPag();
        this.cargarTablaPagos();
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        this.configPaginado.retrocederPag();
        this.cargarTablaPagos();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        this.pagarElemento();
        this.cargarTablaPagos();
    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JTable tblPagosPendientes;
    // End of variables declaration//GEN-END:variables

    private void conseguirListaPagosPendientes() {
        List<Pago> pagos = ControladorPagos.consultaPaginado(this.configPaginado, (Cliente) this.usuarioLoggeado);
        this.pagosPendientes = new ArrayList<>();
        for (Pago pago : pagos) {
            if (pago.getEstado() == EstadoPago.PAGADO || !pago.getCliente().equals(this.usuarioLoggeado)) {
                continue;
            }
            this.pagosPendientes.add(pago);
        }
    }

    private String formatoFecha(final Calendar calendar) {
        return formateador.format(calendar.getTime());
    }

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void pagarElemento() {
        this.conseguirListaPagosPendientes();
        int index = tblPagosPendientes.convertRowIndexToModel(tblPagosPendientes.getSelectedRow());
        if (index == -1) {
            Dialogs.mostrarMensajeError(this, "No ha seleccionado ningun elemento de la tabla");
            return;
        }

        int eleccion = Dialogs.mostrarMensajeYesNoOption(this, "¿Seguro que desea realizar el pago?", "Confirmación");
        if (eleccion == Dialogs.OPCION_SI) {
            Pago pago = pagosPendientes.get(index);
            Pago testPago = ControladorPagos.pagar(pago);
            System.out.println(testPago);
        }
    }

    @Override
    public void actualizaFrame() {
        cargarTablaPagos();
    }
}
