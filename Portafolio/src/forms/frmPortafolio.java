/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Catalogos.itfAlumnos;
import Catalogos.itfCarrera;
import Catalogos.itfDocentes;
import Panels.itfPlantilla;
import Panels.pnlPlantilla;
import Portafolio.itfPortada;
import javax.swing.UIManager;



public class frmPortafolio extends javax.swing.JFrame {

    /**
     * Creates new form frmPortafolio
     */
    public frmPortafolio() {
        initComponents();
//        try{  
//            this.setDefaultLookAndFeelDecorated(true);
//            //JDialog.setDefaultLookAndFeelDecorated(true);
//            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//          //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//          UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//          //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//        }catch (Exception e)
//         {
//          e.printStackTrace();
//         }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        pnlEncabezado = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        jmnAchivo = new javax.swing.JMenu();
        jmnPortafolio = new javax.swing.JMenu();
        mniPortada = new javax.swing.JMenuItem();
        mniIndice = new javax.swing.JMenuItem();
        mniPlanCuatrimestral = new javax.swing.JMenuItem();
        mniLista = new javax.swing.JMenuItem();
        mniEvaluaciones = new javax.swing.JMenuItem();
        mniSeguimiento = new javax.swing.JMenuItem();
        mniHorario = new javax.swing.JMenuItem();
        mniCerrarSesion = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        jmnCatalogos = new javax.swing.JMenu();
        mniProgramaEducativo = new javax.swing.JMenuItem();
        mniDocentes = new javax.swing.JMenuItem();
        mniAlumnos = new javax.swing.JMenuItem();
        mniAsignaturas = new javax.swing.JMenuItem();
        mniTemas = new javax.swing.JMenuItem();
        jmnReportes = new javax.swing.JMenu();
        mniReportes = new javax.swing.JMenuItem();
        mniGenerarPortafolio = new javax.swing.JMenuItem();
        jmnHerramientas = new javax.swing.JMenu();
        jmnBaseDatos = new javax.swing.JMenu();
        mniGenerarRespaldo = new javax.swing.JMenuItem();
        mniSubirRespaldo = new javax.swing.JMenuItem();
        jmnCambiarPass = new javax.swing.JMenuItem();
        jmnAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setLayout(new java.awt.BorderLayout());
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        pnlEncabezado.setBackground(new java.awt.Color(255, 255, 255));

        lblEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Banner_png75.png"))); // NOI18N
        pnlEncabezado.add(lblEncabezado);

        getContentPane().add(pnlEncabezado, java.awt.BorderLayout.PAGE_START);

        jmnAchivo.setText("Archivo");

        jmnPortafolio.setText("Portafolio");

        mniPortada.setText("Portada");
        mniPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPortadaActionPerformed(evt);
            }
        });
        jmnPortafolio.add(mniPortada);

        mniIndice.setText("Indice");
        jmnPortafolio.add(mniIndice);

        mniPlanCuatrimestral.setText("Plan Cuatrimestral");
        jmnPortafolio.add(mniPlanCuatrimestral);

        mniLista.setText("Lista");
        jmnPortafolio.add(mniLista);

        mniEvaluaciones.setText("Evaluación");
        jmnPortafolio.add(mniEvaluaciones);

        mniSeguimiento.setText("Seguimiento");
        jmnPortafolio.add(mniSeguimiento);

        mniHorario.setText("Horario");
        jmnPortafolio.add(mniHorario);

        jmnAchivo.add(jmnPortafolio);

        mniCerrarSesion.setText("Cerrar Sesión");
        jmnAchivo.add(mniCerrarSesion);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jmnAchivo.add(mniSalir);

        mnbMenu.add(jmnAchivo);

        jmnCatalogos.setText("Catalogos");

        mniProgramaEducativo.setText("Programa Educativo");
        mniProgramaEducativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProgramaEducativoActionPerformed(evt);
            }
        });
        jmnCatalogos.add(mniProgramaEducativo);

        mniDocentes.setText("Docentes");
        mniDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocentesActionPerformed(evt);
            }
        });
        jmnCatalogos.add(mniDocentes);

        mniAlumnos.setText("Alumnos");
        mniAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlumnosActionPerformed(evt);
            }
        });
        jmnCatalogos.add(mniAlumnos);

        mniAsignaturas.setText("Asignaturas");
        mniAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAsignaturasActionPerformed(evt);
            }
        });
        jmnCatalogos.add(mniAsignaturas);

        mniTemas.setText("Temas");
        mniTemas.setToolTipText("");
        mniTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTemasActionPerformed(evt);
            }
        });
        jmnCatalogos.add(mniTemas);

        mnbMenu.add(jmnCatalogos);

        jmnReportes.setText("Reportes");

        mniReportes.setText("Reportes");
        mniReportes.setToolTipText("");
        jmnReportes.add(mniReportes);

        mniGenerarPortafolio.setText("Generar Portafolio");
        mniGenerarPortafolio.setToolTipText("");
        jmnReportes.add(mniGenerarPortafolio);

        mnbMenu.add(jmnReportes);

        jmnHerramientas.setText("Herramientas");

        jmnBaseDatos.setText("Base de Datos");

        mniGenerarRespaldo.setText("Generar Respaldo");
        mniGenerarRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGenerarRespaldoActionPerformed(evt);
            }
        });
        jmnBaseDatos.add(mniGenerarRespaldo);

        mniSubirRespaldo.setText("Subir Respaldo");
        jmnBaseDatos.add(mniSubirRespaldo);

        jmnHerramientas.add(jmnBaseDatos);

        jmnCambiarPass.setText("Cambiar cotraseña de Usuario");
        jmnHerramientas.add(jmnCambiarPass);

        mnbMenu.add(jmnHerramientas);

        jmnAyuda.setText("Ayuda");
        mnbMenu.add(jmnAyuda);

        setJMenuBar(mnbMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniProgramaEducativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProgramaEducativoActionPerformed

        itfCarrera pe = new itfCarrera();
        this.escritorio.add(pe);
        pe.setVisible(true);
    }//GEN-LAST:event_mniProgramaEducativoActionPerformed

    private void mniDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocentesActionPerformed

        itfDocentes docentes = new itfDocentes();
        this.escritorio.add(docentes);
        docentes.setVisible(true);
    }//GEN-LAST:event_mniDocentesActionPerformed

    private void mniAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlumnosActionPerformed

        itfAlumnos alumnos = new itfAlumnos();
        
        this.escritorio.add(alumnos);
        alumnos.setVisible(true);
    }//GEN-LAST:event_mniAlumnosActionPerformed

    private void mniAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAsignaturasActionPerformed

        itfCarrera carrera = new itfCarrera();
        this.escritorio.add(carrera);
        carrera.setVisible(true);
    }//GEN-LAST:event_mniAsignaturasActionPerformed

    private void mniTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTemasActionPerformed

