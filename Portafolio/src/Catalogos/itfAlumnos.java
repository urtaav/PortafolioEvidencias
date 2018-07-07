/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class itfAlumnos extends javax.swing.JInternalFrame {

      
        
    public itfAlumnos() {
              
                
        initComponents();
        
        cargarCarrera();
        cargarCuatrimestre();
        cargarGrupo();
        inicio();
    }

    public void cargarCarrera()
    {
        try {            
            Statement st = cn.createStatement();                
            ResultSet rs = st.executeQuery("select * from vistaCarreras; ");

            cmbCarrera.removeAllItems();
            while (rs.next()) {
                cmbCarrera.addItem(rs.getString(2));
            }            
        }  catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error "+ e);
        }
    }
    
     public void cargarCuatrimestre()
    {
        try {            
            Statement st = cn.createStatement();                
            ResultSet rs = st.executeQuery("select * from vistaCuatrimestre; ");

            cmbCuatrimestre.removeAllItems();
            while (rs.next()) {
                cmbCuatrimestre.addItem(rs.getString(1));
            }            
        }  catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error "+ e);
        }
    } 
     
     public void cargarGrupo()
     {
         try {            
            Statement st = cn.createStatement();                
            ResultSet rs = st.executeQuery("select * from vistaGrupos; ");

            cmbGrupo.removeAllItems();
            while (rs.next()) {
                cmbGrupo.addItem(rs.getString(1));
            }            
        }  catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error "+ e);
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlSecundario = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblLogoHgo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLogoHgo1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblLogoSep = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblLogoUtyp = new javax.swing.JLabel();
        pnlPie = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        javax.swing.JPanel pnlCentral = new javax.swing.JPanel();
        pnlInferioFormulario = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblAp = new javax.swing.JLabel();
        txtAp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblAm = new javax.swing.JLabel();
        javax.swing.JLabel lblCorreo = new javax.swing.JLabel();
        txtAm = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        pnlStatus = new javax.swing.JPanel();
        rdbInscrito = new javax.swing.JRadioButton();
        rdbNoInscrito = new javax.swing.JRadioButton();
        rdbEquivalencia = new javax.swing.JRadioButton();
        lblSubirLista = new javax.swing.JLabel();
        btnSubirLista = new javax.swing.JButton();
        lblCarrera = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        lblCuatrimestre = new javax.swing.JLabel();
        cmbCuatrimestre = new javax.swing.JComboBox<>();
        lblGrupo = new javax.swing.JLabel();
        cmbGrupo = new javax.swing.JComboBox<>();
        pnlFormulario = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblFiltr = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos");

        pnlSecundario.setBackground(new java.awt.Color(255, 255, 255));
        pnlSecundario.setLayout(new java.awt.BorderLayout());

        pnlEncabezado.setBackground(new java.awt.Color(0, 153, 0));
        pnlEncabezado.setLayout(new javax.swing.BoxLayout(pnlEncabezado, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setText("          ");
        jLabel10.setToolTipText("");
        pnlEncabezado.add(jLabel10);

        jLabel25.setText("                     ");
        jLabel25.setToolTipText("");
        pnlEncabezado.add(jLabel25);

        lblLogoHgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UPFIM.png"))); // NOI18N
        pnlEncabezado.add(lblLogoHgo);

        jLabel9.setText("                     ");
        jLabel9.setToolTipText("");
        pnlEncabezado.add(jLabel9);

        lblLogoHgo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edo_Hgo_Logo.png"))); // NOI18N
        pnlEncabezado.add(lblLogoHgo1);

        jLabel21.setText("                     ");
        jLabel21.setToolTipText("");
        pnlEncabezado.add(jLabel21);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ALUMNOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlEncabezado.add(jLabel1);

        jLabel22.setText("                     ");
        jLabel22.setToolTipText("");
        pnlEncabezado.add(jLabel22);

        jLabel24.setText("                     ");
        jLabel24.setToolTipText("");
        pnlEncabezado.add(jLabel24);

        lblLogoSep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SecEduPub.png"))); // NOI18N
        pnlEncabezado.add(lblLogoSep);

        jLabel23.setText("                     ");
        jLabel23.setToolTipText("");
        pnlEncabezado.add(jLabel23);

        lblLogoUtyp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UTyPLogo.png"))); // NOI18N
        pnlEncabezado.add(lblLogoUtyp);

        pnlSecundario.add(pnlEncabezado, java.awt.BorderLayout.PAGE_START);

        pnlPie.setBackground(new java.awt.Color(0, 153, 0));
        pnlPie.setLayout(new javax.swing.BoxLayout(pnlPie, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setText("          ");
        jLabel11.setToolTipText("");
        pnlPie.add(jLabel11);

        pnlSecundario.add(pnlPie, java.awt.BorderLayout.PAGE_END);

        pnlCentral.setLayout(new java.awt.BorderLayout());

        pnlInferioFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 133, 169), 2, true));

        lblMatricula.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatricula.setText("Matricula:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNombre.setText("Nombre:");

        lblAp.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAp.setText("Apellido Paterno:");
        lblAp.setToolTipText("");

        lblAm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAm.setText("Apellido Materno:");

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCorreo.setText("Correo:");

        txtCorreo.setToolTipText("");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTelefono.setText("Telefono:");

        pnlStatus.setBackground(new java.awt.Color(255, 255, 255));
        pnlStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(41, 133, 169)), "Status"));

        rdbInscrito.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdbInscrito.setSelected(true);
        rdbInscrito.setText("Inscrito");

        rdbNoInscrito.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdbNoInscrito.setText("No Inscrito");

        rdbEquivalencia.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rdbEquivalencia.setText("Equivalencia");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rdbInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(rdbNoInscrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(rdbEquivalencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbInscrito)
                    .addComponent(rdbNoInscrito)
                    .addComponent(rdbEquivalencia))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblSubirLista.setText("Subir Lista:");

        btnSubirLista.setText("Buscar");
        btnSubirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirListaActionPerformed(evt);
            }
        });

        lblCarrera.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCarrera.setText("Carrera:");
        lblCarrera.setToolTipText("");

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblCuatrimestre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCuatrimestre.setText("Cuatrimestre:");
        lblCuatrimestre.setToolTipText("");

        cmbCuatrimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblGrupo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblGrupo.setText("Grupo:");
        lblGrupo.setToolTipText("");

        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblSubirLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCorreo)
                                .addComponent(lblTelefono)
                                .addComponent(lblNombre)
                                .addComponent(lblMatricula)
                                .addComponent(lblAp)
                                .addComponent(lblAm)
                                .addComponent(lblCarrera)
                                .addComponent(lblCuatrimestre)
                                .addComponent(lblGrupo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreo)
                                .addComponent(txtAm)
                                .addComponent(txtAp, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txtTelefono)
                                .addComponent(cmbCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCuatrimestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAp)
                    .addComponent(txtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAm)
                    .addComponent(txtAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarrera)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuatrimestre)
                    .addComponent(cmbCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrupo)
                    .addComponent(cmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubirLista)
                    .addComponent(lblSubirLista))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlInferioFormularioLayout = new javax.swing.GroupLayout(pnlInferioFormulario);
        pnlInferioFormulario.setLayout(pnlInferioFormularioLayout);
        pnlInferioFormularioLayout.setHorizontalGroup(
            pnlInferioFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInferioFormularioLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlInferioFormularioLayout.setVerticalGroup(
            pnlInferioFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInferioFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pnlCentral.add(pnlInferioFormulario, java.awt.BorderLayout.LINE_START);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(0, 51, 102));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro");
        jPanel11.add(jLabel3);

        jPanel12.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.Y_AXIS));

        lblFiltr.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        lblFiltr.setText("Busca por Clave o Nombre");
        lblFiltr.setToolTipText("");
        jPanel16.add(lblFiltr);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setToolTipText("");
        jPanel16.add(jTextField1);

        jPanel13.setBackground(new java.awt.Color(0, 51, 102));
        jPanel13.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alumnos");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel16.add(jPanel13);

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel15.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setLayout(new javax.swing.BoxLayout(pnlMenu, javax.swing.BoxLayout.Y_AXIS));

        jLabel12.setText("          ");
        jLabel12.setToolTipText("");
        pnlMenu.add(jLabel12);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/New Window.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNuevo);

        jLabel13.setText("          ");
        jLabel13.setToolTipText("");
        pnlMenu.add(jLabel13);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnGuardar);

        jLabel14.setText("          ");
        jLabel14.setToolTipText("");
        pnlMenu.add(jLabel14);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel File.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCancelar);

        jLabel15.setText("          ");
        jLabel15.setToolTipText("");
        pnlMenu.add(jLabel15);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete File.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        pnlMenu.add(btnEliminar);

        jLabel16.setText("          ");
        jLabel16.setToolTipText("");
        pnlMenu.add(jLabel16);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit File.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        pnlMenu.add(btnModificar);

        jLabel17.setText("          ");
        jLabel17.setToolTipText("");
        pnlMenu.add(jLabel17);

        jLabel18.setText("          ");
        jLabel18.setToolTipText("");
        pnlMenu.add(jLabel18);

        jLabel19.setText("          ");
        jLabel19.setToolTipText("");
        pnlMenu.add(jLabel19);

        jLabel20.setText("          ");
        jLabel20.setToolTipText("");
        pnlMenu.add(jLabel20);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop 50.png"))); // NOI18N
        btnSalir.setToolTipText("Cerrar");
        pnlMenu.add(btnSalir);

        jPanel15.add(pnlMenu, java.awt.BorderLayout.LINE_START);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel12);

        pnlFormulario.add(jPanel10, "card2");

        pnlCentral.add(pnlFormulario, java.awt.BorderLayout.CENTER);

        pnlSecundario.add(pnlCentral, java.awt.BorderLayout.CENTER);

        jScrollPane2.setViewportView(pnlSecundario);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicio()
    {
       this.txtMatricula.setEnabled(false);
        this.txtNombre.setEnabled(false);
        this.txtAp.setEnabled(false);
        this.txtAm.setEnabled(false);
        this.txtCorreo.setEnabled(false);
        this.txtTelefono.setEnabled(false);
        this.rdbEquivalencia.setEnabled(false);
        this.rdbInscrito.setEnabled(false);
        this.rdbNoInscrito.setEnabled(false);
        this.btnSubirLista.setEnabled(false);
        this.cmbCarrera.setEnabled(false);
        this.cmbCuatrimestre.setEnabled(false);
        this.cmbGrupo.setEnabled(false);

        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnSalir.setEnabled(true); 
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        this.txtMatricula.setEnabled(true);
        this.txtNombre.setEnabled(true);
        this.txtAp.setEnabled(true);
        this.txtAm.setEnabled(true);
        this.txtCorreo.setEnabled(true);
        this.txtTelefono.setEnabled(true);
        this.rdbEquivalencia.setEnabled(true);
        this.rdbInscrito.setEnabled(true);
        this.rdbNoInscrito.setEnabled(true);
        this.btnSubirLista.setEnabled(true);
        this.cmbCarrera.setEnabled(true);
        this.cmbCuatrimestre.setEnabled(true);
        this.cmbGrupo.setEnabled(true);

        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSubirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirListaActionPerformed
       
    }//GEN-LAST:event_btnSubirListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSubirLista;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JComboBox<String> cmbCuatrimestre;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAm;
    private javax.swing.JLabel lblAp;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCuatrimestre;
    private javax.swing.JLabel lblFiltr;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblLogoHgo;
    private javax.swing.JLabel lblLogoHgo1;
    private javax.swing.JLabel lblLogoSep;
    private javax.swing.JLabel lblLogoUtyp;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSubirLista;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInferioFormulario;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JRadioButton rdbEquivalencia;
    private javax.swing.JRadioButton rdbInscrito;
    private javax.swing.JRadioButton rdbNoInscrito;
    private javax.swing.JTextField txtAm;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    Conexion cc = new Conexion();
    Connection cn = cc.getConectar();

}
