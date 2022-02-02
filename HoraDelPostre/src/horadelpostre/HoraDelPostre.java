/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadelpostre;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class HoraDelPostre {

    public String carpetaPrincipal = "D:\\Documents\\Recetas_Hora_del_postre";
    public String recetaReciente = "\\Listado.txt";

    public static void main(String[] args) {
        String rutaImagenJPG = "D:\\Documents\\Recetas_Hora_del_postre\\Quesadilla con queso\\imagen.jpg";
        String rutaImagenPNG = "D:\\Documents\\Recetas_Hora_del_postre\\Quesadilla con queso\\imagen.png";
        String rutaImagenJPEG = "D:\\Documents\\Recetas_Hora_del_postre\\Quesadilla con queso\\imagen.jpeg";
        File imgPNG = new File(rutaImagenPNG);
        File imgJPG = new File(rutaImagenJPG);
        File imgJPEG = new File(rutaImagenJPEG);

        if (imgJPG.exists()) {
            JOptionPane.showMessageDialog(null, "Es una imagen jpg");
        } else if (imgPNG.exists()) {
            JOptionPane.showMessageDialog(null, "Es una imagen png");
        } else {
            JOptionPane.showMessageDialog(null, "Es una imagen jpeg");
        }
    }

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
                Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void crearReceta(String nombre, String ingredientes, String utensilios, String procedimento, String rutaImagen) {
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
                Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Receta " + nombre + " creada");
        } else {
            JOptionPane.showMessageDialog(null, "Receta ya existente");
        }
    }

    public void agregarRecetaAListado(String titulo) {
        try {
            FileWriter listado = new FileWriter(carpetaPrincipal + recetaReciente, true);
            listado.write(titulo);
            listado.write("\n");
            listado.close();
        } catch (IOException ex) {
            Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            } else if (formato.contains("PNG") || formato.contains("png")) {
                Files.copy(origenPath, destinoPathPNG, StandardCopyOption.REPLACE_EXISTING);
            } else {
                Files.copy(origenPath, destinoPathJPEG, StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException ex) {
            Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
