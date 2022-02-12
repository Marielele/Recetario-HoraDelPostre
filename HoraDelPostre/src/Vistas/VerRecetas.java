/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import misc.Funciones;
import misc.RecetaClase;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class VerRecetas extends javax.swing.JDialog {

    /**
     * Creates new form VerRecetas
     */
    public VerRecetas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Funciones f = new Funciones();
        f.LeerLista(jlListaRecetas);
        jlTituloReceta.setVisible(false);
        jpBtnEditar.setVisible(false);
        jpBtnIn.setVisible(false);
        jpBtnU.setVisible(false);
        jpBtnPro.setVisible(false);
        jtfRutaImagen.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jpBarra = new javax.swing.JPanel();
        jpCerrar = new javax.swing.JPanel();
        jlX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaRecetas = new javax.swing.JList<>();
        jpPanelReceta = new javax.swing.JPanel();
        jlTituloReceta = new javax.swing.JLabel();
        jpIUP = new javax.swing.JPanel();
        jlImg = new javax.swing.JLabel();
        jpBtnEditar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpBtnIn = new javax.swing.JPanel();
        jlI = new javax.swing.JLabel();
        jpBtnU = new javax.swing.JPanel();
        jlU = new javax.swing.JLabel();
        jpBtnPro = new javax.swing.JPanel();
        jlP = new javax.swing.JLabel();
        jpBtnGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        jtfRutaImagen = new javax.swing.JTextField();
        jpVer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 208, 220));

        jpBarra.setBackground(new java.awt.Color(255, 208, 220));
        jpBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCerrar.setBackground(new java.awt.Color(255, 208, 220));
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

        jlX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlX.setText("X");

        javax.swing.GroupLayout jpCerrarLayout = new javax.swing.GroupLayout(jpCerrar);
        jpCerrar.setLayout(jpCerrarLayout);
        jpCerrarLayout.setHorizontalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jpCerrarLayout.setVerticalGroup(
            jpCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarra.add(jpCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel2.setText("Ver recetas");
        jpBarra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 70, 30));

        jlListaRecetas.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jlListaRecetas);

        jpPanelReceta.setBackground(new java.awt.Color(255, 208, 220));

        jlTituloReceta.setFont(new java.awt.Font("Calisto MT", 0, 36)); // NOI18N
        jlTituloReceta.setText("[]");

        jpIUP.setBackground(new java.awt.Color(255, 208, 220));

        javax.swing.GroupLayout jpIUPLayout = new javax.swing.GroupLayout(jpIUP);
        jpIUP.setLayout(jpIUPLayout);
        jpIUPLayout.setHorizontalGroup(
            jpIUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jpIUPLayout.setVerticalGroup(
            jpIUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

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
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("✏︎");

        javax.swing.GroupLayout jpBtnEditarLayout = new javax.swing.GroupLayout(jpBtnEditar);
        jpBtnEditar.setLayout(jpBtnEditarLayout);
        jpBtnEditarLayout.setHorizontalGroup(
            jpBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnEditarLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBtnEditarLayout.setVerticalGroup(
            jpBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpBtnIn.setBackground(new java.awt.Color(221, 108, 142));
        jpBtnIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBtnInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBtnInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBtnInMouseExited(evt);
            }
        });

        jlI.setBackground(new java.awt.Color(221, 108, 142));
        jlI.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jlI.setForeground(new java.awt.Color(255, 255, 255));
        jlI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlI.setText("Ingredientes");

        javax.swing.GroupLayout jpBtnInLayout = new javax.swing.GroupLayout(jpBtnIn);
        jpBtnIn.setLayout(jpBtnInLayout);
        jpBtnInLayout.setHorizontalGroup(
            jpBtnInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlI, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        jpBtnInLayout.setVerticalGroup(
            jpBtnInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBtnU.setBackground(new java.awt.Color(221, 108, 142));
        jpBtnU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBtnUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBtnUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBtnUMouseExited(evt);
            }
        });

        jlU.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jlU.setForeground(new java.awt.Color(255, 255, 255));
        jlU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlU.setText("Utensilios");

        javax.swing.GroupLayout jpBtnULayout = new javax.swing.GroupLayout(jpBtnU);
        jpBtnU.setLayout(jpBtnULayout);
        jpBtnULayout.setHorizontalGroup(
            jpBtnULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlU, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        jpBtnULayout.setVerticalGroup(
            jpBtnULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnULayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlU, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBtnPro.setBackground(new java.awt.Color(221, 108, 142));
        jpBtnPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBtnProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBtnProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBtnProMouseExited(evt);
            }
        });

        jlP.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jlP.setForeground(new java.awt.Color(255, 255, 255));
        jlP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlP.setText("Procedimiento");

        javax.swing.GroupLayout jpBtnProLayout = new javax.swing.GroupLayout(jpBtnPro);
        jpBtnPro.setLayout(jpBtnProLayout);
        jpBtnProLayout.setHorizontalGroup(
            jpBtnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlP, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jpBtnProLayout.setVerticalGroup(
            jpBtnProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBtnProLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        jLabel5.setText("✓");

        javax.swing.GroupLayout jpBtnGuardarLayout = new javax.swing.GroupLayout(jpBtnGuardar);
        jpBtnGuardar.setLayout(jpBtnGuardarLayout);
        jpBtnGuardarLayout.setHorizontalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        jpBtnGuardarLayout.setVerticalGroup(
            jpBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpBotones.setBackground(new java.awt.Color(255, 208, 220));
        jpBotones.setLayout(null);

        jtfRutaImagen.setEditable(false);
        jtfRutaImagen.setBackground(new java.awt.Color(255, 208, 220));
        jtfRutaImagen.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 8)); // NOI18N
        jtfRutaImagen.setText("jTextField1");
        jtfRutaImagen.setBorder(null);
        jpBotones.add(jtfRutaImagen);
        jtfRutaImagen.setBounds(0, 0, 300, 20);

        javax.swing.GroupLayout jpPanelRecetaLayout = new javax.swing.GroupLayout(jpPanelReceta);
        jpPanelReceta.setLayout(jpPanelRecetaLayout);
        jpPanelRecetaLayout.setHorizontalGroup(
            jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                        .addGroup(jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                                .addComponent(jpBtnIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpBtnU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpBtnPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpIUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlTituloReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpPanelRecetaLayout.setVerticalGroup(
            jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTituloReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                        .addComponent(jlImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpPanelRecetaLayout.createSequentialGroup()
                        .addGroup(jpPanelRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpBtnIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpBtnU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpBtnPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIUP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpVer.setBackground(new java.awt.Color(221, 108, 142));
        jpVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpVerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpVerMouseExited(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("➤");

        javax.swing.GroupLayout jpVerLayout = new javax.swing.GroupLayout(jpVer);
        jpVer.setLayout(jpVerLayout);
        jpVerLayout.setHorizontalGroup(
            jpVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jpVerLayout.setVerticalGroup(
            jpVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPanelReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpPanelReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jpCerrarMouseClicked

    private void jpVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerMouseClicked
        if (jlListaRecetas.isSelectionEmpty()) {
            Funciones f = new Funciones();
            f.AvisoPane("Advertencia", "Seleccione la receta a visualizar");
        } else if(jlListaRecetas.getSelectedValue() == "No hay recetas.") {
            Funciones f = new Funciones();
            f.AvisoPane("Advertencia", "Cree una receta");
        }
        else{
            jlTituloReceta.setVisible(true);
            jpBtnEditar.setVisible(true);
            jpBtnIn.setVisible(true);
            jpBtnU.setVisible(true);
            jpBtnPro.setVisible(true);
            jtfRutaImagen.setVisible(true);
            jpBtnGuardar.setVisible(true);
            String valor = jlListaRecetas.getSelectedValue();
            Funciones f = new Funciones();
            f.VerReceta(valor);
            RecetaClase recetaSelec = f.VerReceta(valor);
            jlTituloReceta.setText(recetaSelec.getTitulo());
            ImageIcon imagen = new ImageIcon(recetaSelec.getImg());
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                    jlImg.getWidth(),
                    jlImg.getHeight(),
                    Image.SCALE_DEFAULT));
            jlImg.setIcon(icono);
            PanelIngredientes pi = new PanelIngredientes();
            f.CambiarPagina(pi, jpIUP);
            jtfRutaImagen.setText(recetaSelec.getImg());
        }
    }//GEN-LAST:event_jpVerMouseClicked

    private void jpBtnInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnInMouseClicked
        Funciones f = new Funciones();
        PanelIngredientes pi = new PanelIngredientes();
        f.CambiarPagina(pi, jpIUP);
    }//GEN-LAST:event_jpBtnInMouseClicked

    private void jpBtnUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnUMouseClicked
        Funciones f = new Funciones();
        PanelUtensilios pu = new PanelUtensilios();
        f.CambiarPagina(pu, jpIUP);
    }//GEN-LAST:event_jpBtnUMouseClicked

    private void jpBtnProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnProMouseClicked
        Funciones f = new Funciones();
        PanelProcedimiento pr = new PanelProcedimiento();
        f.CambiarPagina(pr, jpIUP);
    }//GEN-LAST:event_jpBtnProMouseClicked

    private void jpBtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnEditarMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "JPG", "JPEG", "PNG"));
        int selecion = fc.showOpenDialog(this);
        if (selecion == JFileChooser.APPROVE_OPTION) {
            File img = fc.getSelectedFile();
            jtfRutaImagen.setText(img.getAbsolutePath());
            ImageIcon imagen = new ImageIcon(jtfRutaImagen.getText());
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                    jlImg.getWidth(),
                    jlImg.getHeight(),
                    Image.SCALE_DEFAULT));
            jlImg.setIcon(icono);
        }
    }//GEN-LAST:event_jpBtnEditarMouseClicked

    private void jpBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnGuardarMouseClicked
        Funciones f = new Funciones();
        f.EditarImagen(jlTituloReceta.getText(), jtfRutaImagen.getText());
        f.AvisoPane("Exito", "Se ha modificado la imagen");
    }//GEN-LAST:event_jpBtnGuardarMouseClicked

    private void jpBtnInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnInMouseEntered
        jpBtnIn.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpBtnInMouseEntered

    private void jpBtnInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnInMouseExited
        jpBtnIn.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpBtnInMouseExited

    private void jpBtnUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnUMouseEntered
        jpBtnU.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpBtnUMouseEntered

    private void jpBtnUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnUMouseExited
        jpBtnU.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpBtnUMouseExited

    private void jpBtnProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnProMouseEntered
        jpBtnPro.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpBtnProMouseEntered

    private void jpBtnProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBtnProMouseExited
        jpBtnPro.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpBtnProMouseExited

    private void jpVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerMouseEntered
        jpVer.setBackground(Color.decode("#A6576E"));
    }//GEN-LAST:event_jpVerMouseEntered

    private void jpVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVerMouseExited
        jpVer.setBackground(Color.decode("#DD6C8E"));
    }//GEN-LAST:event_jpVerMouseExited

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

    private void jpCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseEntered
        jpCerrar.setBackground(Color.red);
        jlX.setForeground(Color.white);
    }//GEN-LAST:event_jpCerrarMouseEntered

    private void jpCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCerrarMouseExited
        jpCerrar.setBackground(Color.decode("#FFD0DC"));
        jlX.setForeground(Color.black);
    }//GEN-LAST:event_jpCerrarMouseExited

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
            java.util.logging.Logger.getLogger(VerRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerRecetas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerRecetas dialog = new VerRecetas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlI;
    private javax.swing.JLabel jlImg;
    public static javax.swing.JList<String> jlListaRecetas;
    private javax.swing.JLabel jlP;
    private javax.swing.JLabel jlTituloReceta;
    private javax.swing.JLabel jlU;
    private javax.swing.JLabel jlX;
    private javax.swing.JPanel jpBarra;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpBtnEditar;
    private javax.swing.JPanel jpBtnGuardar;
    private javax.swing.JPanel jpBtnIn;
    private javax.swing.JPanel jpBtnPro;
    private javax.swing.JPanel jpBtnU;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JPanel jpIUP;
    private javax.swing.JPanel jpPanelReceta;
    private javax.swing.JPanel jpVer;
    private javax.swing.JTextField jtfRutaImagen;
    // End of variables declaration//GEN-END:variables

}
