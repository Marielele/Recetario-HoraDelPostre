/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import misc.Funciones;
import misc.RecetaClase;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class PanelProcedimiento extends javax.swing.JPanel {

    /**
     * Creates new form PanelProcedimiento
     */
    public PanelProcedimiento() {
        initComponents();
        Funciones f = new Funciones();
        String nombreReceta = VerRecetas.jlListaRecetas.getSelectedValue();
        RecetaClase recetaSelec = f.VerReceta(nombreReceta);
        jtaProcedimientos.setText(recetaSelec.getProcedimiento());
        jtaProcedimientos.setEditable(false);
        jpBtnGuardar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBtnEditar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaProcedimientos = new javax.swing.JTextArea();
        jpBtnGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 220));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBtnEditar.setBackground(new java.awt.Color(221, 108, 142));
        jpBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBtnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBtnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBtnEditarMouseExited(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("✏︎");

        javax.swing.GroupLayout jpBtnEditarLayout = new javax.swing.GroupLayout(jpBtnEditar);
        jpBtnEditar.setLayout(jpBtnEditarLayout);
        jpBtnEditarLayout.setHorizontalGroup(
            jpBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnEditarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBtnEditarLayout.setVerticalGroup(
            jpBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnEditarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpBtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 30, -1));

        jtaProcedimientos.setColumns(20);
        jtaProcedimientos.setRows(5);
        jScrollPane1.setViewportView(jtaProcedimientos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 410, 370));

        jpBtnGuardar.setBackground(new java.awt.Color(221, 108, 142));
        jpBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBtnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBtnGuardarMouseExited(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("✔");

        javax.swing.GroupLayout jpBtnGuardarLayout = new javax.swing.GroupLayout(jpBtnGuardar);
        jpBtnGuardar.setLayout(jpBtnGuardarLayout);
        jpBtnGuardarLayout.setHorizontalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBtnGuardarLayout.setVerticalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 30, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jpBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnEditarMouseClicked
        jtaProcedimientos.setEditable(true);
        jpBtnGuardar.setVisible(true);
    }//GEN-LAST:event_jpBtnEditarMouseClicked

    private void jpBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnGuardarMouseClicked
        Funciones f = new Funciones();
        String nombreReceta = VerRecetas.jlListaRecetas.getSelectedValue();
        RecetaClase recetaSelec = f.VerReceta(nombreReceta);
        f.EditarIngredientes(recetaSelec.getTitulo(), jtaProcedimientos);
        f.AvisoPane("Exito", "Se ha modificado el procedimiento de: " + recetaSelec.getTitulo());
    }//GEN-LAST:event_jpBtnGuardarMouseClicked

    private void jpBtnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnEditarMouseEntered
        jpBtnEditar.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpBtnEditarMouseEntered

    private void jpBtnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnEditarMouseExited
        jpBtnEditar.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpBtnEditarMouseExited

    private void jpBtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnGuardarMouseEntered
        jpBtnGuardar.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpBtnGuardarMouseEntered

    private void jpBtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnGuardarMouseExited
        jpBtnGuardar.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpBtnGuardarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBtnEditar;
    private javax.swing.JPanel jpBtnGuardar;
    private javax.swing.JTextArea jtaProcedimientos;
    // End of variables declaration//GEN-END:variables
}