//        itfTemas temas = new itfTemas();
//        this.escritorio.add(temas);
//        temas.setVisible(true);
    }//GEN-LAST:event_mniTemasActionPerformed

    private void mniGenerarRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGenerarRespaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniGenerarRespaldoActionPerformed

    private void mniPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPortadaActionPerformed
        
        itfPortada portada = new itfPortada();
        this.escritorio.add(portada);
        portada.setVisible(true);
        
    }//GEN-LAST:event_mniPortadaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jmnAchivo;
    private javax.swing.JMenu jmnAyuda;
    private javax.swing.JMenu jmnBaseDatos;
    private javax.swing.JMenuItem jmnCambiarPass;
    private javax.swing.JMenu jmnCatalogos;
    private javax.swing.JMenu jmnHerramientas;
    private javax.swing.JMenu jmnPortafolio;
    private javax.swing.JMenu jmnReportes;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniAlumnos;
    private javax.swing.JMenuItem mniAsignaturas;
    private javax.swing.JMenuItem mniCerrarSesion;
    private javax.swing.JMenuItem mniDocentes;
    private javax.swing.JMenuItem mniEvaluaciones;
    private javax.swing.JMenuItem mniGenerarPortafolio;
    private javax.swing.JMenuItem mniGenerarRespaldo;
    private javax.swing.JMenuItem mniHorario;
    private javax.swing.JMenuItem mniIndice;
    private javax.swing.JMenuItem mniLista;
    private javax.swing.JMenuItem mniPlanCuatrimestral;
    private javax.swing.JMenuItem mniPortada;
    private javax.swing.JMenuItem mniProgramaEducativo;
    private javax.swing.JMenuItem mniReportes;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniSeguimiento;
    private javax.swing.JMenuItem mniSubirRespaldo;
    private javax.swing.JMenuItem mniTemas;
    private javax.swing.JPanel pnlEncabezado;
    // End of variables declaration//GEN-END:variables
}