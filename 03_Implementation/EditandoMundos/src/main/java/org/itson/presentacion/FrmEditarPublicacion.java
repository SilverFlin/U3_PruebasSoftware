package org.itson.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.itson.controladores.ControladorPublicacion;
import org.itson.dominio.Autor;
import org.itson.dominio.Publicacion;
import org.itson.dominio.PublicacionDigital;
import org.itson.dominio.PublicacionFisica;
import org.itson.dominio.Usuario;
import org.itson.utils.Cotizador;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;
import org.itson.utils.Validaciones;

/**
 *
 * @author Toled
 */
public class FrmEditarPublicacion extends JFrameActualizable {

    private static final Logger LOG = Logger.getLogger(FrmEditarPublicacion.class.getName());

    private String tituloPub;
    private Integer pagInicialPub;
    private Autor autorPub;
    private String nombreLibroPub;
    private Integer noPaginasPub;
    private Double sizeMegasPub;
    private Publicacion publicacionSeleccionada;

    private Usuario usuarioLoggeado;
    private final JFrameActualizable frmAnterior;

    public FrmEditarPublicacion(JFrameActualizable frmAnterior, Usuario usuarioLoggeado) {
        initComponents();
        this.llenarComboBoxAutores();
        this.usuarioLoggeado = usuarioLoggeado;
        this.frmAnterior = frmAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnGroupTipoPublicacion = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTituloForm = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        separadorTitulo = new javax.swing.JSeparator();
        lblTituloPublicacion = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        cBoxAutores = new javax.swing.JComboBox<>();
        txtPaginaInicial = new javax.swing.JTextField();
        separadorPaginaInicial = new javax.swing.JSeparator();
        lblPaginaInicial = new javax.swing.JLabel();
        txtSizeMegas = new javax.swing.JTextField();
        separadorSizeMegas = new javax.swing.JSeparator();
        lblSizeMegas = new javax.swing.JLabel();
        separadorNombreLibro = new javax.swing.JSeparator();
        txtNombreLibro = new javax.swing.JTextField();
        lblNombreLibro = new javax.swing.JLabel();
        txtNoPaginas = new javax.swing.JTextField();
        separadorNoPaginas = new javax.swing.JSeparator();
        lblNoPaginas = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblTituloForm.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm.setText("Editar Publicación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(lblTituloForm)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTituloForm)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        txtTitulo.setForeground(new java.awt.Color(51, 51, 51));
        txtTitulo.setToolTipText("");
        txtTitulo.setBorder(null);
        Background.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 20));

