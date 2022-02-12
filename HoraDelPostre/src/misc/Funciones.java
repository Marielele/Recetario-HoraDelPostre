/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import Vistas.Inicio;
import Vistas.PaneAviso;
import Vistas.PanelIngredientes;
import Vistas.PanelProcedimiento;
import Vistas.PanelUtensilios;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class Funciones {

    public String carpetaPrincipal = "C:\\Documentos\\Recetas_Hora_del_postre";
    public String recetaReciente = "\\Listado.txt";
    RecetaClase recetaSelec = null;

    //Crea la carpeta principal donde se guardaran las recetas
    public void creaCarpeta() {
        File crearCarpeta = new File(carpetaPrincipal);
        File archivoReciente = new File(carpetaPrincipal + recetaReciente);

        if (!crearCarpeta.exists()) {
            crearCarpeta.mkdirs();
        }
        if (!archivoReciente.exists()) {
            try {
                archivoReciente.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Crea la receta y la guarda en una carpeta con archivos
    public void crearReceta(String nombre, String ingredientes, String utensilios, String procedimento, String rutaImagen, JDialog ventana) {
        String nombreCarpeta = "\\" + nombre;
        String aIngredientes = "\\Ingredientes.txt";
        String aUtensilios = "\\Utensilios.txt";
        String aProcedimiento = "\\Procedimiento.txt";
        String png = "\\imagen.png";
        String jpg = "\\imagen.jpg";
        String jpeg = "\\imagen.jpeg";
        File nuevaCarpeta = new File(carpetaPrincipal + nombreCarpeta);
        Path origenPath = Paths.get(rutaImagen);
        Path destinoPathJPG = Paths.get(carpetaPrincipal + nombreCarpeta + jpg);
        Path destinoPathPNG = Paths.get(carpetaPrincipal + nombreCarpeta + png);
        Path destinoPathJPEG = Paths.get(carpetaPrincipal + nombreCarpeta + jpeg);
        String formato = rutaImagen.substring(rutaImagen.length() - 3);

        if (!nuevaCarpeta.exists()) {
            nuevaCarpeta.mkdirs();
            try {
                FileWriter nIngredientes = new FileWriter(carpetaPrincipal + nombreCarpeta + aIngredientes);
                nIngredientes.write(ingredientes);
                nIngredientes.close();
                FileWriter nUtensilios = new FileWriter(carpetaPrincipal + nombreCarpeta + aUtensilios);
                nUtensilios.write(utensilios);
                nUtensilios.close();
                FileWriter nProcedimiento = new FileWriter(carpetaPrincipal + nombreCarpeta + aProcedimiento);
                nProcedimiento.write(procedimento);
                nProcedimiento.close();

                if (formato.contains("JPG") || formato.contains("jpg")) {
                    Files.copy(origenPath, destinoPathJPG, StandardCopyOption.REPLACE_EXISTING);
                } else if (formato.contains("PNG") || formato.contains("png")) {
                    Files.copy(origenPath, destinoPathPNG, StandardCopyOption.REPLACE_EXISTING);
                } else {
                    Files.copy(origenPath, destinoPathJPEG, StandardCopyOption.REPLACE_EXISTING);
                }

            } catch (IOException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            AvisoPane("Exito", "Receta creada");
        } else {
            AvisoPane("Error", "La receta no se pudo crear");
        }
    }

    //Agrega la receta al txt de la lista de recetas
    public void agregarRecetaAListado(String titulo) {
        try {
            FileWriter listado = new FileWriter(carpetaPrincipal + recetaReciente, true);
            listado.write(titulo);
            listado.write("\n");
            listado.close();
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Para reescribir la imagen ya existente de la carpeta
    public void EditarImagen(String receta, String rutaImagen) {
        String nombreCarpeta = "\\" + receta;
        String png = "\\imagen.png";
        String jpg = "\\imagen.jpg";
        String jpeg = "\\imagen.jpeg";
        Path origenPath = Paths.get(rutaImagen);
        Path destinoPathJPG = Paths.get(carpetaPrincipal + nombreCarpeta + jpg);
        Path destinoPathPNG = Paths.get(carpetaPrincipal + nombreCarpeta + png);
        Path destinoPathJPEG = Paths.get(carpetaPrincipal + nombreCarpeta + jpeg);
        String formato = rutaImagen.substring(rutaImagen.length() - 3);

        try {
            if (formato.contains("JPG") || formato.contains("jpg")) {
                Files.copy(origenPath, destinoPathJPG, StandardCopyOption.REPLACE_EXISTING);
                Files.deleteIfExists(destinoPathJPEG);
                Files.deleteIfExists(destinoPathPNG);
            } else if (formato.contains("PNG") || formato.contains("png")) {
                Files.copy(origenPath, destinoPathPNG, StandardCopyOption.REPLACE_EXISTING);
                Files.deleteIfExists(destinoPathJPEG);
                Files.deleteIfExists(destinoPathJPG);
            } else {
                Files.copy(origenPath, destinoPathJPEG, StandardCopyOption.REPLACE_EXISTING);
                Files.deleteIfExists(destinoPathPNG);
                Files.deleteIfExists(destinoPathJPG);
            }

        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Lee la lista que contiene todas las recetas
    public void LeerLista(JList lista) {
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
                lista.setModel(listilla);
            } else {
                while ((info = bf.readLine()) != null) {
                    listilla.addElement(info);
                }
                lista.setModel(listilla);
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

    public RecetaClase VerReceta(String nombre) {
        File fileIng = null;
        File fileUten = null;
        File fileProc = null;
        try {
            String rutaCarpeta = carpetaPrincipal + "\\" + nombre;
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

            String nombRec = nombre;
            String ingRec = new String(Files.readAllBytes(Paths.get(rutaIng)));
            String utenRec = new String(Files.readAllBytes(Paths.get(rutaUten)));
            String procRec = new String(Files.readAllBytes(Paths.get(rutaProc)));

            if (imgJPG.exists()) {
                recetaSelec = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenJPG);
            } else if (imgPNG.exists()) {
                recetaSelec = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenPNG);
            } else {
                recetaSelec = new RecetaClase(nombRec, ingRec, utenRec, procRec, rutaImagenJPEG);
            }

        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recetaSelec;

    }

    public String getCarpetaPrincipal() {
        return carpetaPrincipal;
    }

    //Para cambiar paneles en un mismo frame o dialog
    public void CambiarPagina(JPanel pan, JPanel panContent) {
        pan.setSize(451, 378);
        pan.setLocation(0, 0);
        panContent.removeAll();
        panContent.add(pan, BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();
    }

    public void EditarIngredientes(String nombreReceta, JTextArea jta) {
        String ruta = carpetaPrincipal + "\\" + nombreReceta;
        try {
            FileWriter recipeI = new FileWriter(ruta + "\\Ingredientes.txt", false);
            recipeI.write(jta.getText());
            recipeI.close();
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EditarUtensilios(String nombreReceta, JTextArea jta) {
        String ruta = carpetaPrincipal + "\\" + nombreReceta;
        try {
            FileWriter recipeU = new FileWriter(ruta + "\\Utensilios.txt", false);
            recipeU.write(jta.getText());
            recipeU.close();
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EditarProcedimiento(String nombreReceta, JTextArea jta) {
        String ruta = carpetaPrincipal + "\\" + nombreReceta;
        try {
            FileWriter recipeP = new FileWriter(ruta + "\\Procedimiento.txt", false);
            recipeP.write(jta.getText());
            recipeP.close();
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AvisoPane(String Titulo, String Contenido) {
        Inicio in = new Inicio();
        PaneAviso pa = new PaneAviso(in, true);
        pa.jlTitulo.setText(Titulo);
        pa.jlContenido.setText(Contenido);
        pa.setLocationRelativeTo(null);
        pa.setVisible(true);
    }
    

}
