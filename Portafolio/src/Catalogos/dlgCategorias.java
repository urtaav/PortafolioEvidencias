
package Catalogos;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class dlgCategorias extends javax.swing.JDialog 
{

    DefaultTableModel model;
    
    public dlgCategorias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        limpiar();
        bloquear();
        cargar("");
        
        
    }

    dlgCategorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   private void habilitar()
    {
        this.txtClave.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
        

        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnSalir.setEnabled(true);
    }
    
    private void bloquear()
    {
        this.txtClave.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        

        this.btnNuevo.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnCancelar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnSalir.setEnabled(true);
    }
    
    private void limpiar()
    {
        this.txtClave.setText("");
        this.txtDescripcion.setText("");
        
    }

  void cargar(String valor)
    {
        String [] titulos={"Clave","Programa educativo"};
        String [] registros= new String[2];
        
        String sql = "select * from carrera where CONCAT (clave,' ',nombreCarrera) LIKE '%"+valor+"%'";
        
        model = new DefaultTableModel(null, titulos);
        
//        Conexion cc = new Conexion();
//        Connection cn = cc.getConectar();
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                registros[0]=rs.getString("clave");
                registros[1]=rs.getString("nombreCarrera");
                model.addRow(registros);
            }
            
            tblDatos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        lbltituloCategorias = new javax.swing.JLabel();
        pnlPie = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pnlFormulario = new javax.swing.JPanel();
        lblClave = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblFiltro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFiltr = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnMostrarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new java.awt.BorderLayout());

        pnlEncabezado.setBackground(new java.awt.Color(0, 153, 0));
        pnlEncabezado.setLayout(new java.awt.BorderLayout(1, 0));

        lbltituloCategorias.setBackground(new java.awt.Color(255, 255, 255));
        lbltituloCategorias.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        lbltituloCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lbltituloCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltituloCategorias.setText("Categorias");
        lbltituloCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlEncabezado.add(lbltituloCategorias, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnlEncabezado, java.awt.BorderLayout.PAGE_START);

        pnlPie.setBackground(new java.awt.Color(0, 153, 0));
        pnlPie.setLayout(new javax.swing.BoxLayout(pnlPie, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("    ");
        pnlPie.add(jLabel2);

        pnlPrincipal.add(pnlPie, java.awt.BorderLayout.PAGE_END);

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setLayout(new javax.swing.BoxLayout(pnlMenu, javax.swing.BoxLayout.Y_AXIS));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnGuardar);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel File.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCancelar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete File.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        pnlMenu.add(btnEliminar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit File.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        pnlMenu.add(btnModificar);

        jPanel1.add(pnlMenu);

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
        jPanel1.add(btnNuevo);

        jLabel20.setText("          ");
        jLabel20.setToolTipText("");
        jPanel1.add(jLabel20);

        btnSalir.setBackground(new java.awt.Color(0, 153, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop 50.png"))); // NOI18N
        btnSalir.setToolTipText("Cerrar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);

        pnlCentral.add(jPanel1, java.awt.BorderLayout.LINE_END);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        lblClave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblClave.setText("Clave:");

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDescripcion.setText("Descripción");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tblDatos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(0, 51, 102));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        lblFiltro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblFiltro.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltro.setText("Filtro:");
        lblFiltro.setToolTipText("");
        jPanel11.add(lblFiltro);

        jLabel1.setText("   ");
        jLabel1.setToolTipText("");
        jPanel11.add(jLabel1);

        lblFiltr.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        lblFiltr.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltr.setText("Busca por Clave o Descripción");
        lblFiltr.setToolTipText("");
        jPanel11.add(lblFiltr);

        jPanel2.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        txtFiltro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFiltro.setToolTipText("");
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });
        jPanel2.add(txtFiltro, java.awt.BorderLayout.CENTER);

        btnMostrarTodo.setBackground(new java.awt.Color(0, 51, 102));
        btnMostrarTodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarTodo.setText("Mostrar Todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodo, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFormularioLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlFormularioLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDescripcion)
                                .addComponent(lblClave))
                            .addGap(65, 65, 65)
                            .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCentral.add(pnlFormulario, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnlCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        this.txtClave.setEnabled(true);
        this.txtDescripcion.setEnabled(true);
       

        this.btnNuevo.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnCancelar.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnSalir.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        limpiar();
        bloquear();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String clave;
        String nombre;
        String sql = "";
        PreparedStatement pst;
        
        clave = txtClave.getText();
        nombre = txtDescripcion.getText();
        
        sql="call insertarCarrera(?,?)";
        
        try {
            pst=cn.prepareStatement(sql);
            pst.setString(1,clave);
            pst.setString(2,nombre);
            
            int n=pst.executeUpdate();
            
            if (n>0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado exitosamente");
                limpiar();
                bloquear();
                cargar("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(itfCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        txtClave.transferFocus();
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        txtDescripcion.transferFocus();
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
         this.txtFiltro.setText("");
        cargar("");
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        cargar(txtFiltro.getText());
    }//GEN-LAST:event_txtFiltroKeyReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFiltr;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lbltituloCategorias;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPie;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables

    Conexion cc = new Conexion();
    Connection cn = cc.getConectar();
}
