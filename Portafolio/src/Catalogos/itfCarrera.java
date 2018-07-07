
package Catalogos;

import Conexion.Conexion;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;



public class itfCarrera extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Character s;

    public itfCarrera() 
    {
        initComponents();

        limpiar();
        bloquear();
        cargar(""); 
        this.txtIdCarrera.setEnabled(false);
        this.txtIdCarrera.setVisible(false);
        
    }

    
    // 1. Validacion de letras y espacios
    //  a) crear metodo
    //  b) agregar KeyType event en la cja de texto
    public void soloLetras(KeyEvent evt)
    {
        s = evt.getKeyChar();
        if (!Character.isLetter(s) && s != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }
    
    public void soloNumeros(KeyEvent evt)
    {
        s = evt.getKeyChar();
        if (Character.isLetter(s) && s != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }
    
    public  void soloMayusculas(KeyEvent evt)
    {
        char c=evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad=(""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }
    
    public void cargar(String valor)
    {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Clave");
        model.addColumn("Descripcón");
        
        tblDatos.setModel(model);
        
        String sql= "select * from carreras where CONCAT (clave,' ',nombreCarrera) LIKE '%" + valor + "%'";
//        if (valor.equals("")) {
//            sql="SELECT * FROM carreras";
//        } else {
//            sql="select * from carreras where CONCAT (clave,' ',nombreCarrera) LIKE '%" + valor + "%'";
//        }
        String []datos=new String[3];
        try {
            st= cn.createStatement();
            rs =st.executeQuery(sql);
            
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                model.addRow(datos);
            }
            tblDatos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(itfDocentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmCarreras = new javax.swing.JPopupMenu();
        pmiModificar = new javax.swing.JMenuItem();
        pmiEliminar = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlSecundario = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lblLogoHgo = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblLogoHgo1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblLogoSep = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblLogoUtyp = new javax.swing.JLabel();
        pnlPie = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        javax.swing.JPanel pnlCentral = new javax.swing.JPanel();
        pnlInferioFormulario = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdCarrera = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        pnlFormulario = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblFiltr = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        pmiModificar.setText("Modificar");
        pmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmiModificarActionPerformed(evt);
            }
        });
        ppmCarreras.add(pmiModificar);

        pmiEliminar.setText("Eliminar");
        pmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmiEliminarActionPerformed(evt);
            }
        });
        ppmCarreras.add(pmiEliminar);

        pnlSecundario.setBackground(new java.awt.Color(255, 255, 255));
        pnlSecundario.setLayout(new java.awt.BorderLayout());

        pnlEncabezado.setBackground(new java.awt.Color(0, 153, 0));
        pnlEncabezado.setLayout(new javax.swing.BoxLayout(pnlEncabezado, javax.swing.BoxLayout.LINE_AXIS));

        jLabel25.setText("         ");
        jLabel25.setToolTipText("");
        pnlEncabezado.add(jLabel25);

        lblLogoHgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UPFIM.png"))); // NOI18N
        pnlEncabezado.add(lblLogoHgo);

        jLabel26.setText("                           ");
        jLabel26.setToolTipText("");
        pnlEncabezado.add(jLabel26);

        lblLogoHgo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edo_Hgo_Logo.png"))); // NOI18N
        pnlEncabezado.add(lblLogoHgo1);

        jLabel27.setText("         ");
        jLabel27.setToolTipText("");
        pnlEncabezado.add(jLabel27);

        lblCarrera.setBackground(new java.awt.Color(255, 255, 255));
        lblCarrera.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        lblCarrera.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarrera.setText("  UPFIM  ");
        lblCarrera.setToolTipText("");
        lblCarrera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlEncabezado.add(lblCarrera);

        jLabel30.setText("                           ");
        jLabel30.setToolTipText("");
        pnlEncabezado.add(jLabel30);

        lblLogoSep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SecEduPub.png"))); // NOI18N
        pnlEncabezado.add(lblLogoSep);

        jLabel31.setText("                           ");
        jLabel31.setToolTipText("");
        pnlEncabezado.add(jLabel31);

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

        lblClave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblClave.setText("Clave:");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check File.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar Registro");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                .addComponent(txtNombre)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(163, 163, 163)
                                    .addComponent(lblClave))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(lblNombre)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(lblClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnActualizar)
                .addContainerGap(386, Short.MAX_VALUE))
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
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.Y_AXIS));

        lblFiltr.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        lblFiltr.setText("Busca por Clave o Nombre");
        lblFiltr.setToolTipText("");
        jPanel16.add(lblFiltr);

        txtFiltro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFiltro.setToolTipText("");
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        jPanel16.add(txtFiltro);

        jPanel13.setBackground(new java.awt.Color(0, 51, 102));
        jPanel13.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Carreras");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnMostrarTodo.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(btnMostrarTodo)
                .addGap(0, 950, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(btnMostrarTodo)
                .addGap(0, 117, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        jPanel16.add(jPanel13);

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDatos.setComponentPopupMenu(ppmCarreras);
        jScrollPane3.setViewportView(tblDatos);

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
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnEliminar);

        jLabel16.setText("          ");
        jLabel16.setToolTipText("");
        pnlMenu.add(jLabel16);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit File.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnModificar);

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
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
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
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        habilitar();
        txtClave.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void habilitar() {
        this.txtClave.setEnabled(true);
        this.txtNombre.setEnabled(true);

//        this.tblDatos.setEnabled(true);
        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnSalir.setEnabled(true);
    }

    private void bloquear() {
        this.txtClave.setEnabled(false);
        this.txtNombre.setEnabled(false);
        
//        this.tblDatos.setEnabled(false);
        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(false);
        this.btnSalir.setEnabled(true);
        this .btnActualizar.setVisible(false);
    }

    private void limpiar() {
        this.txtIdCarrera.setText("");
        this.txtClave.setText("");
        this.txtNombre.setText("");
        this.tblDatos.clearSelection();
    }

    private void guardar() {

        String clave;
        String nombre;
        String sql = "";
//        String sql1 = "";

        clave = txtClave.getText();
        nombre = txtNombre.getText();
        
//        sql= "select * from vistaCarreras where clave = '"+txtClave.getText()+"'";
        sql = "call insertarCarreras(?,?)";
               
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            pst.setString(2, nombre);

            int n = pst.executeUpdate();

            if (n > 0) {
                cargar("");
                JOptionPane.showMessageDialog(null, "Registro Guardado exitosamente");
                limpiar();
                bloquear();                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El registro ya existe  " );
            limpiar();
            bloquear();  
        }

    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int aux = 0;

        if (aux == 0) {
            if (txtClave.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios!!");
            } else if (txtNombre.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo de Nombre esta vacio!!");
            } else {
                this.guardar();
                this.bloquear();
            }
        } else if (aux == 1) {
            if (txtClave.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo de Clave esta vacio!!");
            } else if (txtNombre.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "El campo de Nombre esta vacio!!");
            } else {
                this.actualiza();
                this.bloquear();
            }
            aux--;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void actualizar() {

        int id, opc;
        
        opc = JOptionPane.showConfirmDialog(null, "Desea actualizar el registro?");

        if (opc == JOptionPane.YES_OPTION) {
            try {
                pst = cn.prepareStatement("{call actualizarCarreras(?,?)}");
                pst.setString(1, txtClave.getText().toUpperCase());
                pst.setString(2, txtNombre.getText());
                String idClave = null;
                id = Integer.parseInt(idClave);
                pst.setInt(3, id);
                pst.executeUpdate();
                bloquear();
                cc.setDesconectar(cn);
                JOptionPane.showMessageDialog(null, "El registro se actualizó Correctamente.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error sql " + e);
                cc.setDesconectar(cn);
            }
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        limpiar();
        bloquear();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        txtClave.transferFocus();
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargar(txtFiltro.getText());

    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        this.txtFiltro.setText("");
        cargar("");
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed


        
        int filaseleccionada;

     try{     
         filaseleccionada= tblDatos.getSelectedRow();
         
         if (filaseleccionada==-1){
         
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

         }else{

             DefaultTableModel modelotabla=(DefaultTableModel) tblDatos.getModel();
           
             String id=(String)modelotabla.getValueAt(filaseleccionada, 0);
             String clave=(String)modelotabla.getValueAt(filaseleccionada, 1);
             String nombre=(String) modelotabla.getValueAt(filaseleccionada, 2);

             txtIdCarrera.setText(id);
             txtClave.setText(clave);
             txtNombre.setText(nombre);
             btnActualizar.setVisible(true);
             habilitar();
          }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void actualiza()
    {
        int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea actualizar el registro? ");
        if(JOptionPane.OK_OPTION==confirmar) 
        {
             try {
                 
            pst=cn.prepareStatement("UPDATE carreras SET clave='"+txtClave.getText()+"', nombreCarrera='"+txtNombre.getText()+"' WHERE idCarrera='"+txtIdCarrera.getText()+"'");

            pst.executeUpdate();
            cargar("");
            JOptionPane.showMessageDialog(null, "El registro ha sido actualizado exitosamente", 
                                                  "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar el registro\n Inténtelo nuevamente.\n"
                                        + "Error: "+error, "Error en la operación", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
       
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        elimina();
        bloquear();           
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmiModificarActionPerformed
        
        int fila = tblDatos.getSelectedRow();
        if (fila>=0) {
            txtIdCarrera.setText(tblDatos.getValueAt(fila, 0).toString());
            txtClave.setText(tblDatos.getValueAt(fila, 1).toString());
            txtNombre.setText(tblDatos.getValueAt(fila, 2).toString());
            habilitar();
            btnActualizar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No seleciono fila. ");
        }
        
    }//GEN-LAST:event_pmiModificarActionPerformed

    private void pmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmiEliminarActionPerformed
        habilitar();
        elimina();
        bloquear();
    }//GEN-LAST:event_pmiEliminarActionPerformed

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        soloMayusculas(evt);
        soloLetras(evt);
    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        soloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                
        this.actualiza();
        this.bloquear();
        this.limpiar();
            
    }//GEN-LAST:event_btnActualizarActionPerformed

public void elimina()
{
    DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
    int fila = tblDatos.getSelectedRow();
   
    if (fila<0) {
        JOptionPane.showMessageDialog(null,  "Debe seleccionar una fila de la tabla" );
        
    } else {
        String id= "";
        id=tblDatos.getValueAt(fila, 0).toString();
        int confirmar=JOptionPane.showConfirmDialog(null, "Esta seguro que desea Eliminar el registro? ");
        
        if (JOptionPane.OK_OPTION==confirmar) 
        {
            
            try {        
                        
            PreparedStatement pst = cn.prepareStatement("call eliminarCarrera('"+ id+"') ");
            pst.executeUpdate();
            cargar("");
            JOptionPane.showMessageDialog(null, "El registro ha sido eliminado exitosamente", 
                                                  "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            habilitar();
            txtClave.requestFocus();
            } catch (SQLException error) 
            {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n Inténtelo nuevamente.\n"
                                        + "Error: "+error, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblFiltr;
    private javax.swing.JLabel lblLogoHgo;
    private javax.swing.JLabel lblLogoHgo1;
    private javax.swing.JLabel lblLogoSep;
    private javax.swing.JLabel lblLogoUtyp;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JMenuItem pmiEliminar;
    private javax.swing.JMenuItem pmiModificar;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInferioFormulario;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JPopupMenu ppmCarreras;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtIdCarrera;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    Conexion cc = new Conexion();
    Connection cn = cc.getConectar();

}
