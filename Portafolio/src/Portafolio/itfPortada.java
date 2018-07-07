
package Portafolio;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class itfPortada extends javax.swing.JInternalFrame {

   
    public itfPortada() {
        initComponents();
        
        cargarCarrera();
        cargarCuatrimestre();
    }

 
    public void cargarCarrera()
    {
        try {            
            Statement st = cn.createStatement();                
            ResultSet rs = st.executeQuery("select * from vistaCarrera; ");

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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        btnMostrarTodo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pnlPrincipal2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlSecundario2 = new javax.swing.JPanel();
        pnlEncabezado2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblLogoHgo4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblLogoHgo5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblCarrera1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblLogoSep2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblLogoUtyp2 = new javax.swing.JLabel();
        pnlPie2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        javax.swing.JPanel pnlCentral2 = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblFiltr = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnlMenu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnSubirLista = new javax.swing.JButton();
        lblSubirLista = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblgrupo = new javax.swing.JLabel();
        cmbGrupo = new javax.swing.JComboBox<>();
        lblPeriodoCuatrimestral = new javax.swing.JLabel();
        cmbPeriodoCuatrimestral = new javax.swing.JComboBox<>();
        cmbCuatrimestre = new javax.swing.JComboBox<>();
        lblCuatrimestre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbCarrera = new javax.swing.JComboBox<>();
        lblCarrera = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        lblDocente = new javax.swing.JLabel();
        cmbDocente = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblFecha = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel14.setBackground(new java.awt.Color(0, 51, 102));
        jPanel14.setToolTipText("");

        btnMostrarTodo.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Portada");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnMostrarTodo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1493, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnMostrarTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlSecundario2.setBackground(new java.awt.Color(255, 255, 255));
        pnlSecundario2.setLayout(new java.awt.BorderLayout());

        pnlEncabezado2.setBackground(new java.awt.Color(0, 153, 0));
        pnlEncabezado2.setLayout(new javax.swing.BoxLayout(pnlEncabezado2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel15.setText("          ");
        jLabel15.setToolTipText("");
        pnlEncabezado2.add(jLabel15);

        jLabel31.setText("                     ");
        jLabel31.setToolTipText("");
        pnlEncabezado2.add(jLabel31);

        lblLogoHgo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UPFIM.png"))); // NOI18N
        pnlEncabezado2.add(lblLogoHgo4);

        jLabel16.setText("                     ");
        jLabel16.setToolTipText("");
        pnlEncabezado2.add(jLabel16);

        lblLogoHgo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edo_Hgo_Logo.png"))); // NOI18N
        pnlEncabezado2.add(lblLogoHgo5);

        jLabel32.setText("                     ");
        jLabel32.setToolTipText("");
        pnlEncabezado2.add(jLabel32);

        lblCarrera1.setBackground(new java.awt.Color(255, 255, 255));
        lblCarrera1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        lblCarrera1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrera1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarrera1.setText("  UPFIM  ");
        lblCarrera1.setToolTipText("");
        lblCarrera1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlEncabezado2.add(lblCarrera1);

        jLabel33.setText("                     ");
        jLabel33.setToolTipText("");
        pnlEncabezado2.add(jLabel33);

        lblLogoSep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SecEduPub.png"))); // NOI18N
        pnlEncabezado2.add(lblLogoSep2);

        jLabel35.setText("                     ");
        jLabel35.setToolTipText("");
        pnlEncabezado2.add(jLabel35);

        lblLogoUtyp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UTyPLogo.png"))); // NOI18N
        pnlEncabezado2.add(lblLogoUtyp2);

        pnlSecundario2.add(pnlEncabezado2, java.awt.BorderLayout.PAGE_START);

        pnlPie2.setBackground(new java.awt.Color(0, 153, 0));
        pnlPie2.setLayout(new javax.swing.BoxLayout(pnlPie2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel17.setText("          ");
        jLabel17.setToolTipText("");
        pnlPie2.add(jLabel17);

        pnlSecundario2.add(pnlPie2, java.awt.BorderLayout.PAGE_END);

        pnlCentral2.setLayout(new java.awt.BorderLayout());

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setLayout(new java.awt.CardLayout());

        jPanel11.setLayout(new java.awt.GridLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(0, 51, 102));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtro");
        jPanel13.add(jLabel4);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

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

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setLayout(new javax.swing.BoxLayout(pnlMenu, javax.swing.BoxLayout.Y_AXIS));

        jLabel18.setText("          ");
        jLabel18.setToolTipText("");
        pnlMenu.add(jLabel18);

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

        jLabel19.setText("          ");
        jLabel19.setToolTipText("");
        pnlMenu.add(jLabel19);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnGuardar);

        jLabel20.setText("          ");
        jLabel20.setToolTipText("");
        pnlMenu.add(jLabel20);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel File.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCancelar);

        jLabel36.setText("          ");
        jLabel36.setToolTipText("");
        pnlMenu.add(jLabel36);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete File.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        pnlMenu.add(btnEliminar);

        jLabel37.setText("          ");
        jLabel37.setToolTipText("");
        pnlMenu.add(jLabel37);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit File.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        pnlMenu.add(btnModificar);

        jLabel38.setText("          ");
        jLabel38.setToolTipText("");
        pnlMenu.add(jLabel38);

        jLabel39.setText("          ");
        jLabel39.setToolTipText("");
        pnlMenu.add(jLabel39);

        jLabel40.setText("          ");
        jLabel40.setToolTipText("");
        pnlMenu.add(jLabel40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop 50.png"))); // NOI18N
        btnSalir.setToolTipText("Cerrar");
        pnlMenu.add(btnSalir);

        jPanel15.add(pnlMenu, java.awt.BorderLayout.LINE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 133, 169), 2, true));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check File.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar Registro");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSubirLista.setText("Buscar");
        btnSubirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirListaActionPerformed(evt);
            }
        });

        lblSubirLista.setText("Subir Lista:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));

        lblgrupo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblgrupo.setText("Grupo:");

        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGrupo.setToolTipText("Selecciona a un grupo.");

        lblPeriodoCuatrimestral.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPeriodoCuatrimestral.setText("Periodo Cuatrimestral");

        cmbPeriodoCuatrimestral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPeriodoCuatrimestral.setToolTipText("Selecciona un Periodo");

        cmbCuatrimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCuatrimestre.setToolTipText("Selecciona un Cuatrimestre");

        lblCuatrimestre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCuatrimestre.setText("Cuatrimestre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPeriodoCuatrimestral, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuatrimestre)
                    .addComponent(lblgrupo)
                    .addComponent(lblPeriodoCuatrimestral))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCuatrimestre, cmbGrupo, cmbPeriodoCuatrimestral});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblPeriodoCuatrimestral)
                .addGap(18, 18, 18)
                .addComponent(cmbPeriodoCuatrimestral, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCuatrimestre)
                .addGap(15, 15, 15)
                .addComponent(cmbCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblgrupo)
                .addGap(18, 18, 18)
                .addComponent(cmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbCuatrimestre, cmbGrupo, cmbPeriodoCuatrimestral});

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));

        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCarrera.setToolTipText("Selecciona Programa Educativo");

        lblCarrera.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCarrera.setText("Carrera:");

        lblAsignatura.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAsignatura.setText("Asignatura:");

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAsignatura.setToolTipText("Selecciona  Asinatura");

        lblDocente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDocente.setText("Docente");
        lblDocente.setToolTipText("");

        cmbDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDocente.setToolTipText("Selecciona a un docente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbAsignatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAsignatura)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCarrera))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDocente, 0, 468, Short.MAX_VALUE)
                            .addComponent(lblDocente))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbAsignatura, cmbCarrera, cmbDocente});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblCarrera)
                .addGap(18, 18, 18)
                .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAsignatura)
                .addGap(19, 19, 19)
                .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDocente)
                .addGap(18, 18, 18)
                .addComponent(cmbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbAsignatura, cmbCarrera, cmbDocente});

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFecha.setText("Fecha:");

        jDateChooser1.setToolTipText("Selecciona la Fecha");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lblSubirLista)
                        .addGap(42, 42, 42)
                        .addComponent(btnSubirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(lblFecha)
                            .addGap(35, 35, 35)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubirLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubirLista))
                .addGap(193, 193, 193))
        );

        jPanel15.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12);

        pnlFormulario.add(jPanel11, "card2");

        pnlCentral2.add(pnlFormulario, java.awt.BorderLayout.CENTER);

        pnlSecundario2.add(pnlCentral2, java.awt.BorderLayout.CENTER);

        jScrollPane4.setViewportView(pnlSecundario2);

        javax.swing.GroupLayout pnlPrincipal2Layout = new javax.swing.GroupLayout(pnlPrincipal2);
        pnlPrincipal2.setLayout(pnlPrincipal2Layout);
        pnlPrincipal2Layout.setHorizontalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        pnlPrincipal2Layout.setVerticalGroup(
            pnlPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

//        this.actualiza();
//        this.bloquear();
//        this.limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSubirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirListaActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        // this.txtFiltro.setText("");
        //cargar("");
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

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

        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSubirLista;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JComboBox<String> cmbCuatrimestre;
    private javax.swing.JComboBox<String> cmbDocente;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JComboBox<String> cmbPeriodoCuatrimestral;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAm;
    private javax.swing.JLabel lblAm1;
    private javax.swing.JLabel lblAp;
    private javax.swing.JLabel lblAp1;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCarrera1;
    private javax.swing.JLabel lblCuatrimestre;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblFiltr;
    private javax.swing.JLabel lblLogoHgo;
    private javax.swing.JLabel lblLogoHgo1;
    private javax.swing.JLabel lblLogoHgo2;
    private javax.swing.JLabel lblLogoHgo3;
    private javax.swing.JLabel lblLogoHgo4;
    private javax.swing.JLabel lblLogoHgo5;
    private javax.swing.JLabel lblLogoSep;
    private javax.swing.JLabel lblLogoSep1;
    private javax.swing.JLabel lblLogoSep2;
    private javax.swing.JLabel lblLogoUtyp;
    private javax.swing.JLabel lblLogoUtyp1;
    private javax.swing.JLabel lblLogoUtyp2;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMatricula1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPeriodoCuatrimestral;
    private javax.swing.JLabel lblSubirLista;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlCentral1;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlEncabezado1;
    private javax.swing.JPanel pnlEncabezado2;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInferioFormulario;
    private javax.swing.JPanel pnlInferioFormulario1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPanel pnlPie1;
    private javax.swing.JPanel pnlPie2;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrincipal1;
    private javax.swing.JPanel pnlPrincipal2;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JPanel pnlSecundario1;
    private javax.swing.JPanel pnlSecundario2;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JPanel pnlStatus1;
    private javax.swing.JRadioButton rdbEquivalencia;
    private javax.swing.JRadioButton rdbEquivalencia1;
    private javax.swing.JRadioButton rdbInscrito;
    private javax.swing.JRadioButton rdbInscrito1;
    private javax.swing.JRadioButton rdbNoInscrito;
    private javax.swing.JRadioButton rdbNoInscrito1;
    private javax.swing.JTextField txtAm;
    private javax.swing.JTextField txtAm1;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtAp1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatricula1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables

    Conexion cc = new Conexion();
    Connection cn = cc.getConectar();

}
