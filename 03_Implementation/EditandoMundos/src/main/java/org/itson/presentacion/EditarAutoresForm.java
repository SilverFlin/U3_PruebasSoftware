package org.itson.presentacion;

import java.util.List;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.controladores.ControladorAutor;
import org.itson.dominio.Autor;
import org.itson.dominio.Usuario;
import org.itson.utils.ConfiguracionPaginado;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class EditarAutoresForm extends JFrame {

    private static final Logger LOG = Logger.getLogger(EditarAutoresForm.class.getName());
    private ConfiguracionPaginado configPaginado;
    private Usuario clienteLoggeado;
    private final JFrame frmAnterior;
    private EditarAutorForm editarAutorForm;
    private List<Autor> autores;

    public EditarAutoresForm(JFrame frmAnterior, Usuario clienteLoggeado) {
        initComponents();
        this.configPaginado = new ConfiguracionPaginado(this.tblPublicaciones.getModel().getRowCount(), 0);
        this.clienteLoggeado = clienteLoggeado;
        this.frmAnterior = frmAnterior;
        this.initFormsConectados();
        cargarTablaPublicaciones();
    }

    public final void cargarTablaPublicaciones() {

        autores = conseguirListaAutores();

        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPublicaciones.getModel();
        modeloTabla.setRowCount(0);
        String nombreCompleto;
        for (Autor autor : autores) {
            nombreCompleto = autor.getNombre() + " "
                    + autor.getApellidoPaterno()
                    + " " + autor.getApellidoMaterno();

            Object[] fila = {
                nombreCompleto,
                autor.getEdad(),
                autor.getNacionalidad()
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
        tblPublicaciones = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblOperaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblOperaciones.setText("Editar Autor");

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
                .addGap(155, 155, 155)
                .addComponent(lblOperaciones)
                .addContainerGap(238, Short.MAX_VALUE))
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

        tblPublicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "Nacionalidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTablaCuentas.setViewportView(tblPublicaciones);
        tblPublicaciones.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblPublicaciones.getColumnModel().getColumnCount() > 0) {
            tblPublicaciones.getColumnModel().getColumn(0).setResizable(false);
            tblPublicaciones.getColumnModel().getColumn(1).setResizable(false);
            tblPublicaciones.getColumnModel().getColumn(2).setResizable(false);
        }

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

        btnEditar.setBackground(new java.awt.Color(0, 102, 255));
        btnEditar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        Background.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 140, 30));

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
        this.cargarTablaPublicaciones();
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.editarElementoSeleccionado();
        this.cargarTablaPublicaciones();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        this.configPaginado.retrocederPag();
        this.cargarTablaPublicaciones();
    }//GEN-LAST:event_btnRetrocederActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JTable tblPublicaciones;
    // End of variables declaration//GEN-END:variables

    private List<Autor> conseguirListaAutores() {
        return ControladorAutor.consultaPaginado(this.configPaginado);
    }

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private void editarElementoSeleccionado() {
        int index = tblPublicaciones.convertRowIndexToModel(tblPublicaciones.getSelectedRow());
        if (index == -1) {
            Dialogs.mostrarMensajeError(this, "No ha seleccionado ningun elemento de la tabla!");
        } else {
            Autor autorEditar = autores.get(index);
            editarAutorForm.setAutorModificar(autorEditar);
            FormUtils.cargarForm(editarAutorForm, this);
        }
    }

    private void initFormsConectados() {
        this.editarAutorForm = new EditarAutorForm(this, this.clienteLoggeado);
    }
}
