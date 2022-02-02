/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import misc.RecetaClase;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class Dashboard extends javax.swing.JFrame {

    int xMouse, yMouse;
    RecetaClase recetaActiva = null;
    String carpetaPrincipal = "D:\\Documents\\Recetas_Hora_del_postre";

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        LeerLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jpBarraprimaria = new javax.swing.JPanel();
        jpCerrar = new javax.swing.JPanel();
        jlX = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        jlMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpNuevaReceta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpVerReceta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpActualizarLista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlRecetas = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel("Hora del postre", SwingConstants.CENTER);
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpFondo.setBackground(new java.awt.Color(248, 229, 235));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBarraprimaria.setBackground(new java.awt.Color(248, 229, 235));
        jpBarraprimaria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraprimariaMouseDragged(evt);
            }
        });
        jpBarraprimaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraprimariaMousePressed(evt);
            }
        });

        jpCerrar.setBackground(new java.awt.Color(248, 229, 235));
        jpCerrar.setToolTipText("Cerrar");
        jpCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCerrarMouseExited(evt);
            }
        });

        jlX.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jlX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlX.setText("X");

        javax.swing.GroupLayout jpCerrarLayout = new javax.swing.GroupLayout(jpCerrar);
        jpCerrar.setLayout(jpCerrarLayout);
        jpCerrarLayout.setHorizontalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        jpCerrarLayout.setVerticalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jpMinimizar.setBackground(new java.awt.Color(248, 229, 235));
        jpMinimizar.setToolTipText("Minimizar");
        jpMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpMinimizarMouseExited(evt);
            }
        });

        jlMin.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jlMin.setText("—");

        javax.swing.GroupLayout jpMinimizarLayout = new javax.swing.GroupLayout(jpMinimizar);
        jpMinimizar.setLayout(jpMinimizarLayout);
        jpMinimizarLayout.setHorizontalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlMin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMinimizarLayout.setVerticalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBarraprimariaLayout = new javax.swing.GroupLayout(jpBarraprimaria);
        jpBarraprimaria.setLayout(jpBarraprimariaLayout);
        jpBarraprimariaLayout.setHorizontalGroup(
            jpBarraprimariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraprimariaLayout.createSequentialGroup()
                .addGap(0, 725, Short.MAX_VALUE)
                .addComponent(jpMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBarraprimariaLayout.setVerticalGroup(
            jpBarraprimariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraprimariaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpBarraprimariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jpFondo.add(jpBarraprimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel2.setBackground(new java.awt.Color(255, 248, 248));

        jpNuevaReceta.setBackground(new java.awt.Color(197, 205, 208));
        jpNuevaReceta.setToolTipText("Agregar receta");
        jpNuevaReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpNuevaReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpNuevaRecetaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpNuevaRecetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpNuevaRecetaMouseExited(evt);
            }
        });

        jLabel2.setText("➕");

        javax.swing.GroupLayout jpNuevaRecetaLayout = new javax.swing.GroupLayout(jpNuevaReceta);
        jpNuevaReceta.setLayout(jpNuevaRecetaLayout);
        jpNuevaRecetaLayout.setHorizontalGroup(
            jpNuevaRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevaRecetaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpNuevaRecetaLayout.setVerticalGroup(
            jpNuevaRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jpVerReceta.setBackground(new java.awt.Color(197, 205, 208));
        jpVerReceta.setToolTipText("Ver receta");
        jpVerReceta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpVerReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpVerRecetaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpVerRecetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpVerRecetaMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(197, 205, 208));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("►");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpVerRecetaLayout = new javax.swing.GroupLayout(jpVerReceta);
        jpVerReceta.setLayout(jpVerRecetaLayout);
        jpVerRecetaLayout.setHorizontalGroup(
            jpVerRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVerRecetaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jpVerRecetaLayout.setVerticalGroup(
            jpVerRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jpActualizarLista.setBackground(new java.awt.Color(197, 205, 208));
        jpActualizarLista.setToolTipText("Actualizar");
        jpActualizarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpActualizarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpActualizarListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpActualizarListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpActualizarListaMouseExited(evt);
            }
        });

        jLabel1.setText("🔄");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpActualizarListaLayout = new javax.swing.GroupLayout(jpActualizarLista);
        jpActualizarLista.setLayout(jpActualizarListaLayout);
        jpActualizarListaLayout.setHorizontalGroup(
            jpActualizarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActualizarListaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jpActualizarListaLayout.setVerticalGroup(
            jpActualizarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jlRecetas.setBackground(new java.awt.Color(255, 248, 248));
        jlRecetas.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jlRecetas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpNuevaReceta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpActualizarLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jpVerReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(245, 245, 245))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpActualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpNuevaReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpVerReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jpFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 460));

        jPanel3.setBackground(new java.awt.Color(248, 229, 235));

        jlTitulo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(80, 77, 73));
        jlTitulo.setText("Hora del postre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addGap(250, 250, 250))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jpFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LeerLista() {
        File listado = null;
        FileReader fr = null;
        BufferedReader bf = null;
        try {
            String ruta = carpetaPrincipal + "\\Listado.txt";
            listado = new File(ruta);
            fr = new FileReader(listado);
            bf = new BufferedReader(fr);
            String info;
            DefaultListModel listilla = new DefaultListModel();
            if (listado.length() == 0) {
                listilla.addElement("No hay recetas.");
                jlRecetas.setModel(listilla);
            } else {
                while ((info = bf.readLine()) != null) {
                    listilla.addElement(info);
                }
                jlRecetas.setModel(listilla);
            }
        } catch (Exception e) {

        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }

    private void jpBarraprimariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraprimariaMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraprimariaMousePressed

    private void jpBarraprimariaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraprimariaMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraprimariaMouseDragged

    private void jpCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jpCerrarMouseClicked

    private void jpCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseEntered
        // TODO add your handling code here:
        jpCerrar.setBackground(Color.RED);
        jlX.setForeground(Color.white);
    }//GEN-LAST:event_jpCerrarMouseEntered

    private void jpCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseExited
        // TODO add your handling code here:
        jpCerrar.setBackground(Color.decode("#f8e5eb"));
        jlX.setForeground(Color.black);
    }//GEN-LAST:event_jpCerrarMouseExited

    private void jpMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jpMinimizarMouseClicked

    private void jpMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimizarMouseEntered
        // TODO add your handling code here:
        jpMinimizar.setBackground(Color.decode("#d1cbcd"));
        jlMin.setForeground(Color.white);
    }//GEN-LAST:event_jpMinimizarMouseEntered

    private void jpMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMinimizarMouseExited
        // TODO add your handling code here:
        jpMinimizar.setBackground(Color.decode("#f8e5eb"));
        jlMin.setForeground(Color.black);
    }//GEN-LAST:event_jpMinimizarMouseExited

    private void jpActualizarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarListaMouseClicked
        // TODO add your handling code here:
        LeerLista();
    }//GEN-LAST:event_jpActualizarListaMouseClicked

    private void jpVerRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerRecetaMouseClicked
        if (jlRecetas.isSelectionEmpty()) {
            
        } else {
            String valor = jlRecetas.getSelectedValue();
            DetallesReceta dr = new DetallesReceta();
            dr.setVisible(true);
        }
    }//GEN-LAST:event_jpVerRecetaMouseClicked

    private void jpNuevaRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevaRecetaMouseClicked
        NuevaReceta nr = new NuevaReceta();
        nr.setVisible(true);
    }//GEN-LAST:event_jpNuevaRecetaMouseClicked

    private void jpActualizarListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarListaMouseEntered
        jpActualizarLista.setBackground(Color.decode("#ebebeb"));
    }//GEN-LAST:event_jpActualizarListaMouseEntered

    private void jpNuevaRecetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevaRecetaMouseEntered
        jpNuevaReceta.setBackground(Color.decode("#ebebeb"));
    }//GEN-LAST:event_jpNuevaRecetaMouseEntered

    private void jpVerRecetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerRecetaMouseEntered
        jpVerReceta.setBackground(Color.decode("#ebebeb"));
    }//GEN-LAST:event_jpVerRecetaMouseEntered

    private void jpNuevaRecetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpNuevaRecetaMouseExited
        jpNuevaReceta.setBackground(Color.decode("#c5cdd0"));
    }//GEN-LAST:event_jpNuevaRecetaMouseExited

    private void jpActualizarListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpActualizarListaMouseExited
       jpActualizarLista.setBackground(Color.decode("#c5cdd0"));
    }//GEN-LAST:event_jpActualizarListaMouseExited

    private void jpVerRecetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerRecetaMouseExited
        jpVerReceta.setBackground(Color.decode("#c5cdd0"));
    }//GEN-LAST:event_jpVerRecetaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlMin;
    public static javax.swing.JList<String> jlRecetas;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlX;
    private javax.swing.JPanel jpActualizarLista;
    private javax.swing.JPanel jpBarraprimaria;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JPanel jpNuevaReceta;
    private javax.swing.JPanel jpVerReceta;
    // End of variables declaration//GEN-END:variables
}