        lblAutor.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblAutor.setText("Autor");
        Background.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 180, 20));
        Background.add(separadorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, 10));

        lblTituloPublicacion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblTituloPublicacion.setText("Titulo");
        Background.add(lblTituloPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

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

        btnCotizar.setBackground(new java.awt.Color(0, 102, 204));
        btnCotizar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizar.setText("Editar");
        btnCotizar.setBorder(null);
        btnCotizar.setBorderPainted(false);
        btnCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        Background.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 70, 30));

        cBoxAutores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAutoresActionPerformed(evt);
            }
        });
        Background.add(cBoxAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 190, -1));

        txtPaginaInicial.setForeground(new java.awt.Color(51, 51, 51));
        txtPaginaInicial.setToolTipText("");
        txtPaginaInicial.setBorder(null);
        Background.add(txtPaginaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, 20));
        Background.add(separadorPaginaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, 10));

        lblPaginaInicial.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblPaginaInicial.setText("Pagina Inicial");
        Background.add(lblPaginaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        txtSizeMegas.setForeground(new java.awt.Color(51, 51, 51));
        txtSizeMegas.setToolTipText("");
        txtSizeMegas.setBorder(null);
        Background.add(txtSizeMegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, 20));
        Background.add(separadorSizeMegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, 10));

        lblSizeMegas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblSizeMegas.setText("Tamaño Megas");
        Background.add(lblSizeMegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        Background.add(separadorNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 190, 10));

        txtNombreLibro.setForeground(new java.awt.Color(51, 51, 51));
        txtNombreLibro.setToolTipText("");
        txtNombreLibro.setBorder(null);
        Background.add(txtNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 190, 20));

        lblNombreLibro.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombreLibro.setText("Nombre Libro");
        Background.add(lblNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        txtNoPaginas.setForeground(new java.awt.Color(51, 51, 51));
        txtNoPaginas.setToolTipText("");
        txtNoPaginas.setBorder(null);
        txtNoPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoPaginasActionPerformed(evt);
            }
        });
        Background.add(txtNoPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 190, 20));
        Background.add(separadorNoPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 190, 10));

        lblNoPaginas.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNoPaginas.setText("No. Paginas");
        Background.add(lblNoPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        this.cotizar();
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void cBoxAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxAutoresActionPerformed

    private void txtNoPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoPaginasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCotizar;
    private javax.swing.ButtonGroup btnGroupTipoPublicacion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cBoxAutores;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblNoPaginas;
    private javax.swing.JLabel lblNombreLibro;
    private javax.swing.JLabel lblPaginaInicial;
    private javax.swing.JLabel lblSizeMegas;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JLabel lblTituloPublicacion;
    private javax.swing.JSeparator separadorNoPaginas;
    private javax.swing.JSeparator separadorNombreLibro;
    private javax.swing.JSeparator separadorPaginaInicial;
    private javax.swing.JSeparator separadorSizeMegas;
    private javax.swing.JSeparator separadorTitulo;
    private javax.swing.JTextField txtNoPaginas;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtPaginaInicial;
    private javax.swing.JTextField txtSizeMegas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void cotizar() {
        if (!this.validarCampos()) {
            return;
        }

        if (this.publicacionSeleccionada == null) {
            Dialogs.mostrarMensajeError(rootPane, "Publicacion inexistente");
            return;
        }

        this.colectarCampos();

        this.modificarPublicacionSeleccionada();

        int costoProduccion = Cotizador.calcularCostoProduccion(this.noPaginasPub);

        int respuesta = this.dialogConfirmarGuardar(costoProduccion);

        if (respuesta == JOptionPane.NO_OPTION) {
            return;
        }
        if (respuesta == JOptionPane.OK_OPTION) {
            ControladorPublicacion.editarPublicacion(publicacionSeleccionada);
            this.dialogPublicacionGuardada(publicacionSeleccionada);
            this.regresar();
        }

    }

    private boolean validarCampos() {
        String titulo = txtTitulo.getText();
        String autor = String.valueOf(cBoxAutores.getSelectedItem());
        String rawNoPaginas = txtNoPaginas.getText();

        if (titulo.isBlank()) {
            Dialogs.mostrarMensajeError(rootPane, "Se debe seleccionar un título");
            return false;
        }

        if (autor.isBlank()) {
            Dialogs.mostrarMensajeError(rootPane, "Se debe seleccionar un autor");
            return false;
        }

        if (rawNoPaginas.isBlank()) {
            Dialogs.mostrarMensajeError(rootPane, "Se debe seleccionar el número de páginas");
            if (!Validaciones.isInteger(rawNoPaginas)) {
                Dialogs.mostrarMensajeError(rootPane, "Formato de No. Paginas inválido");
                return false;
            }

        }

        if (this.publicacionSeleccionada instanceof PublicacionDigital) {
            String rawSizeMegas = txtSizeMegas.getText();
            if (rawSizeMegas.isBlank()) {
                Dialogs.mostrarMensajeError(rootPane, "Se debe seleccionar el tamaño");
                return false;
            }
            if (!Validaciones.isDouble(rawSizeMegas)) {
                Dialogs.mostrarMensajeError(rootPane, "Formato de MB inválido");
                return false;
            }

        }

        if (this.publicacionSeleccionada instanceof PublicacionFisica) {
            String rawPaginaInicial = txtPaginaInicial.getText();
            if (rawPaginaInicial.isBlank() || !Validaciones.isInteger(rawPaginaInicial)) {
                Dialogs.mostrarMensajeError(rootPane, "Formato de página inicial inválido");
                return false;
            }

        }
        return true;
    }

    private void llenarComboBoxAutores() {
        try {
            List<String> nombreAutores = this.consultarNombreAutores();
            this.cBoxAutores.setModel(new DefaultComboBoxModel<>(nombreAutores.toArray(new String[0])));
        } catch (IllegalArgumentException ex) {
            LOG.log(Level.SEVERE, ex.getMessage());
            Dialogs.mostrarMensajeError(rootPane, "Error al cargar autores");

        }
    }

    private List<String> consultarNombreAutores() {
        List<Autor> listaAutores = consultarAutores();
        List<String> nombreAutores = new ArrayList<>();
        for (Autor autor : listaAutores) {
            String nombreCompleto = autor.getNombres() + " " + autor.getApellidoPaterno();
            nombreAutores.add(nombreCompleto);
        }

        return nombreAutores;
    }

    private List<Autor> consultarAutores() {
        UnitOfWork unitOfWork = new UnitOfWork();
        return unitOfWork.autoresRepository().lista();
    }

    private void actualizarPublicacionSeleccionada() throws IllegalArgumentException {
        if (publicacionSeleccionada instanceof PublicacionFisica) {
            this.mostrarCamposPubFisica();
            this.ocultarCamposPubDigital();
        } else if (publicacionSeleccionada instanceof PublicacionDigital) {
            this.mostrarCamposPubDigital();
            this.ocultarCamposPubFisica();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPublicacionModificar(Publicacion publicacionModificar) {
        this.publicacionSeleccionada = publicacionModificar;
        llenarCampos();
    }

    private void mostrarCamposPubFisica() {
        this.txtPaginaInicial.setVisible(true);
        this.lblPaginaInicial.setVisible(true);
        this.separadorPaginaInicial.setVisible(true);

        this.txtNombreLibro.setVisible(true);
        this.lblNombreLibro.setVisible(true);
        this.separadorNombreLibro.setVisible(true);
    }

    private void ocultarCamposPubFisica() {
        this.txtPaginaInicial.setVisible(false);
        this.lblPaginaInicial.setVisible(false);
        this.separadorPaginaInicial.setVisible(false);

        this.txtNombreLibro.setVisible(false);
        this.lblNombreLibro.setVisible(false);
        this.separadorNombreLibro.setVisible(false);
    }

    private void mostrarCamposPubDigital() {
        this.txtSizeMegas.setVisible(true);
        this.lblSizeMegas.setVisible(true);
        this.separadorSizeMegas.setVisible(true);
    }

    private void ocultarCamposPubDigital() {
        this.txtSizeMegas.setVisible(false);
        this.lblSizeMegas.setVisible(false);
        this.separadorSizeMegas.setVisible(false);
    }

    private Publicacion modificarPublicacionSeleccionada() {

        publicacionSeleccionada.setAutor(this.autorPub);
        publicacionSeleccionada.setTitulo(this.tituloPub);
        publicacionSeleccionada.setNoPaginas(noPaginasPub);

        if (publicacionSeleccionada instanceof PublicacionDigital publicacionDigital) {
            publicacionDigital.setSizeMegas(this.sizeMegasPub);
            publicacionSeleccionada = publicacionDigital;
        } else if (publicacionSeleccionada instanceof PublicacionFisica publicacionFisica) {
            publicacionFisica.setPaginaInicial(this.pagInicialPub);
            publicacionFisica.setNombreLibro(this.nombreLibroPub);
            publicacionSeleccionada = publicacionFisica;
        }

        return publicacionSeleccionada;
    }

    private Autor buscarAutor(String nombres, String apellidoPaterno) {
        UnitOfWork unitOfWork = new UnitOfWork();
        List<Autor> autores = unitOfWork.autoresRepository().consultaNombreYApellido(nombres, apellidoPaterno);
        return autores.get(0);
    }

    private void colectarCampos() {
        String rawAutor = String.valueOf(cBoxAutores.getSelectedItem());
        String[] nombresAutorArr = rawAutor.split("");
        String nombresAutor = nombresAutorArr.length == 3 ? nombresAutorArr[0] + " " + nombresAutorArr[1] : nombresAutorArr[0];
        String apellidoPaternoAutor = nombresAutorArr[nombresAutorArr.length - 1];

        this.autorPub = buscarAutor(nombresAutor, apellidoPaternoAutor);
        this.tituloPub = this.txtTitulo.getText();
        this.noPaginasPub = Integer.valueOf(txtNoPaginas.getText());

        if (this.publicacionSeleccionada instanceof PublicacionDigital) {
            this.sizeMegasPub = Double.valueOf(txtSizeMegas.getText());
        } else if (this.publicacionSeleccionada instanceof PublicacionFisica) {
            this.pagInicialPub = Integer.valueOf(txtPaginaInicial.getText());
            this.nombreLibroPub = txtNombreLibro.getText();
        }
    }

    private void regresar() {
        FormUtils.regresar(frmAnterior, this);
    }

    private int dialogConfirmarGuardar(int costoProduccion) {
        String mensaje = "El nuevo costo de producción es de: \n" + costoProduccion;
        String titulo = "¿Modificar Publicación?";
        return Dialogs.mostrarMensajeYesNoOption(rootPane, mensaje, titulo);

    }

    private void dialogPublicacionGuardada(Publicacion publicacionGuardada) {
        String mensaje = """
                         Publicacion modificada 
                          costo venta: """ + publicacionGuardada.getCostoVenta();
        Dialogs.mostrarMensajeExito(rootPane, mensaje);
    }

    private void llenarCampos() {
        String titulo = publicacionSeleccionada.getTitulo();
        String noPaginas = String.valueOf(publicacionSeleccionada.getNoPaginas());
        String autor = publicacionSeleccionada.getAutor().getNombres() + " " + publicacionSeleccionada.getAutor().getNombres();
        this.txtTitulo.setText(titulo);
        this.txtNoPaginas.setText(noPaginas);
        this.cBoxAutores.setSelectedItem(autor);
        if (publicacionSeleccionada instanceof PublicacionDigital publicacionDigital) {
            String sizeMegas = String.valueOf(publicacionDigital.getSizeMegas());
            this.txtSizeMegas.setText(sizeMegas);
        } else if (publicacionSeleccionada instanceof PublicacionFisica publicacionFisica) {
            String paginaInicial = String.valueOf(publicacionFisica.getPaginaInicial());
            String nombreLibro = publicacionFisica.getNombreLibro();
            this.txtPaginaInicial.setText(paginaInicial);
            this.txtNombreLibro.setText(nombreLibro);
        }
    }

    @Override
    public void actualizaFrame() {
        actualizarPublicacionSeleccionada();
    }
}
