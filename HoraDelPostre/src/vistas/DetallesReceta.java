/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import horadelpostre.HoraDelPostre;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import misc.RecetaClase;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class DetallesReceta extends javax.swing.JFrame {

    int xMouse, yMouse;
    RecetaClase recetaActiva = null;
    String carpetaPrincipal = "D:\\Documents\\Recetas_Hora_del_postre";

    /**
     * Creates new form DetallesReceta
     */
    public DetallesReceta() {
        initComponents();
        Ingredients in = new Ingredients();
        CambiarPagina(in);
        String tituloReceta = Dashboard.jlRecetas.getSelectedValue();
        RecetaAVer(tituloReceta);
        jlTitulo.setText(tituloReceta);
        ImageIcon imagen = new ImageIcon(recetaActiva.getImagen());
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                jlImagen.getWidth(),
                jlImagen.getHeight(),
                Image.SCALE_DEFAULT));
        jlImagen.setIcon(icono);
        jtfRutaImagen.setText(recetaActiva.getImagen());
        jPanel1.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void CambiarPagina(JPanel pan) {
        pan.setSize(562, 447);
        pan.setLocation(0, 0);
        jpContent.removeAll();
        jpContent.add(pan, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }

    public void RecetaAVer(String recetaSelect) {
        File fileIng = null;
        File fileUten = null;
        File fileProc = null;

        try {
            String rutaCarpeta = carpetaPrincipal + "\\" + recetaSelect;
            String rutaIng = rutaCarpeta + "\\Ingredientes.txt";
            String rutaUten = rutaCarpeta + "\\Utensilios.txt";
            String rutaProc = rutaCarpeta + "\\Procedimiento.txt";
            String rutaImagenJPG = rutaCarpeta + "\\imagen.jpg";
            String rutaImagenPNG = rutaCarpeta + "\\imagen.png";
            String rutaImagenJPEG = rutaCarpeta + "\\imagen.jpeg";
            fileIng = new File(rutaIng);
            fileUten = new File(rutaUten);
            fileProc = new File(rutaProc);
            File imgPNG = new File(rutaImagenPNG);
            File imgJPG = new File(rutaImagenJPG);
            File imgJPEG = new File(rutaImagenJPEG);

            String nombRec = recetaSelect;
            String ingRec = new String(Files.readAllBytes(Paths.get(rutaIng)));
            String utenRec = new String(Files.readAllBytes(Paths.get(rutaUten)));
            String procRec = new String(Files.readAllBytes(Paths.get(rutaProc)));

            if (imgJPG.exists()) {
                recetaActiva = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenJPG);
            } else if (imgPNG.exists()) {
                recetaActiva = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenPNG);
            } else {
                recetaActiva = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenJPEG);
            }

        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jpBarraprimaria = new javax.swing.JPanel();
        jpCerrar = new javax.swing.JPanel();
        jlX = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        jlMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpIngredientes = new javax.swing.JPanel();
        jlIngredientes = new javax.swing.JLabel();
        jpUtensilios = new javax.swing.JPanel();
        jlUtensilios = new javax.swing.JLabel();
        jpProcedimiento = new javax.swing.JPanel();
        jlProcedimiento = new javax.swing.JLabel();
        jpContent = new javax.swing.JPanel();
        jpBotones = new javax.swing.JPanel();
        jtfRutaImagen = new javax.swing.JTextField();
        jpEditaragen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpGuardar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpBackground.setBackground(new java.awt.Color(248, 229, 235));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpBackground.add(jpBarraprimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel1.setBackground(new java.awt.Color(248, 229, 235));

        jlImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlTitulo.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(80, 77, 73));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("receta");

        jpIngredientes.setBackground(new java.awt.Color(255, 248, 248));
        jpIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpIngredientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpIngredientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpIngredientesMouseExited(evt);
            }
        });

        jlIngredientes.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jlIngredientes.setForeground(new java.awt.Color(80, 77, 73));
        jlIngredientes.setText("Ingredientes");

        javax.swing.GroupLayout jpIngredientesLayout = new javax.swing.GroupLayout(jpIngredientes);
        jpIngredientes.setLayout(jpIngredientesLayout);
        jpIngredientesLayout.setHorizontalGroup(
            jpIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIngredientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIngredientesLayout.setVerticalGroup(
            jpIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngredientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIngredientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpUtensilios.setBackground(new java.awt.Color(255, 248, 248));
        jpUtensilios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpUtensilios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpUtensiliosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUtensiliosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUtensiliosMouseExited(evt);
            }
        });

        jlUtensilios.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jlUtensilios.setForeground(new java.awt.Color(80, 77, 73));
        jlUtensilios.setText("Utensilios");

        javax.swing.GroupLayout jpUtensiliosLayout = new javax.swing.GroupLayout(jpUtensilios);
        jpUtensilios.setLayout(jpUtensiliosLayout);
        jpUtensiliosLayout.setHorizontalGroup(
            jpUtensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUtensiliosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUtensilios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpUtensiliosLayout.setVerticalGroup(
            jpUtensiliosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUtensiliosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUtensilios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpProcedimiento.setBackground(new java.awt.Color(255, 248, 248));
        jpProcedimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpProcedimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProcedimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProcedimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProcedimientoMouseExited(evt);
            }
        });

        jlProcedimiento.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jlProcedimiento.setForeground(new java.awt.Color(80, 77, 73));
        jlProcedimiento.setText("Procedimiento");

        javax.swing.GroupLayout jpProcedimientoLayout = new javax.swing.GroupLayout(jpProcedimiento);
        jpProcedimiento.setLayout(jpProcedimientoLayout);
        jpProcedimientoLayout.setHorizontalGroup(
            jpProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProcedimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlProcedimiento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpProcedimientoLayout.setVerticalGroup(
            jpProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProcedimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlProcedimiento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpContent.setBackground(new java.awt.Color(248, 229, 235));

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jpBotones.setBackground(new java.awt.Color(248, 229, 235));
        jpBotones.setLayout(null);

        jtfRutaImagen.setEditable(false);
        jtfRutaImagen.setBackground(new java.awt.Color(248, 229, 235));
        jtfRutaImagen.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 8)); // NOI18N
        jtfRutaImagen.setText("jTextField1");
        jtfRutaImagen.setBorder(null);
        jpBotones.add(jtfRutaImagen);
        jtfRutaImagen.setBounds(0, 0, 200, 20);

        jpEditaragen.setBackground(new java.awt.Color(197, 205, 208));
        jpEditaragen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpEditaragen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEditaragenMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar imagen");

        javax.swing.GroupLayout jpEditaragenLayout = new javax.swing.GroupLayout(jpEditaragen);
        jpEditaragen.setLayout(jpEditaragenLayout);
        jpEditaragenLayout.setHorizontalGroup(
            jpEditaragenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpEditaragenLayout.setVerticalGroup(
            jpEditaragenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditaragenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpGuardar.setBackground(new java.awt.Color(197, 205, 208));
        jpGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpGuardarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Guardar imagen");

        javax.swing.GroupLayout jpGuardarLayout = new javax.swing.GroupLayout(jpGuardar);
        jpGuardar.setLayout(jpGuardarLayout);
        jpGuardarLayout.setHorizontalGroup(
            jpGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpGuardarLayout.setVerticalGroup(
            jpGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEditaragen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jpUtensilios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addComponent(jpContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpUtensilios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpEditaragen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        jpBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jpBarraprimariaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraprimariaMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraprimariaMouseDragged

    private void jpBarraprimariaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraprimariaMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraprimariaMousePressed

    private void jpIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIngredientesMouseClicked
        Ingredients in = new Ingredients();
        CambiarPagina(in);
    }//GEN-LAST:event_jpIngredientesMouseClicked

    private void jpUtensiliosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUtensiliosMouseClicked
        Cookware ck = new Cookware();
        CambiarPagina(ck);
    }//GEN-LAST:event_jpUtensiliosMouseClicked

    private void jpProcedimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProcedimientoMouseClicked
        Process pr = new Process();
        CambiarPagina(pr);
    }//GEN-LAST:event_jpProcedimientoMouseClicked

    private void jpIngredientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIngredientesMouseEntered
        jpIngredientes.setBackground(Color.decode("#f8e5eb"));
        jlIngredientes.setForeground(Color.black);
    }//GEN-LAST:event_jpIngredientesMouseEntered

    private void jpIngredientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIngredientesMouseExited
        jpIngredientes.setBackground(Color.decode("#fff8f8"));
        jlIngredientes.setForeground(Color.decode("#504d49"));
    }//GEN-LAST:event_jpIngredientesMouseExited

    private void jpUtensiliosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUtensiliosMouseEntered
        jpUtensilios.setBackground(Color.decode("#f8e5eb"));
        jlUtensilios.setForeground(Color.black);
    }//GEN-LAST:event_jpUtensiliosMouseEntered

    private void jpUtensiliosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUtensiliosMouseExited
        jpUtensilios.setBackground(Color.decode("#fff8f8"));
        jlUtensilios.setForeground(Color.decode("#504d49"));
    }//GEN-LAST:event_jpUtensiliosMouseExited

    private void jpProcedimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProcedimientoMouseEntered
        jpProcedimiento.setBackground(Color.decode("#f8e5eb"));
        jlProcedimiento.setForeground(Color.black);
    }//GEN-LAST:event_jpProcedimientoMouseEntered

    private void jpProcedimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProcedimientoMouseExited
        jpProcedimiento.setBackground(Color.decode("#fff8f8"));
        jlProcedimiento.setForeground(Color.decode("#504d49"));
    }//GEN-LAST:event_jpProcedimientoMouseExited

    private void jpEditaragenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEditaragenMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "JPG", "JPEG", "PNG"));
        int selecion = fc.showOpenDialog(this);
        if (selecion == JFileChooser.APPROVE_OPTION) {
            File img = fc.getSelectedFile();
            jtfRutaImagen.setText(img.getAbsolutePath());
        }
    }//GEN-LAST:event_jpEditaragenMouseClicked

    private void jpGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuardarMouseClicked
        HoraDelPostre hdr = new HoraDelPostre();
        hdr.EditarImagen(jlTitulo.getText(), jtfRutaImagen.getText());
    }//GEN-LAST:event_jpGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(DetallesReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JLabel jlIngredientes;
    private javax.swing.JLabel jlMin;
    private javax.swing.JLabel jlProcedimiento;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUtensilios;
    private javax.swing.JLabel jlX;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpBarraprimaria;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCerrar;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpEditaragen;
    private javax.swing.JPanel jpGuardar;
    private javax.swing.JPanel jpIngredientes;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JPanel jpProcedimiento;
    private javax.swing.JPanel jpUtensilios;
    private javax.swing.JTextField jtfRutaImagen;
    // End of variables declaration//GEN-END:variables
}
